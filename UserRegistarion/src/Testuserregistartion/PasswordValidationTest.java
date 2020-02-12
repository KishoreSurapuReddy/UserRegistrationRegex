package Testuserregistartion;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import userregistration.PatternMatcher;

public class PasswordValidationTest {
    static PatternMatcher pattern ;
    String[] password = new String[]{"Kisore@1234","kishoRe$123","123&Abc","&%@Abc123"};
    String[] invalidPassword = new String[]{"abc","ABC123","123_-abC"};

    @BeforeClass
    public static void init(){
        pattern = PatternMatcherInstance.getInstance();
    }

    @Test
    public void validatePassword(){
        for(String name : password ){
            boolean validate = pattern.validatePassword(name);
            System.out.println("Password is valid :"+name+" "+validate);
            Assert.assertEquals(true , validate);
        }
    }

    @Test
    public void inValidatePassword(){
        for(String name : invalidPassword ){
            boolean validate = pattern.validatePassword(name);
            System.out.println("Password is valid :"+name+" "+validate);
            Assert.assertEquals(false , validate);
        }
    }
}
