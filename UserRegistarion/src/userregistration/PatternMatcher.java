package userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    private Pattern pattern;
    private Matcher matcher;

    public boolean validateUserName(String UserName){
        final String USERNAME_VALIDATOR = "^[A-Za-z0-9_-]{5,15}$";
        pattern = Pattern.compile(USERNAME_VALIDATOR);
        matcher = pattern.matcher(UserName);
        return matcher.matches();
    }

    public boolean validatePassword(String password){
        final String PASSWORD = "((?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[@$%&]).{6,15})";
        pattern = Pattern.compile(PASSWORD);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean validateMailId(String mailId){
        final String MAIL_ID = "^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+.[A-Za-z].{2,4}$";
        pattern = Pattern.compile(MAIL_ID);
        matcher = pattern.matcher(mailId);
        return matcher.matches();
    }

    public boolean validateMobileNumber(String mobileNumber){
        final String NUMBER_VALIDATOR = "^[[1-9]{1}][0-9]{9}";
        pattern = Pattern.compile(NUMBER_VALIDATOR);
        matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
}
