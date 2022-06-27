package Test.model.Book;


import Test.Exception.BookNotFoundException;

import java.sql.SQLException;
import java.util.Collection;

public class BookDetail {

        private BookDetail(){}
        private static final BookDetail instance = new BookDetail();
        public static BookDetail getInstance() {
            return instance;
        }

        public void add(Book book) throws SQLException {
            BookDAO.getInstance().save(book);
        }

        public void update(Book book) throws SQLException {
            BookDAO.getInstance().save(book);
        }

        public void showAll() throws SQLException {
            BookDAO.getInstance().FindByName().forEach(book->{
                System.out.println(book.toString());
                System.out.println("___________________________________");
            });
        }

        public void showOne(String name, String publisher) throws SQLException, BookNotFoundException {
            Book book = BookDAO.getInstance().FindByName()
                    .stream().filter(Book -> {
                        return Book.getNameB().equals(name) && Book.getPublisher().equals(publisher);
                    }).findFirst().orElse(null);

            if (book != null) System.out.println(book.toString());
            else throw new BookNotFoundException();
        }

        public void remove(Book book) throws SQLException {
            BookDAO.getInstance().delete(book);
        }

        public Collection<Book> getAll() throws SQLException {
            return BookDAO.getInstance().FindByName();
        }

        public Book getOne(String name, String publisher) throws SQLException, BookNotFoundException {
            Book book = BookDAO.getInstance().FindByName()
                    .stream().filter(carEnt -> {
                        return carEnt.getNameB().equals(name) && carEnt.getPublisher().equals(publisher);
                    }).findFirst().orElse(null);

            if (book != null) return book;
            else throw new BookNotFoundException();
        }

    }
