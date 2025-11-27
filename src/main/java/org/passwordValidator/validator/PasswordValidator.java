package org.passwordValidator.validator;

import org.passwordValidator.config.Settings;
import org.passwordValidator.rules.PasswordRules;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class PasswordValidator {

    public boolean validate(String password){
        PasswordRules.IsNull(password);
        PasswordRules.checkLength(password, Settings.MIN_LENGTH);


        int pass = 0 ;
        if(PasswordRules.checkUpperCase(password))pass++;
        if(PasswordRules.checkLowerCase(password))pass++;
        if(PasswordRules.checkNumber(password))pass++;


//        System.out.println("pass is "+pass);
        return pass >= 3;
    }

}
