package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvalideWcTe {
    InvalideWc A = new InvalideWc();

    @Test
    public void weiger() {
        Assert.assertFalse(A.Weiger(false,true,false));
        Assert.assertTrue(A.Weiger(true,false,true));
        Assert.assertTrue(A.Weiger(true, true , false));
        Assert.assertFalse(A.Weiger(false, false,false));
    }
}