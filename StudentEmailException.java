
// IllegalArgumentException UN-CHECKED
// Exception                CHECKED
public class StudentEmailException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public StudentEmailException() {
        super();
    }

    public StudentEmailException(String message) {
        super(message);
    }

    public StudentEmailException(Throwable cause) {
        super(cause);
    }

    public StudentEmailException(String message, Throwable cause) {
        super(message, cause);
    }
}
