package com.cg.userregistrationtest;

import com.cg.userregistration.UserRegistration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;
@RunWith(Parameterized.class)
public class ParameterizedEmailTest {
    private String emailid;
    private boolean expectedresult;
    private UserRegistration EmailTest;



    @Before
    public void initialize() throws Exception {
        EmailTest=new UserRegistration();
    }

    public ParameterizedEmailTest(String emailid,boolean expectedresult) {
        super();
        this.emailid = emailid;
        this.expectedresult=expectedresult;
    }


    public boolean checkEmail(){
        return EmailTest.checkRegex(EmailTest.regexemailid,emailid);
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com", true},
                {"abc@gmail.com.com",false},
                {"abc+100@gmail.com",false},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com",false},
                {"abc@gmail.com.1a",false}});
    }

    @Test
    public void testEmailId() {

        assertEquals(expectedresult,checkEmail());
    }
}
