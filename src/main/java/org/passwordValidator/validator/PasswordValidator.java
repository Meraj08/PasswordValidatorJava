package org.passwordValidator.validator;

import org.passwordValidator.config.Settings;
import org.passwordValidator.exceptions.InvalidPasswordException;
import org.passwordValidator.exceptions.MissingLowerCaseException;
import org.passwordValidator.exceptions.MissingNumberException;
import org.passwordValidator.exceptions.MissingUpperCaseException;
import org.passwordValidator.rules.PasswordRules;


public class PasswordValidator {

    // method to validate password (all rules)
    public boolean validate(String password){
        PasswordRules.IsNull(password);
        PasswordRules.checkLength(password, Settings.MIN_LENGTH);


        int pass = 0 ;

        try{
            if(PasswordRules.checkUpperCase(password))pass++;

        }
        catch (MissingUpperCaseException e){
            throw new MissingUpperCaseException(e.getMessage());
        }
        try{
            if(PasswordRules.checkNumber(password))pass++;
        }
        catch (MissingNumberException e){
            throw new MissingNumberException(e.getMessage());
        }
        try{
            if(PasswordRules.checkLowerCase(password))pass++;
        }
        catch (MissingLowerCaseException e){
            throw new MissingLowerCaseException(e.getMessage());
        }



//        System.out.println("pass is "+pass);
        return pass >= 3;
    }

}
