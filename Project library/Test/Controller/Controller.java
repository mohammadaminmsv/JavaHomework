package Test.Controller;

import Test.Exception.EXC;
import Test.GetAndDatabase.Database;
import Test.In;
import Test.model.Admin.Admin;
import Test.model.Admin.AdminDAO;
import Test.model.Book.BookDetail;

import java.sql.SQLException;

public class Controller {
    private Controller(){}

    private static final Controller instance = new Controller();

    public static Controller getInstance() {
        return instance;
    }

    private boolean isAuthenticated = false;

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void login() throws SQLException, EXC {
        try {

            String name = In.getInstance().getString("Enter name:");
            int password=In.getInstance().getInt("Enter your password:");

            Admin admin = AdminDAO.getInstance().FindByName(name)
                    .orElseThrow(()->new EXC("Error: name or admin code not matched!"));
            if (!admin.getName().equals(name)){
                throw new EXC("Error:name or admin code not matched!");
            }
            else {
                isAuthenticated = true;
                userInfo = admin;
            }
            BookController.getInstance().ADDBook();

        }catch (EXC e){
            e.printStackTrace();
            enterToSystem();
        }
    }

    public void signup() throws SQLException, EXC {
        try {
            Admin admin = new Admin();
            admin.setName(In.getInstance().getString("Enter Name:"))
                    .setLastname(In.getInstance().getString("Enter lastname:"))
                    .setAdmincode(In.getInstance().getInt("Enter your admin code:"))
                    .setPassword(In.getInstance().getInt("Enter your password:"));

            if (AdminDAO.getInstance().FindByName(admin.getName()).orElse(null) == null){
                AdminDAO.getInstance().save(admin);
                isAuthenticated = true;
                userInfo = admin;
            }
            else throw new EXC("Error: name or admin code is already taken!");
            Database.getInstance().commit();


        }catch (EXC e){
            e.printStackTrace();
            enterToSystem();
        }
    }
    public void enterToSystem() throws SQLException, EXC {
        String state = In.getInstance().getString("\nFor Login enter 1 \nFor Signup enter 2\n for Add Book enter 3\n" +
                "\n for donate book enter 5 \n for add user enter 6");
        if (state.equals("1")) login();
        else if (state.equals("2")) signup();
        else if (state.equals("3")) BookController.getInstance().ADDBook();

        else if (state.equals("5")) DonateBookController.getInstance().Donate();
        else if (state.equals("6")) UserController.getInstance().ShowUser();
        enterToSystem();

    }
    public void logout() throws SQLException, EXC {
        isAuthenticated = false;
        userInfo = null;
        enterToSystem();
    }
    private Admin userInfo;

    public Admin getUserInfo() {
        return userInfo;
    }
}
