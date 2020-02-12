package Testuserregistartion;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import userregistration.PatternMatcher;
import userregistration.UserRegistrationForm;

public class UserRegistrationTest {
    static PatternMatcher pattern;
    @BeforeClass
    public static void init(){
        pattern = new PatternMatcher();
    }
    String[] mail_id = new String[]{"kishore@gmail.com","123.kishore@0909gmail.com","abc.@gmail.com"};
    String[] invalid_mail = new String[]{"abc@@.com","abc@","123.abc-_"};

    @Test
    public void validateEMailId(){
        for ( String mail : mail_id ){
            boolean validate = pattern.validateEMailId(mail);
            System.out.println("Mail_id is valid :"+mail +" "+validate);
            Assert.assertEquals(true , validate);
        }
    }

    @Test
    public void inValidateEMailId(){
        for ( String mail : invalid_mail ){
            boolean validate = pattern.validateEMailId(mail);
            System.out.println("Mail_id is valid :"+mail +" "+validate);
            Assert.assertEquals(false , validate);
        }
    }
}
