package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

         try {
            GETINFO.getInstance().enterToSystem();
            System.out.println("\n"+GETINFO.getInstance().getUserInfo().toString());
//            UserDAO.getInstance().delete(AuthController.getInstance().getUserInfo());

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Database.getInstance().close();
        }

    }
}
