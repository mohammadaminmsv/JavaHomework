package Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class USERDAO {
    public Optional<User> findByUsername(String username) throws SQLException {
        ResultSet result = Database.getInstance().executeQuery("select * from user where username = '" + username + "'");
        User user = null;
        if (result.next()) {
            user = new User();
            user.setName(result.getString("name"));
            user.setEmail(result.getString("email"));
            user.setUsername(result.getString("username"));
            user.setPassword(result.getString("password"));
        }
        return Optional.ofNullable(user);
    }
    public void save(User user) throws SQLException {
        ResultSet result = Database.getInstance()
                .executeQuery("select * from user where username = '" + user.getUsername() + "'");

        if (result.next()) {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("UPDATE user\n" +
                            "SET name = ?, email= ?\n" +
                            "WHERE username = ?");

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.executeUpdate();
        }
        else {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("insert into user values (default, ?, ?, ?, ?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.executeUpdate();
        }
    }
    public void delete(User user) throws SQLException {
        Database.getInstance()
                .prepareStatement("DELETE FROM user WHERE username = '" + user.getUsername() + "'")
                .executeUpdate();
    }


    private USERDAO(){}

    private static final USERDAO instance = new USERDAO();

    public static USERDAO getInstance() {
        return instance;
    }
}
