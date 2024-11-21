package dev.deerops.contenthelper.validation.validExcepiton;

/**
 * Exception thrown when a username is not unique.
 * This exception is used to indicate that the provided username
 * already exists in the system and cannot be used for a new user.
 * It is typically thrown during user registration or account creation processes
 * to ensure that each username is unique within the system.
 *
 * <p>This exception helps maintain the integrity of the system by preventing
 * the creation of duplicate user accounts with the same username.</p>
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public class UnUniqueUsernameException extends RuntimeException {

    /**
     * Constructor that accepts a custom error message.
     *
     * @param message The custom error message (String).
     */
    public UnUniqueUsernameException(String message) {
        super(message);
    }

    /**
     * Default constructor that initializes the exception with a generic message.
     */
    public UnUniqueUsernameException() {
        super("The username must be unique.");
    }
}
