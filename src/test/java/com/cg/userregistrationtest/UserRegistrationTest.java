package com.cg.userregistrationtest;

import com.cg.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    @Test
    public void whenfirstname_true_returnhappy() {
        UserRegistration useregistrartion=new UserRegistration();
        boolean  checkfirstname=useregistrartion.checkRegex(useregistrartion.regexfirstname,"Avinash");
        Assert.assertTrue("Happy",checkfirstname);
    }

    @Test
    public void whenfirstname_false_returnsad() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkfirstname=useregistrartion.checkRegex(useregistrartion.regexfirstname,"avinash");
        Assert.assertFalse("Sad",checkfirstname);
    }

    @Test
    public void whenlastname_true_returnhappy() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checklastname=useregistrartion.checkRegex(useregistrartion.regexlastname,"Singh");
        Assert.assertTrue("Happy",checklastname);
    }
    @Test
    public void whenlastname_false_returnsad() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checklastname=useregistrartion.checkRegex(useregistrartion.regexlastname,"singh");
        Assert.assertFalse("Sad",checklastname);
    }
    @Test
    public void whenemailid_true_returnhappy() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkemailid=useregistrartion.checkRegex(useregistrartion.regexemailid,"avi123@gmail.com");
        Assert.assertTrue("Happy",checkemailid);
    }
    @Test
    public void whenemailid_faslse_returnsad() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkemailid=useregistrartion.checkRegex(useregistrartion.regexemailid,"avi..@gmail.com");
        Assert.assertFalse("Sad",checkemailid);
    }
    @Test
    public void whenphonenumber_true_returnhappy() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkphonenumber=useregistrartion.checkRegex(useregistrartion.regexphonenumber,"91 9988774411");
        Assert.assertTrue("Happy",checkphonenumber);
    }
    @Test
    public void whenphonenumber_false_returnsad() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkphonenumber=useregistrartion.checkRegex(useregistrartion.regexphonenumber,"9988554477");
        Assert.assertFalse("Sad",checkphonenumber);
    }
    @Test
    public void whenppassword_true_returnhappy() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkpassword=useregistrartion.checkRegex(useregistrartion.regexpassword,"Acsd@dd1df2");
        Assert.assertTrue("Happy",checkpassword);
    }
    @Test
    public void whenppassword_false_returnsad() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkpassword=useregistrartion.checkRegex(useregistrartion.regexpassword,"acssfsd343");
        Assert.assertFalse("Sad",checkpassword);
    }
}