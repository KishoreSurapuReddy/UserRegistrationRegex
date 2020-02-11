package userregistration;

public class UserRegistrationForm {
    static PatternMatcher pattern = new PatternMatcher();
    public void addUserDetails(){

    }
    public static void main(String[] args){
        UserRegistration user = new UserRegistration();
        String mail = "1098887462";
        System.out.println(pattern.validateMobileNumber(mail));
    }
}
