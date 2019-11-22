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
    }
    @Test
    public void when_Given_First_Name_Should_Return_False(){
        Assert.assertFalse(registrationOfUser.validate_First_Name("M312angesh"));
        Assert.assertFalse(registrationOfUser.validate_First_Name("123Mangesh"));
        Assert.assertFalse(registrationOfUser.validate_First_Name("MMangesh"));
        Assert.assertFalse(registrationOfUser.validate_First_Name("Om"));
    } @Test
    public void when_Given_Last_Name_Should_Return_True() {
        Assert.assertTrue(registrationOfUser.validate_Last_Name("Rai"));
        Assert.assertTrue(registrationOfUser.validate_Last_Name("Pau"));
        Assert.assertTrue(registrationOfUser.validate_Last_Name("Rao"));
    }
    @Test
    public void when_Given_Last_Name_Should_Return_False(){
        Assert.assertFalse(registrationOfUser.validate_Last_Name("h"));
        Assert.assertFalse(registrationOfUser.validate_Last_Name("1233223424"));
        Assert.assertFalse(registrationOfUser.validate_Last_Name("MasdaRao"));
        Assert.assertFalse(registrationOfUser.validate_Last_Name("asdad213123asdasd"));
    }
    @Test
    public void when_Given_Email_ID_Should_Return_True() {
        Assert.assertTrue(registrationOfUser.validate_Email_Id("abc@bridgelabz.com"));
        Assert.assertTrue(registrationOfUser.validate_Email_Id("abc.xyz@bridgelabz.com"));
        Assert.assertTrue(registrationOfUser.validate_Email_Id("abc@1.com"));
    }
}
