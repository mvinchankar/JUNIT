package com.bridgelabz;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidationTestForPassword {

    private String argument;
    private static RegistrationOfUser userRegistration;
    private boolean expectedValidation;

    public ValidationTestForPassword(String argument, boolean expectedValidation)
    {
        this.argument = argument;
        this.expectedValidation = expectedValidation;
    }

    @BeforeClass
    public static void initialize()
    {
        userRegistration = new RegistrationOfUser();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][] {
                { "passwrod@123" ,false},
                { "Password@123" ,true},
                { "pass" ,false},
                { "2132131231" ,false},
                { "Password@@@@@@@" , false},
                { "passworD@123" ,true},
                { "AAAAAAAAAAAA@1213", true},
                { "password1234", false}};

        return Arrays.asList(data);
    }

    @Test
    public void Test()
    {
        Boolean result = userRegistration.validate_Password(this.argument);
        Assert.assertEquals(this.expectedValidation,result);
    }

}
