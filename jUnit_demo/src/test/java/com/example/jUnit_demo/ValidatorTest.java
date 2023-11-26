package com.example.jUnit_demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;


class ValidatorTest {

    @Test
    public void testIsPhoneNumberValid() {
        // Valid phone numbers

        assertTrue(Validator.isPhoneNumberValid("012345"));
        assertTrue(Validator.isPhoneNumberValid("0123456789"));

        // Invalid phone numbers
        assertFalse(Validator.isPhoneNumberValid("12345")); // Does not start with 0
        assertFalse(Validator.isPhoneNumberValid("01234567890")); // Too long
        assertFalse(Validator.isPhoneNumberValid("0123a5")); // Contains non-numeric characters
    }

    @Test
    public void testEmailValid() {


        assertTrue(Validator.isEmailValid("test@example.com"));
        assertTrue(Validator.isEmailValid("user@mail.example.co.uk"));
        assertFalse(Validator.isEmailValid("invalid-email"));
        assertFalse(Validator.isEmailValid("test@"));
        assertFalse(Validator.isEmailValid("@example.com"));
        assertFalse(Validator.isEmailValid("test@.com"));
        assertFalse(Validator.isEmailValid("test@example."));


    }

}