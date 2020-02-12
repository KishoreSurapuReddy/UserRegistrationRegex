/**UserRegistration class is used to maintain the user details
 * @author kisorereddy
 * @version 1.0
 * @since 11-02-2020
 * @file UserRegistration.java
 */
package userregistration;

public class UserRegistration {
    private String firstName;
    private String lastName;
    private String userName;
    private String mailId;
    private String password;
    private String mobileNumber;

    //constructor
    public UserRegistration(){

    }

    //constructor with parameterised
    public UserRegistration(String firstName,String lastName,String userName,String mailId,String password,String mobileNumber){
        this.firstName = firstName ;
        this.lastName = lastName;
        this.userName = userName;
        this.mailId = mailId;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }
}
