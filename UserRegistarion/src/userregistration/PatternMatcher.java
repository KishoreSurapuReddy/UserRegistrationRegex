/**PatternMatcher is used to validate the user inputs
 * @author kishorereddy
 * @version 1.0
 * @since 11-02-2020
 * @file PatternMatcher.java
 */
package userregistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    private Pattern pattern;
    private Matcher matcher;

    /**this method is used to validate the UserName
     * @param UserName
     * @return boolean matcher
     */
    public boolean validateUserName(String UserName){
        final String USERNAME_VALIDATOR = "^[A-Za-z0-9_-]{5,15}$";
        pattern = Pattern.compile(USERNAME_VALIDATOR);
        matcher = pattern.matcher(UserName);
        return matcher.matches();
    }

    /**this method is used to validate the Password
     * @param password
     * @return boolean matcher
     */
    public boolean validatePassword(String password){
        final String PASSWORD = "((?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[@$%&]).{6,15})";
        pattern = Pattern.compile(PASSWORD);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    /**this method is used to validate the firstName
     * @param firstName
     * @return boolean matcher
     */
    public boolean validateFirstName(String firstName){
        final String FIRSTNAME_VALIDATOR = "^[[A-Z]{1}]+[a-z]{2,15}$";
        pattern = Pattern.compile(FIRSTNAME_VALIDATOR);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    /**this method is used to validate the lastName
     * @param lastName
     * @return boolean matcher
     */
    public boolean validateLastName(String lastName){
        final String LASTNAME_VALIDATOR = "^[[A-Z]{1}]+[a-z]{2,15}$";
        pattern = Pattern.compile(LASTNAME_VALIDATOR);
        matcher= pattern.matcher(lastName);
        return matcher.matches();
    }

    /**this method is used to validate the mailId
     * @param mailId
     * @return boolean matcher
     */
    public boolean validateEMailId(String mailId){
        final String MAIL_ID = "^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+.[A-Za-z].{2,4}$";
        pattern = Pattern.compile(MAIL_ID);
        matcher = pattern.matcher(mailId);
        return matcher.matches();
    }

    /**this method is used to validate the mobileNumber
     * @param mobileNumber
     * @return boolean matcher
     */
    public boolean validateMobileNumber(String mobileNumber){
        final String NUMBER_VALIDATOR = "^[1-9]{2}+\\s?+[[1-9]{1}][0-9]{9}";
        pattern = Pattern.compile(NUMBER_VALIDATOR);
        matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
}
