package Test.Exception;

public class BookHasTakeException extends Throwable {
    public BookHasTakeException(){
        super();
    }
    public BookHasTakeException(String Message){
        super(Message);
    }
}
