package Test.Controller;

import Test.Exception.EXC;
import Test.GetAndDatabase.Database;
import Test.In;
import Test.model.Admin.Admin;
import Test.model.Admin.AdminDAO;
import Test.model.Book.Book;
import Test.model.Book.BookDAO;
import Test.model.Book.BookDetail;
import Test.model.User.UserDAO;
import Test.model.relation.Relation;
import Test.model.relation.RelationDAO;

import java.sql.SQLException;

public class BookController {
    private BookController(){}
    private static final BookController instance = new BookController();



    public static BookController getInstance() {
        return instance;
    }

    public void ADDBook() throws SQLException {

            Book Book = new Book(
                    In.getInstance().getString("Enter name: "),
                    In.getInstance().getString("Enter writer: "),
                    In.getInstance().getString("Enter publisher: "),
                    In.getInstance().getString("Enter circulation: "),
                    In.getInstance().getInt("Enter published_year: "),
                    In.getInstance().getString("Enter type: "),
                    In.getInstance().getInt("Enter layout: "),
                    In.getInstance().getInt("Enter price: "),
                    In.getInstance().getInt("Enter dateofIN: "),
                    In.getInstance().getInt("Enter code: "),
                    In.getInstance().getString("Enter nameofresponsible:")
            );

            BookDAO.getInstance().save(Book);
            Database.getInstance().commit();

    }
        public void updateBook(Book book) throws SQLException {
        book.setNameB(In.getInstance().getString("Enter name: "));
        book.setWriter(  In.getInstance().getString("Enter writer: "));
        book.setPublisher(In.getInstance().getString("Enter publisher: "));
        book.setCirculation(In.getInstance().getString("Enter circulation: "));
        book.setPublished_year( In.getInstance().getInt("Enter published_year: "));
        book.setType(    In.getInstance().getString("Enter type: "));
        book.setLayout(   In.getInstance().getInt("Enter layout: "));
        book.setPrice(   In.getInstance().getInt("Enter price: "));
        book.setDateofIN(  In.getInstance().getInt("Enter dateofIN: "));
        book.setCode(   In.getInstance().getInt("Enter code: "));
        book.setNameofresponsible(  In.getInstance().getString("Enter nameofresponsible:"));
        BookDetail.getInstance().add(new Book());
    }

    private Book book;

    public Book getBook() {
        return book;
    }
  /*  public void SHowBook(Book book) throws SQLException {
        BookDAO.getInstance().;
    }*/
}

