package ghost.svc.model.ex;

public class UserException extends RuntimeException {
    public UserException() {

    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}
