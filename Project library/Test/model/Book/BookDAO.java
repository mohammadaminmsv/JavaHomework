package Test.model.Book;

import Test.GetAndDatabase.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class BookDAO {

    public Collection<Book> FindByName() throws SQLException {
        ResultSet result = Database.getInstance().executeQuery("select * from book  ");
        Collection<Book> books = new ArrayList<>();
        while (result.next()) {
            Book book = new Book();
            book.setNameB(result.getString("name"));
            book.setWriter(result.getString("writer"));
            book.setPublisher(result.getString("publisher"));
            book.setCirculation(result.getString("circulation"));
            book.setPublished_year(result.getInt("published_year"));
            book.setType(result.getString("type"));
            book.setLayout(result.getInt("layout"));
            book.setPrice(result.getInt("price"));
            book.setDateofIN(result.getInt("dateofIN"));
            book.setCode(result.getInt("code"));
            book.setNameofresponsible(result.getString("nameofresponsible"));


            books.add(book);


        }
        return books;
    }
    public void save(Book book) throws SQLException {
        ResultSet result = Database.getInstance()
                .executeQuery("select * from book where nameB = '" + book.getNameB() + "'");

        if (result.next()) {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("UPDATE book\n" +
                            "SET writer= ?, publisher=?,circulation=?,published_year=?,type=?,layout=?\n"
                            +"price=?,dateofIN=?,code=?,nameofresponsible=?\n"+
                            "WHERE nameB = ?");

            preparedStatement.setString(1, book.getNameB());
            preparedStatement.setString(2, book.getWriter());
            preparedStatement.setString(3, book.getPublisher());
            preparedStatement.setString(4, book.getCirculation());
            preparedStatement.setInt(5,book.getPublished_year());
            preparedStatement.setString(6,book.getType());
            preparedStatement.setInt(7,book.getLayout());
            preparedStatement.setInt(8,book.getPrice());
            preparedStatement.setInt(9,book.getDateofIN());
            preparedStatement.setInt(10,book.getCode());
            preparedStatement.setString(11,book.getNameofresponsible());
            preparedStatement.executeUpdate();
        }
        else {
            PreparedStatement preparedStatement = Database.getInstance()
                    .prepareStatement("insert into book values (default, ?, ?, ?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, book.getNameB());
            preparedStatement.setString(2, book.getWriter());
            preparedStatement.setString(3, book.getPublisher());
            preparedStatement.setString(4, book.getCirculation());
            preparedStatement.setInt(5,book.getPublished_year());
            preparedStatement.setString(6,book.getType());
            preparedStatement.setInt(7,book.getLayout());
            preparedStatement.setInt(8,book.getPrice());
            preparedStatement.setInt(9,book.getDateofIN());
            preparedStatement.setInt(10,book.getCode());
            preparedStatement.setString(11,book.getNameofresponsible());
            preparedStatement.executeUpdate();


        }
    }
    public void delete(Book book) throws SQLException {
        Database.getInstance()
                .prepareStatement("DELETE FROM book WHERE name = '" + book.getNameB() + "'")
                .executeUpdate();
    }
   /*public void Show(Book book) throws SQLException{
        Database.getInstance().prepareStatement()
    }
*/

    private BookDAO(){}

    private static final BookDAO instance = new BookDAO();

    public static BookDAO getInstance() {
        return instance;
    }
}

