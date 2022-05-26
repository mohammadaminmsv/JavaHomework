package Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class EmploDAO {

    public Optional<Emplo> findByEmployeeNumber(int Emplocode) throws SQLException {
        ResultSet result = Database.getInstance().executeQuery("select * from emplo where Emplocode = " + Emplocode );
        Emplo employee = null;
        if (result.next()) {
            employee = new Emplo();
            employee.setEmplocode(result.getInt("Emplocode"));
            employee.setEmploname(result.getString("Emploname"));
            employee.setEmploId(result.getInt("EmploId"));
            employee.setEmploFATname(result.getString("EmploFATname"));
            employee.setEmplolevel(result.getString("Emplolovel"));
            employee.setMoney(result.getInt("money"));
            employee.setHisto(result.getString("EmploHisto"));
        }
        return Optional.ofNullable(employee);
    }
    public void save(Emplo emplo) throws SQLException {
        ResultSet result = Database.getInstance()
                .executeQuery("select * from emplo where Emplocode = '" + emplo.getEmplocode() + "'");

        if (result.next()) {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("UPDATE emplo\n" +
                            "SET   Emplocode=?;\n" +
                            "   Emploname=?;\n" +
                            "     EmploId=?;\n" +
                            "    EmploFATname=?;\n" +
                            "     Emplolevel=?;\n" +
                            "    money=?;\n" +
                            "    Histo=?; \n" +
                            "WHERE Emplocode = ?");

            preparedStatement.setInt(1, emplo.getEmplocode());
            preparedStatement.setString(2, emplo.getEmploname());
            preparedStatement.setInt(3, emplo.getEmploId());
            preparedStatement.setString(4, emplo.getEmploFATname());
            preparedStatement.setString(5, emplo.getEmplolevel());
            preparedStatement.setInt(6, emplo.getMoney());
            preparedStatement.setString(7, emplo.getHisto());

            preparedStatement.executeUpdate();
        } else {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("insert into emplo values (default, ?, ?, ?, ?,?,?,?)");
            preparedStatement.setInt(1, emplo.getEmplocode());
            preparedStatement.setString(2, emplo.getEmploname());
            preparedStatement.setInt(3, emplo.getEmploId());
            preparedStatement.setString(4, emplo.getEmploFATname());
            preparedStatement.setString(5, emplo.getEmplolevel());
            preparedStatement.setInt(6, emplo.getMoney());
            preparedStatement.setString(7, emplo.getHisto());
            preparedStatement.executeUpdate();
        }
    }
    public void Delete(Emplo emplo) throws SQLException {
        Database.getInstance()
                .prepareStatement("DELETE FROM emplo WHERE Emplocode = '" + emplo.getEmplocode() + "'")
                .executeUpdate();
    }
    private EmploDAO(){}

    private static final EmploDAO instance = new EmploDAO();

    public static EmploDAO getInstance() {
        return instance;
    }
}
