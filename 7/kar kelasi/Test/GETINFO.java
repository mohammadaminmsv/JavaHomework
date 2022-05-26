package Test;

import java.sql.SQLException;

public class GETINFO {
    private GETINFO(){}

    private static final GETINFO instance = new GETINFO();

    public static GETINFO getInstance() {
        return instance;
    }

    private boolean isAuthenticated = false;

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void login() throws SQLException {
        try {
            String username = Get.getInstance().getString("Enter Username:");
            String password = Get.getInstance().getString("Enter Password:");

            User user = USERDAO.getInstance().findByUsername(username)
                    .orElseThrow(()->new Exception1("Error: username and password not matched!"));
            if (!user.getPassword().equals(password)){
                throw new Exception1("Error: username and password not matched!");
            }
            else {
                isAuthenticated = true;
                userInfo = user;
            }
        } catch (Exception1 e) {
            e.printStackTrace();
            enterToSystem();
        }
    }

    public void signup() throws SQLException {
        try {
            User user = new User();
            user.setName(Get.getInstance().getString("Enter Name:"));
                    user.setEmail(Get.getInstance().getString("Enter Email:"));
                    user.setUsername(Get.getInstance().getString("Enter Username:"));
                    user.setPassword(Get.getInstance().getString("Enter Password:"));

            if (USERDAO.getInstance().findByUsername(user.getUsername()).orElse(null) == null){
                USERDAO.getInstance().save(user);
                isAuthenticated = true;
                userInfo = user;
            }
            else throw new Exception1("Error: username is already taken!");

        }catch (Exception1 e){
            e.printStackTrace();
            enterToSystem();
        }
    }
    public void enterToSystem() throws SQLException {
        String state = Get.getInstance().getString("\nFor Login enter 1 \nFor Signup enter anything else");
        if (state.equals("1")) login();
        else signup();
    }
    private User userInfo;

    public User getUserInfo() {
        return userInfo;
    }
}
