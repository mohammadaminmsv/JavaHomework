package Test.Controller;

import Test.GetAndDatabase.Database;
import Test.In;
import Test.model.Admin.Admin;
import Test.model.Book.Book;
import Test.model.Book.BookDetail;
import Test.model.User.User;
import Test.model.User.UserDAO;
import Test.model.User.UserDetail;
import Test.model.relation.Relation;
import Test.model.relation.RelationDAO;

import java.sql.SQLException;

public class UserController {
    private UserController(){}
    private static final UserController instance = new UserController();
    public static UserController getInstance() {
        return instance;
    }

    public void ShowUser() throws SQLException {
        User user = new User(
                In.getInstance().getString("Enter name: "),
                In.getInstance().getInt("Enter code meli: "),
                In.getInstance().getString("Enter father name: "),
                In.getInstance().getString("Enter address: ")

        );
        UserDAO.getInstance().save(user);
        Database.getInstance().commit();


    }


    public void update(User user) throws SQLException {
        user.setName(In.getInstance().getString("Enter name: "));
        user.setCodemeli(  In.getInstance().getInt("Enter code meli: "));
        user.setFather_name(In.getInstance().getString("Enter father name: "));
        user.setAddress(In.getInstance().getString("Enter address: "));

        UserDetail.getInstance().add(user);
    }
    public void Donate(Relation book) throws SQLException {
        RelationDAO.getInstance().Add(book);
    }
    private User user;

    public User getUser() {
        return user;
    }
}




