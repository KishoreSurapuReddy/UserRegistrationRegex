package Testuserregistartion;

import userregistration.PatternMatcher;

public class PatternMatcherInstance {
    private static final PatternMatcher pattern = new PatternMatcher();
    public static PatternMatcher getInstance(){
        return pattern;
    }
}
