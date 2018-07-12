package com.migu.legacycode.chapter03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ATest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void doSomething() {
        A a = new A();
        assertEquals(120,a.doSomething());
        assertEquals(1,a.getAlpha());
    }
}