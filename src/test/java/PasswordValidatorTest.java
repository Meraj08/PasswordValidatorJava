import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.passwordValidator.exceptions.*;
import org.passwordValidator.validator.PasswordValidator;


public class PasswordValidatorTest {

    private PasswordValidator validator;

    @BeforeEach
    public void setup(){
        validator = new PasswordValidator();
    }
    // test case to validate password is null or not
    @Test
    public void testNullPassword(){
        Assertions.assertThrows(NullPasswordException.class,()->validator.validate(null));
    }

    // test case to validate length has minimum length
    @Test
    public void testShortPassword(){
        Assertions.assertThrows(MissingMinimumLengthException.class,()->validator.validate("Me1"));
    }

    // test case to validate password has lower case or not
    @Test
    public void testMissingLowerCase(){
        Assertions.assertThrows(MissingLowerCaseException.class,()->validator.validate("MERA1234"));
    }

    // test case to validate passwrod has upper case or not
    @Test
    public void testMissingUpperCase(){
        Assertions.assertThrows(MissingUpperCaseException.class,()->validator.validate("abcde1234"));
    }

    // test case to validate password has number or not
    @Test
    public void testMissingNumber(){
        Assertions.assertThrows(MissingNumberException.class,()->validator.validate("MERAJabc"));
    }

    // test case to validate password is valid or not
    @Test
    public void testValidPassword(){
        Assertions.assertTrue(validator.validate("MERAjabc123"));
    }
}
