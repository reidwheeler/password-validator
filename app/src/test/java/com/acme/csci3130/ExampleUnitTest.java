package com.acme.csci3130;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest extends MainActivity{
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testIsPassword() throws Exception {
        String pass1 = "password";
        String pass2 = "Password";
        String pass3 = "goewitgnwro";
        assertTrue(Validate(pass1)<2);
        assertTrue(Validate(pass2)<3);
        assertTrue(Validate(pass3)==2);
    }

    @Test
    public void testPasswordLength() throws Exception {
        String pass1 = "qwertyu";
        String pass2 = "qwertyui";
        String pass3 = "qwertyuio";
        assertTrue(Validate(pass1)<2);
        assertTrue(Validate(pass2)==2);
        assertTrue(Validate(pass3)==2);
    }

    @Test
    public void testContainsDigit() throws Exception {
        String pass1 = "qwertyui";
        String pass2 = "qwertyui6";
        assertTrue(Validate(pass1)<3);
        assertTrue(Validate(pass2)==3);
    }

    @Test
    public void testContainsCapital() throws Exception {
        String pass1 = "Yqwertuio";
        String pass2 = "qwertyuio";
        String pass3 = "qwHrKuio";
        assertTrue(Validate(pass1)==3);
        assertTrue(Validate(pass2)<3);
        assertTrue(Validate(pass3)==3);
    }

    @Test
    public void testContainsSpecialChar() throws Exception {
        String pass1 = "qwertuio";
        String pass2 = "qwer$yuio";
        assertTrue(Validate(pass1)<3);
        assertTrue(Validate(pass2)==3);
    }
}