package userregistration;

public class UserRegistration {
    private String firstName;
    private String lastName;
    private String userName;
    private String mailId;
    private String password;
    private String mobileNumber;

    public String getFirstName() {
        return firstName;
    }

    public UserRegistration(){

    }
    public UserRegistration(String firstName,String lastName,String userName,String mailId,String password,String mobileNumber){
        this.firstName = firstName ;
        this.lastName = lastName;
        this.userName = userName;
        this.mailId = mailId;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }
}
