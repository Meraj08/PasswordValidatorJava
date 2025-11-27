package org.passwordValidator.exceptions;

public class MissingUpperCaseException extends InvalidPasswordException{
    public MissingUpperCaseException(String message) {
        super(message);
    }
}
