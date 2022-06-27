package Test.Controller;

import Test.In;
import Test.model.Admin.Admin;
import Test.model.Book.Book;
import Test.model.Book.BookDAO;
import Test.model.Book.BookDetail;
import Test.model.relation.Relation;
import Test.model.relation.RelationDAO;

import java.sql.SQLException;

public class DonateBookController {
    private DonateBookController() {
    }

    private static final DonateBookController instance = new DonateBookController();

    public static DonateBookController getInstance() {
        return instance;
    }

    public void Donate() throws SQLException {
        Relation relation = new Relation(
                In.getInstance().getInt("Enter User ID: "),
                In.getInstance().getInt("Enter Book ID:"),
                In.getInstance().getInt("Enter Date:")

        );
        RelationDAO.getInstance().Add(relation);

    }
    private Relation book;

    public Relation book() {
        return book;
    }
}
