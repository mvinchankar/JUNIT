package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationOfUser {

    public static boolean validate_First_Name(String firstName) {
        Pattern firstNamePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher m = firstNamePattern.matcher(firstName);
        System.out.println(m.matches());
        if (m.matches())
            return true;
        else
            return false;
    }
}
