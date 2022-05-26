package Test;

import java.sql.*;

public class Database {
    private Connection connection;
    private Statement statement;


    private Database() {};
    private static final Database instance = new Database();


    public static Database getInstance() throws SQLException {
        if (instance.connection == null) {
            instance.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test2",
                    "amin",
                    ""
            );
            instance.statement = instance.connection.createStatement();

        }
        return instance;
    }
    public ResultSet executeQuery(String query) throws SQLException {


        return statement.executeQuery(query);
    }
    public PreparedStatement prepareStatement(String query) throws SQLException {

        return connection.prepareStatement(query);
    }
    public void close() throws SQLException {
        connection.close();
    }
}