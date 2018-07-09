package com.migu.legacycode.chapter25.a;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ARMDispatcherTest {
    ARMDispatcher armDispatcher;

    @Before
    public void setUp() throws Exception {
        armDispatcher = new ARMDispatcher();
    }

    @Test
    public void testPopulateWithStringValue() {
        armDispatcher.populate("aaa");
        assertEquals("aaa", armDispatcher.getMarketBindings().get(ARMDispatcher.pageStateName));
    }

    @Test
    public void testPopulateWithParameterSource() {
        armDispatcher.populate(new FakeParameterSource());
        assertEquals("FakeParameterSource",armDispatcher.getMarketBindings().get(ARMDispatcher.pageStateName));
    }
}
