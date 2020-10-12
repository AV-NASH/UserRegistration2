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
        userInterface();
        scanner.close();
    }
    public static void userInterface() {
        String firstname = checkFirstName();
        String lastname = checkLastName();
        String email = checkEmailAddress();
        String phonenumber = checkPhoneNumber();
        String password = checkPassword();
        System.out.println("Thank you for registration");
    }

    public static boolean checkRegex(String regex,String userinput){

        boolean check=false;
        try{
            check= Pattern.matches(regex,userinput);
            if(!check){throw new InvalidDetailException("InvalidDetailException, you have entered in an invalid format");}
        }


        catch (NullPointerException e) {
            throw new InvalidDetailException("InvalidDetailException, you have entered in an invalid format");
        }
        finally {
            return check;
        }
    }

    public static String checkFirstName() {
        String firstname;
        boolean check;
        do {
            System.out.println("enter first name");
            firstname = scanner.nextLine();
            check = checkRegex(regexfirstname,firstname);
            if (!check)
                System.out.println("please enter valid first name");
        } while (!check);
        return firstname;

    }

    public static String checkLastName() {
        String lastname;
        boolean check;
        do {
            System.out.println("enter last name");
            lastname = scanner.nextLine();
            check = checkRegex(regexlastname, lastname);
            if (!check)
                System.out.println("please enter valid last name");
        } while (!check);
        return lastname;

    }

    public static String checkEmailAddress() {
        String email;
        boolean check;
        do {
            System.out.println("enter email address");
            email = scanner.nextLine();

            check = checkRegex(regexemailid,email);
            if (!check)
                System.out.println("please enter valid email");
        } while (!check);
        return email;

    }

    public static String checkPhoneNumber() {
        String phonenumber;
        boolean check;
        do {
            System.out.println("enter phone number");
            phonenumber = scanner.nextLine();
            check = checkRegex(regexphonenumber, phonenumber);
            if (!check)
                System.out.println("please enter phone number");
        } while (!check);
        return phonenumber;
    }

    public static String checkPassword() {
        String password;
        boolean check;
        do {
            System.out.println("enter password");
            password = scanner.nextLine();
            check = checkRegex(regexpassword, password);
            if (!check)
                System.out.println("please enter valid password");
        } while (!check);
        return password;

    }
}
