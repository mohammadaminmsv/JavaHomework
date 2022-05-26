package Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class UserDAO {



    private UserDAO(){}

    private static final UserDAO instance = new UserDAO();

    public static UserDAO getInstance() {
        return instance;
    }


    public void save(User user) throws SQLException {
        ResultSet result = Database.getInstance()
                .executeQuery("select * from user where username = '" + user.getUsername() + "'");

        if (result.next()) {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("UPDATE user\n" +
                            "SET Password=?,Code = ?, Email= ?,Age= ?,Education= ?\n" +
                            "WHERE Username = ?");

            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setInt(3,user.getCode());
            preparedStatement.setString(4,user.getEmail());
            preparedStatement.setInt(5,user.getAge());
            preparedStatement.setString(6,user.getEducation());

            preparedStatement.executeUpdate();
        }
        else {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("insert into user values (default, ?, ?, ?, ?,?,?)");
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setInt(3, user.getCode());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setInt(5,user.getAge());
            preparedStatement.setString(6, user.getEducation());

            preparedStatement.executeUpdate();
        }
    }
    public void delete(User user) throws SQLException {
        Database.getInstance()
                .prepareStatement("DELETE FROM user WHERE username = '" + user.getUsername() + "'")
                .executeUpdate();
    }



}

