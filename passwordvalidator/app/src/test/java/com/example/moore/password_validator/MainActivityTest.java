package com.example.moore.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

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