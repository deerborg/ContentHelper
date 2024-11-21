
package dev.deerops.contenthelper.validation.validExcepiton;

/**
 * Exception thrown when a field is found to be empty or null for user input.
 * This exception is used to indicate that a required field for user input is either
 * missing or empty, which prevents further processing of the request.
 *
 * <p>This exception can be triggered in scenarios such as validating form inputs,
 * database fields, or any other content where non-empty data is required.</p>
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public class EmptyOrNullFieldForUserException extends RuntimeException {

    /**
     * Constructor that allows a custom message to be passed.
     *
     * @param message The custom error message (String).
     */
    public EmptyOrNullFieldForUserException(String message) {
        super(message);
    }

    /**
     * Default constructor for the exception.
     * Initializes the exception with a default error message.
     */
    public EmptyOrNullFieldForUserException() {
        super("One or more required fields are empty or null.");
    }
}
