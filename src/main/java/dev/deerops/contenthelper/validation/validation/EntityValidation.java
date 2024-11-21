package dev.deerops.contenthelper.validation.validation;

import dev.deerops.contenthelper.validation.validExcepiton.*;

import java.util.Optional;

/**
 * This interface defines the contract for various content validation methods.
 * Implementing classes should provide the logic for content validation tasks,
 * such as checking for null or empty values, validating email and phone formats,
 * and ensuring content exists within an {@link Optional} entity.
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public interface EntityValidation {

    /**
     * Validates whether the title and description of the content are not null or empty.
     * If either the title or description is null or empty, throws a {@link NullOrEmptyContentException}.
     *
     * @param title The title of the content (String).
     * @param description The description of the content (String).
     * @throws NullOrEmptyContentException if the title or description is null or empty.
     */
    void contentTitleAndDescriptionValidation(String title, String description);

    /**
     * Validates whether the content ID is not null or empty.
     * If the content ID is null or empty, throws a {@link NullOrEmptyContentException}.
     *
     * @param contentId The content ID (String).
     * @throws NullOrEmptyContentException if the content ID is null or empty.
     */
    void contentIdValidation(String contentId);


    <T> T validateContentExistenceForOptionalEntity(Optional<T> content);

    /**
     * Checks all fields of the given object to ensure none of them are null or empty.
     * Throws an {@link EmptyOrNullFieldForUserException} if any field is null or empty.
     *
     * @param object The object whose fields are to be validated.
     * @throws EmptyOrNullFieldForUserException if any field is null or empty.
     */
    void checkAllParameterForRequestClass(Object object);

    /**
     * Validates the format of an email address.
     * If the email format is invalid, throws an {@link InvalidMailFormatException}.
     *
     * @param email The email address to be validated (String).
     * @throws InvalidMailFormatException if the email format is invalid.
     */
    void emailFormatValidation(String email);

    /**
     * Validates the format of a phone number.
     * The phone number must contain only numeric characters.
     * If the phone number contains non-numeric characters, throws an {@link InvalidPhoneFormatException}.
     *
     * @param phone The phone number to be validated (String).
     * @throws InvalidPhoneFormatException if the phone number contains non-numeric characters.
     */
    void phoneFormatValidation(String phone);
}
