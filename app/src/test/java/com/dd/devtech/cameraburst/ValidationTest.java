package com.dd.devtech.cameraburst;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationTest {

    private Validation validation;

    @Before
    public void setUp() throws Exception {
        validation = new Validation();
    }

    @Test
    public void testIsValidEmailId() {
        Boolean actual = validation.isValidEmailId("ritesh@gmail.com");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testIsValidEmailIdForNull() {
        Boolean actual = validation.isValidEmailId(null);
        Assert.assertEquals(false, actual);
    }
    @Test
    public void testIsValidEmailForBlank() {
        Boolean actual = validation.isValidEmailId("");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void testIsValidEmailForSpace() {
        Boolean actual = validation.isValidEmailId("  ");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void testIsValidEmailForContainsCom() {
        Boolean actual = validation.isValidEmailId("a@a.com");
        Assert.assertEquals(true, actual);
    }
}