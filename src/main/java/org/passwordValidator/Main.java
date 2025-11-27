package org.passwordValidator;

import org.passwordValidator.exceptions.InvalidPasswordException;
import org.passwordValidator.validator.PasswordValidator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        String password = null;
        try {
            boolean valid = validator.validate(password);
            if(valid)
                System.out.println("Valid Password");
        }catch(InvalidPasswordException e){
            System.out.println("Invalid Password: "+e.getMessage());
        }






    }
}