package dev.deerops.contenthelper.validation.validExcepiton;

/**
 * Exception thrown when a content entity is not found.
 * This exception is used to indicate that the requested content
 * was not found in the system, such as when an entity is missing
 * from a database or an Optional entity is empty.
 *
 * <p>This exception can be used to handle cases where a specific piece
 * of content or resource cannot be located, typically thrown during
 * content retrieval operations.</p>
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public class NotFoundContent extends RuntimeException {

    /**
     * Constructor that accepts a custom error message.
     *
     * @param message The custom error message (String).
     */
    public NotFoundContent(String message) {
        super(message);
    }

    /**
     * Default constructor that initializes the exception with a generic message.
     */
    public NotFoundContent() {
        super("Content not found.");
    }
}
