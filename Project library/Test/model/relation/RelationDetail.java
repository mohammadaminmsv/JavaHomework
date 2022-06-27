package Test.model.relation;

import Test.Controller.Controller;
import Test.Controller.DonateBookController;
import Test.Exception.BookHasTakeException;
import Test.model.Book.Book;

import java.sql.SQLException;
import java.util.Optional;

public class RelationDetail {


        private RelationDetail(){}

        private static final RelationDetail instance = new RelationDetail();

        public static RelationDetail getInstance() {
            return instance;
        }

    public void donatebook(Relation relation) throws SQLException {
        Relation rel = new Relation(
                DonateBookController.getInstance().book().getUserID(),
                DonateBookController.getInstance().book().getBookID(),
                DonateBookController.getInstance().book().getDate()
        );
        RelationDAO.getInstance().delete(rel);
    }
    public void removeBook(Book book) throws SQLException {
        Relation rel = new Relation(
                DonateBookController.getInstance().book().getUserID(),
                DonateBookController.getInstance().book().getBookID(),
                DonateBookController.getInstance().book().getDate()
        );
        RelationDAO.getInstance().Add(rel);
    }

    public Optional<Relation> getalluserbook() throws SQLException,  BookHasTakeException {
        return RelationDAO.getInstance().findAllUserBook(
                Controller.getInstance().getUserInfo().getAdmincode()
        );
    }
}
