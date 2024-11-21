package dev.deerops.contenthelper.validation.validExcepiton;

/**
 * Exception thrown when content is null or empty.
 * This exception is used to indicate that the provided content,
 * such as a title, description, or content ID, is either null or an empty value.
 * It is typically thrown during content validation processes to ensure
 * that the required content fields are properly populated.
 *
 * <p>This exception is commonly used in validation scenarios where content
 * must be provided and cannot be left empty or null.</p>
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public class NullOrEmptyContentException extends RuntimeException {

    /**
     * Constructor that accepts a custom error message.
     *
     * @param message The custom error message (String).
     */
    public NullOrEmptyContentException(String message) {
        super(message);
    }

    /**
     * Default constructor that initializes the exception with a generic message.
     */
    public NullOrEmptyContentException() {
        super("Content cannot be null or empty.");
    }
}
