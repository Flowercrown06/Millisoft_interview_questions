package company.software.exception;

public class EmailFormatException extends RuntimeException {
    public EmailFormatException(String message) {
        super(message);
    }
}
