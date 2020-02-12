package Testuserregistartion;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import userregistration.PatternMatcher;

public class PhoneNumberValidationTest {
    static PatternMatcher pattern;
    String[] phoneNumber = new String[]{"91 1234567890","45 4561237890"};
    String[] invalidPhoneNumber = new String[]{"1234567980","123456","91 123456789123"};

    @BeforeClass
    public static void init(){
        pattern = PatternMatcherInstance.getInstance();
    }

    @Test
    public void validatePhoneNumber(){
        for(String number : phoneNumber){
            boolean validate = pattern.validateMobileNumber(number);
            System.out.println("PhoneNumber is valid :"+number+" "+validate);
            Assert.assertEquals(true , validate );
        }
    }

    @Test
    public void inValidatePhoneNumber(){
        for( String number : invalidPhoneNumber ){
            boolean validate = pattern.validateMobileNumber(number);
            System.out.println("PhoneNumber is valid :"+number+" "+validate);
            Assert.assertEquals(false , validate );
        }
    }
}


