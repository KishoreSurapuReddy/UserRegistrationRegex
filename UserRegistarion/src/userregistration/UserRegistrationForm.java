/**
 * UserRegistration class is used to get the user details and validating the user details
 *
 * @author kishorereddy
 * @version 1.0
 * @file UserRegistration.java
 * @since 11-02-2020
 */
package userregistration;

public class UserRegistrationForm {
    static PatternMatcher pattern = new PatternMatcher();
    static UserInputData user = new UserInputData();

    //method to get the user details and validating the details
    public static boolean addUserDetails() {
        String firstName;
        String lastName;
        String eMailId;
        String userName;
        String password ;
        String mobileNumber;
        System.out.println(" first name :");
        firstName = user.stringInputData();
        if (!pattern.validateFirstName(firstName)) {
            System.out.println("enter valid first name");
            return false;
        }
        System.out.println(" last name :");
        lastName = user.stringInputData();
        if (!pattern.validateLastName(lastName)) {
            System.out.println("enter valid last name");
            return false;
        }
        System.out.println(" EMailId :");
        eMailId = user.stringInputData();
        if (!pattern.validateEMailId(eMailId)) {
            System.out.println("enter valid eMailId ");
            return false;
        }
        System.out.println(" User name :");
        userName = user.stringInputData();
        if (!pattern.validateUserName(userName)) {
            System.out.println("enter valid user name");
            return false;
        }
        System.out.println(" Password :");
        password = user.stringInputData();
        if (!pattern.validatePassword(password)) {
            System.out.println("enter valid password ");
            return false;
        }
        System.out.println(" MobileNumber :");
        mobileNumber = user.stringInputData();
        if (!pattern.validateMobileNumber(mobileNumber)) {
            System.out.println("enter valid mobileNumber");
            return false;
        }
        UserRegistration user = new UserRegistration(firstName, lastName, userName, eMailId, password, mobileNumber);
        return  true;
    }

    public static void main(String[] args) {
        while(!addUserDetails()){

        }
    }
}
