package com.example.moore.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    //False means that the input would have been rejected as a password.
    //True means that the input would have been accepted as a password.

    @Test
    public void validatePassword() {
        String input = "PassWORD123";
        String output;
        String expected = "Strong";

        MainActivity mainac = new MainActivity();
        output = mainac.validatePassword(input);
        assertEquals(expected, output);
    }

    @Test
    public void validatePassword1() {
        String input = "pass123";
        String output;
        String expected = "Weak";

        MainActivity mainac = new MainActivity();
        output = mainac.validatePassword(input);
        assertEquals(expected, output);
    }

    @Test
    public void noNumbers() {
        String input = "password";
        Boolean output;
        Boolean expected = false;

        MainActivity mainac = new MainActivity();
        output = mainac.hasNumbers(input);
        assertEquals(expected, output);
    }

    @Test
    public void hasNumbers() {
        String input = "password123";
        Boolean output;
        Boolean expected = true;

        MainActivity mainac = new MainActivity();
        output = mainac.hasNumbers(input);
        assertEquals(expected, output);
    }

    @Test
    public void hasUpperCase() {
        String input = "Password123";
        Boolean output;
        Boolean expected = true;

        MainActivity mainac = new MainActivity();
        output = mainac.hasUpperCase(input);
        assertEquals(expected, output);
    }

    @Test
    public void noUpperCase() {
        String input = "password123";
        Boolean output;
        Boolean expected = false;

        MainActivity mainac = new MainActivity();
        output = mainac.hasUpperCase(input);
        assertEquals(expected, output);
    }

    @Test
    public void hasLowerCase() {
        String input = "PASSWORd123";
        Boolean output;
        Boolean expected = true;

        MainActivity mainac = new MainActivity();
        output = mainac.hasLowerCase(input);
        assertEquals(expected, output);
    }

    @Test
    public void noLowerCase() {
        String input = "PASSWORD123";
        Boolean output;
        Boolean expected = false;

        MainActivity mainac = new MainActivity();
        output = mainac.hasLowerCase(input);
        assertEquals(expected, output);
    }

    @Test
    public void isLongEnough() {
        String input = "PASSword123";
        Boolean output;
        Boolean expected = true;

        MainActivity mainac = new MainActivity();
        output = mainac.isLongEnough(input);
        assertEquals(expected, output);
    }

    @Test
    public void isntLongEnough() {
        String input = "word123";
        Boolean output;
        Boolean expected = false;

        MainActivity mainac = new MainActivity();
        output = mainac.isLongEnough(input);
        assertEquals(expected, output);
    }

    @Test
    public void isntPassword() {
        String input = "password123";
        Boolean output;
        Boolean expected = true;

        MainActivity mainac = new MainActivity();
        output = mainac.isntPassword(input);
        assertEquals(expected, output);
    }

    @Test
    public void isPassword() {
        String input = "PASSwOrd";
        Boolean output;
        Boolean expected = false;

        MainActivity mainac = new MainActivity();
        output = mainac.isntPassword(input);
        assertEquals(expected, output);
    }


}