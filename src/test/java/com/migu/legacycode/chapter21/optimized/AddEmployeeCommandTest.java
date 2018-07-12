package com.migu.legacycode.chapter21.optimized;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddEmployeeCommandTest {

    @Test
    public void getCommandChar() {
        Command command = new AddEmployeeCommand("maoziyuan", "", "", "", 10000);
        assertEquals(0x02, command.getCommandChar()[0]);
    }
}