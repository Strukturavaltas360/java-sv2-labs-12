package exceptionclass.course;

public class InvalidTimeException extends RuntimeException {

    private String message;

    public InvalidTimeException(String message) {
        super(message);
        this.message = message;
    }

    public InvalidTimeException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

}
