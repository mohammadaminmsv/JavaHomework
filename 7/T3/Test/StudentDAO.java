package Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class StudentDAO {
    public Optional<Student> FindbyName(String name) throws SQLException {
        ResultSet result = Database.getInstance().executeQuery("select * from info where name = '" + name + "'");
        Student stud = null;
        if (result.next()) {
            stud = new Student();
            stud.setName(result.getString("name"));
            stud.setCodeOfSTU(result.getInt("codeOfSTU"));
            stud.setYear(result.getInt("year"));
            stud.setScore(result.getInt("score"));
        }
        return  Optional.ofNullable(stud);
    }
    public void save(Student stud) throws SQLException {
        ResultSet result = Database.getInstance()
                .executeQuery("select * from info where name = '" + stud.getName() + "'");

        if (result.next()) {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("UPDATE info\n" +
                            "SET  codeOfSTU= ?,year=?,score=?\n" +
                            "WHERE Name = ?");


            preparedStatement.setInt(1, stud.getCodeOfSTU());
            preparedStatement.setInt(2, stud.getYear());
            preparedStatement.setInt(3, stud.getScore());
            preparedStatement.setString(4, stud.getName());

            preparedStatement.executeUpdate();
        }
        else {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("insert into info values (default, ?, ?, ?)");

            preparedStatement.setInt(1, stud.getCodeOfSTU());
            preparedStatement.setInt(2, stud.getYear());
            preparedStatement.setInt(3, stud.getScore());


            preparedStatement.executeUpdate();
        }
    }
    public void delete(Student stud) throws SQLException {
        Database.getInstance()
                .prepareStatement("DELETE FROM info WHERE name = '" + stud.getName() + "'")
                .executeUpdate();
    }


    private StudentDAO(){}

    private static final StudentDAO instance = new StudentDAO();

    public static StudentDAO getInstance() {
        return instance;
    }
}
