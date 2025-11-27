package org.passwordValidator.exceptions;

public class MissingMinimumLengthException extends InvalidPasswordException{
    public MissingMinimumLengthException(String message) {
        super(message);
    }
}
