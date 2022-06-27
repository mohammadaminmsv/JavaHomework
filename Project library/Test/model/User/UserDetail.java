package Test.model.User;

import Test.Exception.UserHasNotFound;


import java.sql.SQLException;
import java.util.Collection;

public class UserDetail {
    private UserDetail() {
    }

    ;
    private final static UserDetail instance = new UserDetail();

    public static UserDetail getInstance() {
        return instance;
    }

    public void add(User user) throws SQLException {
        UserDAO.getInstance().save(user);
    }

    public void update(User user) throws SQLException {
        UserDAO.getInstance().save(user);
    }

    public void showAll() throws SQLException {
        UserDAO.getInstance().FindByUsername().forEach(user -> {
            System.out.println(user.toString());
            System.out.println("___________________________________");
        });
    }

    public void showOne(String name, String father_name) throws SQLException,  UserHasNotFound {
        User user = UserDAO.getInstance().FindByUsername()
                .stream().filter(user1 -> {
                    return user1.getName().equals(name) && user1.getFather_name().equals(father_name);
                }).findFirst().orElse(null);

        if (user != null) System.out.println(user.toString());
        else throw new UserHasNotFound();
    }

    public void remove(User user) throws SQLException {
        UserDAO.getInstance().delete(user);
    }

    public Collection<User> getAll() throws SQLException {
        return UserDAO.getInstance().FindByUsername();
    }

    public User getOne(String name, String father_name) throws SQLException,  UserHasNotFound {
        User user = UserDAO.getInstance().FindByUsername()
                .stream().filter(user1 -> {
                    return user1.getName().equals(name) && user1.getFather_name().equals(father_name);
                }).findFirst().orElse(null);

        if (user != null) return user;
        else throw new UserHasNotFound();
    }
}
