package com.cg.userregistrationtest;

import com.cg.userregistration.InvalidDetailException;
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
    public void whenfirstname_false_throwException() {
        UserRegistration  useregistrartion=new UserRegistration();
        try{
        boolean  checkfirstname=useregistrartion.checkRegex(useregistrartion.regexfirstname,null);
        } catch (InvalidDetailException e) {
            Assert.assertEquals("InvalidDetailException, you have entered in an invalid format",e.getMessage());
        }

    }

    @Test
    public void whenlastname_true_returnhappy() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checklastname=useregistrartion.checkRegex(useregistrartion.regexlastname,"Singh");
        Assert.assertTrue("Happy",checklastname);
    }
    @Test
    public void whenlastname_false_throwException() {
        UserRegistration  useregistrartion=new UserRegistration();
        try{
            boolean  checcklastnmae=useregistrartion.checkRegex(useregistrartion.regexlastname,null);
        } catch (InvalidDetailException e) {
            Assert.assertEquals("InvalidDetailException, you have entered in an invalid format",e.getMessage());
        }

    }
    @Test
    public void whenemailid_true_returnhappy() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkemailid=useregistrartion.checkRegex(useregistrartion.regexemailid,"avi123@gmail.com");
        Assert.assertTrue("Happy",checkemailid);
    }
    @Test
    public void whenemailid_faslse_throwException() {
        UserRegistration  useregistrartion=new UserRegistration();
        try{
            boolean  checkemailid=useregistrartion.checkRegex(useregistrartion.regexemailid,null);
        } catch (InvalidDetailException e) {
            Assert.assertEquals("InvalidDetailException, you have entered in an invalid format",e.getMessage());
        }

    }
    @Test
    public void whenphonenumber_true_returnhappy() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkphonenumber=useregistrartion.checkRegex(useregistrartion.regexphonenumber,"91 9988774411");
        Assert.assertTrue("Happy",checkphonenumber);
    }
    @Test
    public void whenphonenumber_false_throwException() {
        UserRegistration  useregistrartion=new UserRegistration();
        try{
            boolean  checkphonenumber=useregistrartion.checkRegex(useregistrartion.regexphonenumber,null);
        } catch (InvalidDetailException e) {
            Assert.assertEquals("InvalidDetailException, you have entered in an invalid format",e.getMessage());
        }

    }
    @Test
    public void whenppassword_true_returnhappy() {
        UserRegistration  useregistrartion=new UserRegistration();
        boolean  checkpassword=useregistrartion.checkRegex(useregistrartion.regexpassword,"Acsd@dd1df2");
        Assert.assertTrue("Happy",checkpassword);
    }
    @Test
    public void whenppassword_false_throwException() {
        UserRegistration  useregistrartion=new UserRegistration();
        try{
            boolean  checkpassword=useregistrartion.checkRegex(useregistrartion.regexpassword,null);
        } catch (InvalidDetailException e) {
            Assert.assertEquals("InvalidDetailException, you have entered in an invalid format",e.getMessage());
        }

    }
}