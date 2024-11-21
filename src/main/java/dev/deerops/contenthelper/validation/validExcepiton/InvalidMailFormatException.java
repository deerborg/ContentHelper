package dev.deerops.contenthelper.validation.validExcepiton;

/**
 * Exception thrown when an email address does not conform to a valid email format.
 * This exception is used to indicate that the provided email is either in an incorrect
 * format or does not meet the required structure for a valid email address.
 *
 * <p>This exception can be triggered when validating user input such as registration forms,
 * contact forms, or any other place where email input is expected.</p>
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public class InvalidMailFormatException extends RuntimeException {

    /**
     * Constructor that allows a custom message to be passed.
     *
     * @param message The custom error message (String).
     */
    public InvalidMailFormatException(String message) {
        super(message);
    }

    /**
     * Default constructor for the exception.
     * Initializes the exception with a default error message.
     */
    public InvalidMailFormatException() {
        super("The provided email address is in an invalid format.");
    }
}
