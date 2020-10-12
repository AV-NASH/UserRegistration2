package com.cg.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static Scanner scanner = new Scanner(System.in);
    public static String regexfirstname="(^[A-Z])([a-zA-Z]){2,}";
    public static String regexlastname="(^[A-Z])([a-zA-Z]){2,}";
    public static String regexemailid="^[_a-zA-z0-9]+([\\-\\.]{1}+[_a-zA-z0-9]+)*[@]{1}+[_a-zA-z0-9]+[\\.]{1}+[_a-zA-z0-9]{2,}+([\\.]{1}+[a-zA-z]{2}+)*$";
    public static String regexphonenumber="^[0-9]{2}+[ ]{1}+[0-9]{10}";
    public static String regexpassword="(?=.*?[A-Z])(?=.*?[0-9])(?=[^!@#$%^&*-]*[!@#$%^&*-][^!@#$%^&*-]*$)[a-zA-Z0-9!@#$%6&*-]{8,}";

    public static void main(String[] args) {
        System.out.println("Welcome to the user registration program\n");
        UserRegistration userRegistration=new UserRegistration();
        userRegistration.userInterface();
        scanner.close();
    }
    public void userInterface() {
        UserRegistrationInterface userRegistrationInterface=(regex,detail)->{
            String userDetail;
            boolean check;
            do {
                System.out.println("enter "+detail);
                userDetail = scanner.nextLine();
                check = checkRegex(regex, userDetail);
                if (!check)
                    System.out.println("please enter valid "+detail);
            } while (!check);
            return userDetail;};

        String firstname = userRegistrationInterface.userDetails(regexfirstname,"First name");
        String lastname = userRegistrationInterface.userDetails(regexlastname,"last name");
        String email = userRegistrationInterface.userDetails(regexemailid,"Email-ID");
        String phonenumber = userRegistrationInterface.userDetails(regexphonenumber,"Phone Number");
        String password = userRegistrationInterface.userDetails(regexpassword,"Password");
        System.out.println("Thank you for registration");
    }

    public boolean checkRegex(String regex,String userinput){

        boolean check=false;
        checkRegexInterface checkRegexInterface=(regexString,userString)->Pattern.matches(regexString,userString);
        try{
            check= checkRegexInterface.checkRegex(regex,userinput);
            if(!check){throw new InvalidDetailException("InvalidDetailException, you have entered in an invalid format");}
        }


        catch (NullPointerException e) {
            throw new InvalidDetailException("InvalidDetailException, you have entered in an invalid format");
        }
        finally {
            return check;
        }
    }

}
