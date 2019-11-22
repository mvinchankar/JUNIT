package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationOfUser {
    final static Pattern firstNamePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");

    public static boolean validate_First_Name(String firstName) {
        Matcher m = firstNamePattern.matcher(firstName);
        if (m.matches())
            return true;
        return false;
    }
    public static boolean validate_Last_Name(String lastName) {
        Matcher m = firstNamePattern.matcher(lastName);
        if (m.matches())
            return true;
        return false;
    }
}
