package Testuserregistartion;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import userregistration.PatternMatcher;

public class FirstNameValidationTest {
    static PatternMatcher pattern ;
    String[] firstName = new String[]{"Kishorereddy","Abc","Xyzabc"};
    String[] inValidFirstName = new String[]{"kishore","123-abc","Kishore_reddy"};

    @BeforeClass
    public static void init(){
        pattern = new PatternMatcher();
    }

    @Test
    public void validFirstName(){
        for(String name : firstName ){
            boolean validate = pattern.validateFirstName(name);
            System.out.println("FirstName is valid "+name+" "+validate);
            Assert.assertEquals(true , validate);
        }
    }

    @Test
    public void inValidFirstName(){
        for(String name : inValidFirstName ){
            boolean validate = pattern.validateFirstName(name);
            System.out.println("FirstName is valid "+name+" "+validate);
            Assert.assertEquals(false , validate);
        }
    }
}
