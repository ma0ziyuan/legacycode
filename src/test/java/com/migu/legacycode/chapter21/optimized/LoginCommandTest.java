package com.migu.legacycode.chapter21.optimized;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginCommandTest {

    @Test
    public void getCommandChar() {
        Command command = new LoginCommand("","");
        assertEquals(0x01,command.getCommandChar()[0]);
    }
}