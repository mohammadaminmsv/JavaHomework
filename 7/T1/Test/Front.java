package Test;

import java.sql.SQLException;

public class Front {
    private Front(){}

    private static final Front instance = new Front();

    public static Front getInstance() {
        return instance;
    }

    private boolean Fro= false;

    public boolean Fro() {
        return Fro;
    }


    public void Enter() throws SQLException {
        User user = new User();
        user.setUsername(IN.getInstance().getString("Enter Username:"));
        user.setPassword(IN.getInstance().getString("Enter password:"));
        user.setCode(Integer.parseInt(IN.getInstance().getString("Enter code")));
        user.setEmail(IN.getInstance().getString("Enter Email:"));
        user.setAge(Integer.parseInt(IN.getInstance().getString("Enter Age=")));
        user.setEducation(IN.getInstance().getString("Enter Education="));

            UserDAO.getInstance().save(user);
            Fro = true;
            userInfo = user;
        }



    public void enterToSystem() throws SQLException {
        String state = IN.getInstance().getString("\nFor save new Info 1 \nFor update the Info Enter 2");
        if (state.equals("1")) Enter();
        else if (state.equals("2"))
        Enter();
    }
    private User userInfo;

    public User getUserInfo() {
        return userInfo;
    }
}
