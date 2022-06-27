package Test.model.relation;

public class Relation {
    private int bookID;
    private int userID;
    private int date;

    public Relation(int bookID, int userID, int date) {
        this.bookID = bookID;
        this.userID = userID;
        this.date = date;
    }

    public Relation(){};
    @Override
    public String toString() {
        return "Relation{" +
                "bookID=" + bookID +
                ", userID=" + userID +
                ", date=" + date +
                '}';
    }

    public int getBookID() {
        return bookID;
    }

    public Relation setBookID(int bookID) {
        this.bookID = bookID;
        return this;
    }

    public int getUserID() {
        return userID;
    }

    public Relation setUserID(int userID) {
        this.userID = userID;
        return this;
    }

    public int getDate() {
        return date;
    }

    public Relation setDate(int date) {
        this.date = date;
        return this;
    }
}
