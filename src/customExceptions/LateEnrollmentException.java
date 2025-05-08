package customExceptions;

public class LateEnrollmentException extends Exception{
    public LateEnrollmentException(){
        super("No students allowed to enroll after second week.");
    }
}