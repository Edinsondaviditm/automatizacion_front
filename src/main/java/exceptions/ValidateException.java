package exceptions;

public class ValidateException extends AssertionError{
    public static final String LOOK_FOR_A_BOOK = "The response for the look for a book wasn't the successful";

    public ValidateException(String message, Throwable cause) {
        super(message, cause);
    }
}
