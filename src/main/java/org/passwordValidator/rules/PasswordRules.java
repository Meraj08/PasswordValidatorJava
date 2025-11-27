package org.passwordValidator.rules;

import org.passwordValidator.exceptions.*;

public class PasswordRules {
    public static boolean IsNull(String password){
        if(password==null || password.trim().isEmpty()){
            throw new NullPasswordException("Password can not be null or empty.");
        }
        return true;
    }

    public static boolean checkLength(String password,int minLength){
        if(password.length()<minLength){
            throw new MissingMinimumLengthException("Password length is less than "+minLength);
        }
        return true;
    }

    public static boolean checkUpperCase(String password){
        if(!password.chars().anyMatch(Character::isUpperCase)){
            throw new MissingUpperCaseException("Password is missing UpperCase letter.");
        }
        return true;
    }

    public static boolean checkLowerCase(String password){
        if(!password.chars().anyMatch(Character::isLowerCase)){
            throw new MissingLowerCaseException("Password is missing LowerCase letter.");
        }
        return true;
    }
    public static boolean checkNumber(String password){
        if(!password.chars().anyMatch(Character::isDigit)){
            throw new MissingNumberException("Password is missing a Number.");
        }
        return true;
    }

}
