package org.passwordValidator;

import org.passwordValidator.exceptions.InvalidPasswordException;
import org.passwordValidator.validator.PasswordValidator;

public class Main{
    public static void main(String[] args) {

        // creating object of PasswordValidator
        PasswordValidator validator = new PasswordValidator();

        String password = "Meraj1234";
        try {
            boolean valid = validator.validate(password);
            if(valid)
                System.out.println("Valid Password");
        }catch(InvalidPasswordException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }
    }
}