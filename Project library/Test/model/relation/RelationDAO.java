package Test.model.relation;


import Test.Exception.BookHasTakeException;
import Test.GetAndDatabase.Database;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class RelationDAO {



        protected Optional<Relation> findAllUserBook(int userID) throws SQLException, BookHasTakeException {
            ResultSet result = Database.getInstance().executeQuery("select * from relation where userID = '" + userID + "'");
            Relation relation = null;
            if (result.next()) {
                relation = new Relation();
                relation.setUserID(result.getInt("userID"));
                relation.setBookID(result.getInt("bookID"));
                relation.setDate(result.getInt("date"));

            }
            return Optional.ofNullable(relation);
        }



        public void Add(Relation rel) throws SQLException {
            ResultSet result = Database.getInstance()
                    .executeQuery("select * from relation WHERE UserID = '" + rel.getUserID() + "'" +
                            " and BookID = '" + rel.getBookID() + "'");

            if (!result.next()) {
                PreparedStatement preparedStatement = Database.getInstance()
                        .prepareStatement("insert into relation values (default, ?, ?,?)");
                preparedStatement.setInt(1, rel.getUserID());
                preparedStatement.setInt(2, rel.getBookID());
                preparedStatement.setInt(3,rel.getDate());
                preparedStatement.executeUpdate();
            }


        }


        protected void delete(Relation rel) throws SQLException {
            Database.getInstance()
                    .prepareStatement("DELETE FROM relation WHERE UserID = '" + rel.getUserID() + "'" +
                            " and BookID = '" + rel.getBookID() + "'")
                    .executeUpdate();


        }


        private RelationDAO(){}

        private static final RelationDAO instance = new RelationDAO();

        public static RelationDAO getInstance() {
            return instance;
        }
    }




