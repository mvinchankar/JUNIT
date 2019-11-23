package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationOfUser {
    final static Pattern namePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    final static Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9]([._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2}){0,1}$");
    final static Pattern mobileNumberPattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}");
    final static Pattern passwordPattern = Pattern.compile("((?=.*[0-9])(?=.*[a-z]*)(?=.*[A-Z])(?=.*[@#$%]).{8,})");

    public static boolean validate_First_Name(String firstName) {
        Matcher m = namePattern.matcher(firstName);
        if (m.matches())
            return true;
        return false;
    }

    public static boolean validate_Last_Name(String lastName) {
        Matcher m = namePattern.matcher(lastName);
        if (m.matches())
            return true;
        return false;
    }

    public static boolean validate_Email_Id(String emailID) {
        Matcher m = emailPattern.matcher(emailID);
        if (m.matches())
            return true;
        return false;
    }

    public static boolean validate_Mobile_Number(String mobileNumber) {
        Matcher m = mobileNumberPattern.matcher(mobileNumber);
        if (m.matches())
            return true;
        return false;
    }
    public static boolean validate_Password(String password) {
        Matcher m = passwordPattern.matcher(password);
        if (m.matches())
            return true;
        return false;
    }



}
