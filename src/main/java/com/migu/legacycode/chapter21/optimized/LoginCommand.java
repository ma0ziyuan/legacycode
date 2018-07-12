package com.migu.legacycode.chapter21.optimized;

public class LoginCommand extends Command {
    protected byte[] getCommandChar() {
        return new byte[]{0x01};
    }


    LoginCommand(String userName, String passwd) {
        fields.add(userName);
        fields.add(passwd);
    }
}
