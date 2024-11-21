package dev.deerops.contenthelper.validation.validation.impl;

import dev.deerops.contenthelper.validation.validExcepiton.*;
import dev.deerops.contenthelper.validation.validation.EntityValidation;

import java.lang.reflect.Field;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class provides various validation methods for content entities.
 * It validates content fields like title, description, ID, email, and phone number,
 * and ensures that fields within an entity are not null or empty.
 *
 * @author Furkan Aydemir
 * @version 1.0.0
 * @since 2024-11-13
 */
public class EntityValidationImpl implements EntityValidation {

    /**
     * Validates that the title and description are not null or empty.
     * If either the title or description is null or empty, it throws a {@link NullOrEmptyContentException}.
     *
     * @param title The title of the content (String).
     * @param description The description of the content (String).
     * @throws NullOrEmptyContentException if either the title or description is null or empty.
     */
    @Override
    public void contentTitleAndDescriptionValidation(String title, String description) {
        if (title == null || title.trim().isEmpty() || description == null || description.trim().isEmpty()) {
            throw new NullOrEmptyContentException("Title or description cannot be null or empty.");
        }
    }

    /**
     * Validates that the content ID is not null or empty.
     * If the content ID is null or empty, throws a {@link NullOrEmptyContentException}.
     *
     * @param contentId The content ID to be validated (String).
     * @throws NullOrEmptyContentException if the content ID is null or empty.
     */
    @Override
    public void contentIdValidation(String contentId) {
        if (contentId == null || contentId.trim().isEmpty()) {
            throw new NullOrEmptyContentException("Content ID cannot be null or empty.");
        }
    }


    @Override
    public <T> T validateContentExistenceForOptionalEntity(Optional<T> content) {
        return content.orElseThrow(() -> new NotFoundContent("Content not found."));
    }

    /**
     * Checks all fields of the given object to ensure none of them are null or empty.
     * If any field is null or empty, an {@link EmptyOrNullFieldForUserException} is thrown.
     *
     * @param object The object whose fields are to be validated.
     * @throws EmptyOrNullFieldForUserException if any field is null or empty.
     */
    @Override
    public void checkAllParameterForRequestClass(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(object);

                if (value == null || (value instanceof String && ((String) value).trim().isEmpty())) {
                    throw new EmptyOrNullFieldForUserException("Field " + field.getName() + " cannot be null or empty.");
                }
            } catch (Exception e) {
                throw new EmptyOrNullFieldForUserException("Error occurred while validating field: " + field.getName());
            }
        }
    }

    /**
     * Validates the format of an email address.
     * If the email format is invalid, throws an {@link InvalidMailFormatException}.
     *
     * @param email The email address to be validated (String).
     * @throws InvalidMailFormatException if the email format is invalid.
     */
    @Override
    public void emailFormatValidation(String email) {
        if (!isValidEmail(email)) {
            throw new InvalidMailFormatException("Invalid email format: " + email);
        }
    }

    /**
     * Validates the format of a phone number.
     * Only numeric phone numbers are valid. If the phone number contains anything other than digits,
     * throws an {@link InvalidPhoneFormatException}.
     *
     * @param phone The phone number to be validated (String).
     * @throws InvalidPhoneFormatException if the phone number contains non-numeric characters.
     */
    @Override
    public void phoneFormatValidation(String phone) {
        if (!isValidPhone(phone)) {
            throw new InvalidPhoneFormatException("Phone number should contain only numeric characters: " + phone);
        }
    }

    /**
     * Helper method to validate if an email address is in a valid format.
     *
     * @param email The email address to be validated (String).
     * @return True if the email format is valid, false otherwise.
     * @throws EmptyOrNullFieldForUserException if the email is null or empty.
     */
    private boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new EmptyOrNullFieldForUserException("Email cannot be null or empty.");
        }

        String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    /**
     * Helper method to validate if a phone number contains only digits.
     *
     * @param phone The phone number to be validated (String).
     * @return True if the phone number contains only digits, false otherwise.
     */
    private boolean isValidPhone(String phone) {
        return phone != null && !phone.trim().isEmpty() && phone.matches("\\d+");
    }
}
