package dev.deerops.contenthelper.validation.validExcepiton;

/**
 * Exception thrown when a phone number does not conform to a valid phone format.
 * This exception is used to indicate that the provided phone number contains
 * invalid characters or does not meet the required format for a phone number.
 *
 * <p>This exception can be triggered when validating phone numbers in user input
 * such as registration forms, contact forms, or any other place where phone number
 * input is expected.</p>
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public class InvalidPhoneFormatException extends RuntimeException {

    /**
     * Default constructor for the exception.
     * Initializes the exception with a default error message.
     */
    public InvalidPhoneFormatException() {
        super("The provided phone number is in an invalid format.");
    }

    /**
     * Constructor that allows a custom message to be passed.
     *
     * @param message The custom error message (String).
     */
    public InvalidPhoneFormatException(String message) {
        super(message);
    }
}
