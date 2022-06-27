package Test.Exception;

public class UserHasNotFound extends Throwable {
    public UserHasNotFound(){
        super();
    }
    public UserHasNotFound(String message){
        super(message);
    }
}
