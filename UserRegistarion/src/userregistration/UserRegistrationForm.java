/**UserRegistration class is used to get the user details and validating the user details
 * @author kishorereddy
 * @version 1.0
 * @since 11-02-2020
 * @file UserRegistration.java
 */
package userregistration;
import java.util.InputMismatchException;

public class UserRegistrationForm {
    static PatternMatcher pattern = new PatternMatcher();
    static UserInputData user = new UserInputData();

    //method to get the user details and validating the details
    public static void addUserDetails(){
        String firstName;
        String lastName;
        String EMail_id;
        String userName;
        String password;
        String mobileNumber;
        System.out.println(" first name :");
        firstName = user.stringInputData();
        if (pattern.validateFirstName(firstName)){
            System.out.println(" last name :");
            lastName = user.stringInputData();
            if (pattern.validateLastName(lastName)){
                System.out.println(" User name :");
                userName = user.stringInputData();
                if (pattern.validateUserName(userName)){
                    System.out.println(" EMailId :");
                    EMail_id = user.stringInputData();
                    if (pattern.validateEMailId(EMail_id)){
                        System.out.println(" Password :");
                        password = user.stringInputData();
                        if (pattern.validatePassword(password)){
                            System.out.println(" MobileNumber :");
                            mobileNumber = user.stringInputData();
                            if (pattern.validateMobileNumber(mobileNumber)){
                                UserRegistration user = new UserRegistration(firstName,lastName,userName,EMail_id,password,mobileNumber);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new InputMismatchException("data was invalid");
    }

    public static void main(String[] args){
        addUserDetails();
    }
}
