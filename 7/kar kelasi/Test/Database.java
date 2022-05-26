package Test;

import java.sql.*;

public class Database {
    private Connection connection;
    private  Statement statement;


    private Database(){};
    private static final Database instance =new Database();
    public static Database getInstance() {

        try {
            instance.connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/test1"
                            , "amin", "");
            instance.statement= instance.connection.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        };
        return instance;
    }public ResultSet executeQuery(String query) throws SQLException {
            return statement.executeQuery(query);

        }public PreparedStatement prepareStatement(String query) throws SQLException {
        return connection.prepareStatement(query);
    }
    public void close() throws SQLException {
        connection.close();
        connection=null;
    }
}

/*
 singelton
 statement اینو مینویسی توش اطلاعات میزاری
executeQuery اینو مینویسی از دیتاییس اطلاعت برمیدای



 */