package customExceptions;

public class CancellationNotAllowedException extends Exception {
    public CancellationNotAllowedException() {
        super("Cancellation not allowed. Student has more than 50% grades assigned.");
    }
}
