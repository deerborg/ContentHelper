package dev.deerops.contenthelper.validation.validExcepiton;

/**
 * Exception thrown when the content limit is exceeded.
 * This exception indicates that a certain content threshold or limit
 * has been surpassed, such as the maximum allowed characters, items, etc.
 *
 * <p>The exception can be used in situations where a specific limit for content
 * creation or input validation is enforced, and the provided content exceeds
 * this limit.</p>
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public class ContentLimitExceededException extends RuntimeException {

    /**
     * Constructor that allows a custom message to be passed.
     *
     * @param message The custom error message (String).
     */
    public ContentLimitExceededException(String message) {
        super(message);
    }

    /**
     * Default constructor for the exception.
     * Initializes the exception with a default error message.
     */
    public ContentLimitExceededException() {
        super("The content limit has been exceeded.");
    }
}
