package org.passwordValidator.exceptions;

public class MissingLowerCaseException extends InvalidPasswordException{
    public MissingLowerCaseException(String message) {
        super(message);
    }
}
