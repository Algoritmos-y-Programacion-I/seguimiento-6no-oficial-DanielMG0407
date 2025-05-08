package customExceptions;

public class AlreadyEnrolledException extends Exception{
    public AlreadyEnrolledException(){
        super("This student is already enrolled.");
    }
}
