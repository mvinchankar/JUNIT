package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class UserRegistrationTest {

    RegistrationOfUser registrationOfUser = new RegistrationOfUser();

    @Test
    public void when_Given_First_Name_Should_Return_True() {
        Assert.assertTrue(registrationOfUser.validate_First_Name("Mangesh"));
        Assert.assertTrue(registrationOfUser.validate_First_Name("Priya"));
        Assert.assertTrue(registrationOfUser.validate_First_Name("Ravi"));
    }@Test
    public void when_Given_First_Name_Should_Return_False(){
        Assert.assertFalse(registrationOfUser.validate_First_Name("M312angesh"));
        Assert.assertTrue(registrationOfUser.validate_First_Name("123Mangesh"));
        Assert.assertTrue(registrationOfUser.validate_First_Name("MMangesh"));
        Assert.assertTrue(registrationOfUser.validate_First_Name("Om"));
    }


}
