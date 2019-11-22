package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    RegistrationOfUser registrationOfUser = new RegistrationOfUser();

    @Test
    public void when_Given_First_Name_Should_Return_True() {
        Assert.assertTrue(registrationOfUser.validate_First_Name("Mangesh"));
        Assert.assertTrue(registrationOfUser.validate_First_Name("Priya"));
        Assert.assertTrue(registrationOfUser.validate_First_Name("Ravi"));
    }

    @Test
    public void when_Given_First_Name_Should_Return_False() {
        Assert.assertFalse(registrationOfUser.validate_First_Name("M312angesh"));
        Assert.assertFalse(registrationOfUser.validate_First_Name("123Mangesh"));
        Assert.assertFalse(registrationOfUser.validate_First_Name("MMangesh"));
        Assert.assertFalse(registrationOfUser.validate_First_Name("Om"));
    }

    @Test
    public void when_Given_Last_Name_Should_Return_True() {
        Assert.assertTrue(registrationOfUser.validate_Last_Name("Rai"));
        Assert.assertTrue(registrationOfUser.validate_Last_Name("Pau"));
        Assert.assertTrue(registrationOfUser.validate_Last_Name("Rao"));
    }

    @Test
    public void when_Given_Last_Name_Should_Return_False() {
        Assert.assertFalse(registrationOfUser.validate_Last_Name("h"));
        Assert.assertFalse(registrationOfUser.validate_Last_Name("1233223424"));
        Assert.assertFalse(registrationOfUser.validate_Last_Name("MasdaRao"));
        Assert.assertFalse(registrationOfUser.validate_Last_Name("asdad213123asdasd"));
    }

    @Test
    public void when_Given_Mobile_Number_Should_Return_True() {
        Assert.assertTrue(registrationOfUser.validate_Mobile_Number("91 9552967330"));
    }

    @Test
    public void when_Given_Mobile_Number_Should_Return_False() {
        Assert.assertFalse(registrationOfUser.validate_Mobile_Number("552967330"));
    }
}
