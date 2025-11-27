package org.passwordValidator.exceptions;

public class NullPasswordException extends InvalidPasswordException{
    public NullPasswordException(String message) {
        super(message);
    }
}
