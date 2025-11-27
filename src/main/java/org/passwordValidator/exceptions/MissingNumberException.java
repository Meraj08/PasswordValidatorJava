package org.passwordValidator.exceptions;

public class MissingNumberException extends InvalidPasswordException{
    public MissingNumberException(String message) {
        super(message);
    }
}
