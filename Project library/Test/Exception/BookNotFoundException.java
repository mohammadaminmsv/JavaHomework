package Test.Exception;

public class BookNotFoundException extends Throwable {
    public BookNotFoundException(){
        super();
    }
    public BookNotFoundException(String message){
        super(message);
    }
}
