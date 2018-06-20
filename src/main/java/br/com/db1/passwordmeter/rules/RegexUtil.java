package br.com.db1.passwordmeter.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    public static final String REGEX_LOWER = "[a-z]";
    public static final String REGEX_NUMBER = "[0-9]";
    public static final String REGEX_LETTERS_NUMBERS = "[A-z0-9]";
    public static final String REGEX_UPPERCASE = "[A-Z]";
    public static final String REGEX_LETTERS = "[A-z]";

    private static final String EMPTY_STRING = "";

    public static Integer countContains(String regex, String password){
        Integer newLength = password.replaceAll(regex,EMPTY_STRING).length();
        return password.length() - newLength;
    }

    public static Integer countNotContains(String regex, String password){
        return  password.length() - countContains(regex, password);
    }

    public static Integer countContainsConsecutive(String regex, String password){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        Integer occurrences = 0;
        while(matcher.find()) {
            occurrences++;
        }
        Integer contains = countContains(regex,password);
        return  contains == 0 ? 0 : contains - occurrences;
    }
}
