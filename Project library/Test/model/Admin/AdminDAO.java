package Test.model.Admin;





import Test.GetAndDatabase.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class AdminDAO {

        public Optional<Admin> FindByName(String name) throws SQLException {
            ResultSet result = Database.getInstance().executeQuery("select * from admin where name = '" + name + "'");
            Admin admin = null;
            if (result.next()) {
                admin = new Admin();
                admin.setName(result.getString("name"));
                admin.setAdmincode(result.getInt("admincode"));
                admin.setLastname(result.getString("lastname"));
                admin.setPassword(result.getInt("password"));

            }
            return Optional.ofNullable(admin);
        }
        public void save(Admin admin) throws SQLException {
            ResultSet result = Database.getInstance()
                    .executeQuery("select * from admin where name = '" + admin.getName() + "'");

            if (result.next()) {
                PreparedStatement preparedStatement = Database.getInstance()
                        .prepareStatement("UPDATE admin\n" +
                                "SET admincode = ?, lastname= ?, password=?\n" +
                                "WHERE name = ?");

                preparedStatement.setString(1, admin.getName());
                preparedStatement.setInt(2, admin.getAdmincode());
                preparedStatement.setString(3, admin.getLastname());
                preparedStatement.setInt(4, admin.getPassword());
                preparedStatement.executeUpdate();
            }
            else {
                PreparedStatement preparedStatement = Database.getInstance()
                        .prepareStatement("insert into admin values (default, ?, ?, ?,?)");
                preparedStatement.setString(1, admin.getName());
                preparedStatement.setInt(2, admin.getAdmincode());
                preparedStatement.setString(3, admin.getLastname());
                preparedStatement.setInt(4, admin.getPassword());
                preparedStatement.executeUpdate();

            }
        }
        public void delete(Admin admin) throws SQLException {
            Database.getInstance()
                    .prepareStatement("DELETE FROM admin WHERE username = '" + admin.getName() + "'")
                    .executeUpdate();
        }


        private AdminDAO(){}

        private static final AdminDAO instance = new AdminDAO();

        public static AdminDAO getInstance() {
            return instance;
        }
    }


