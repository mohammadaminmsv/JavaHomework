package Test;

import Test.Controller.Controller;
import Test.Exception.EXC;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        try {
            Controller.getInstance().enterToSystem();
        } catch (EXC e) {
            e.printStackTrace();
        }
        finally {
            Test.GetAndDatabase.Database.getInstance().close();
        }
    }
}
