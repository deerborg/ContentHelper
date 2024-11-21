package dev.deerops.contenthelper.validation.validExcepiton;

/**
 * Exception thrown when a user is not found.
 * This exception is used to indicate that the requested user
 * could not be located in the system, such as when a user is missing
 * from the database or an Optional user entity is empty.
 *
 * <p>This exception can be used to handle cases where a specific user
 * cannot be found in the system, typically thrown during user retrieval operations.</p>
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public class NotFoundUserException extends RuntimeException {

    /**
     * Constructor that accepts a custom error message.
     *
     * @param message The custom error message (String).
     */
    public NotFoundUserException(String message) {
        super(message);
    }

    /**
     * Default constructor that initializes the exception with a generic message.
     */
    public NotFoundUserException() {
        super("User not found.");
    }
}
