package Test.model.User;


import Test.GetAndDatabase.Database;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class UserDAO {
    public Collection<User> FindByUsername() throws SQLException {
        ResultSet result = Database.getInstance().executeQuery("select * from user ");
        Collection<User> user = new ArrayList<>();
        while (result.next()) {
            User user1 = new User();
            user1.setName(result.getString("name"));
            user1.setCodemeli(result.getInt("codemeli"));
            user1.setFather_name(result.getString("father_name"));
            user1.setAddress(result.getString("address"));


            user.add(user1);


        }
        return user;
    }
    public void save(User user) throws SQLException {
        ResultSet result = Database.getInstance()
                .executeQuery("select * from user where name = '" + user.getName() + "'");

        if (result.next()) {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("UPDATE user\n" +
                            "SET codemeli = ?, father_name= ?, address=?\n" +
                            "WHERE name = ?");

            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getCodemeli());
            preparedStatement.setString(3, user.getFather_name());
            preparedStatement.setString(4, user.getAddress());
            preparedStatement.executeUpdate();
        }
        else {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("insert into user values (default, ?, ?, ?,?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getCodemeli());
            preparedStatement.setString(3, user.getFather_name());
            preparedStatement.setString(4, user.getAddress());


            preparedStatement.executeUpdate();
        }
    }
    public void delete(User user) throws SQLException {
        Database.getInstance()
                .prepareStatement("DELETE FROM user WHERE name = '" + user.getName() + "'")
                .executeUpdate();
    }


    private UserDAO(){}

    private static final UserDAO instance = new UserDAO();

    public static UserDAO getInstance() {
        return instance;
    }
}
