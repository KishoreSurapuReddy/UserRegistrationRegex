package Testuserregistartion;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import userregistration.PatternMatcher;

public class LastNameValidationTest {
    static PatternMatcher pattern ;
    String[] lastName = new String[]{"Surapureddy","Abc"};
    String[] invalidLastName = new String[]{"abc","123Abc","ABC"};

    @BeforeClass
    public static void init(){
        pattern = PatternMatcherInstance.getInstance();
    }

    @Test
    public void validateLastName(){
        for (String name : lastName){
            boolean validate = pattern.validateLastName(name);
            System.out.println("LastName is valid :"+name+" "+validate);
            Assert.assertEquals(true,validate);
        }
    }

    @Test
    public void inValidLastName(){
        for (String name : invalidLastName){
            boolean validate = pattern.validateLastName(name);
            System.out.println("LastName is valid :"+name+" "+validate);
            Assert.assertEquals(false,validate);
        }
    }
}
