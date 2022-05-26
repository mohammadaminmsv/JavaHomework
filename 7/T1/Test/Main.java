package Test;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Front.getInstance().enterToSystem();
            System.out.println("\n"+Front.getInstance().getUserInfo().toString());
//            UserDAO.getInstance().delete(AuthController.getInstance().getUserInfo());

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Database.getInstance().close();
        }
    }
    }

