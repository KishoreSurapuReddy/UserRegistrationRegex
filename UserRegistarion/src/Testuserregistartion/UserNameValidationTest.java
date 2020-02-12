package Testuserregistartion;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import userregistration.PatternMatcher;

public class UserNameValidationTest {
    static PatternMatcher pattern;
    String[] userName = new String[]{"Kishore1234","abc-123","abc_123","123_abc"};
    String[] invalidUserName = new String[]{"@abc","_abc@123","$123"};
    @BeforeClass
    public static void init(){
        pattern = PatternMatcherInstance.getInstance();
    }

    @Test
    public void validateUserName(){
        for (String username : userName){
            boolean validate = pattern.validateUserName(username);
            System.out.println("UserName is Valid :"+username+" "+validate);
            Assert.assertEquals(true , validate);
        }
    }

    @Test
    public void inValidateUserName(){
        for (String username : invalidUserName){
            boolean validate = pattern.validateUserName(username);
            System.out.println("UserName is Valid :"+username+" "+validate);
            Assert.assertEquals(false , validate);
        }
    }
}
