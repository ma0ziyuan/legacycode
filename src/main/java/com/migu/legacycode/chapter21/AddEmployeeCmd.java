package com.migu.legacycode.chapter21;

import java.io.OutputStream;

public class AddEmployeeCmd {
    private String name;
    private String address;
    private String city;
    private String state;
    private String yearlySalary;

    private static final byte[] header = {(byte) 0xde, (byte) 0xad};
    private static final byte[] cmommandChar = {0x02};
    private static final byte[] footer = {(byte) 0xbe, (byte) 0xef};
    private static final int SIZE_LENGTH = 1;
    private static final int CMD_BYTE_LENGTH = 1;

    private int getSize() {
        return header.length +
                SIZE_LENGTH +
                CMD_BYTE_LENGTH +
                footer.length +
                name.getBytes().length + 1 +
                address.getBytes().length + 1 +
                city.getBytes().length + 1 +
                state.getBytes().length + 1 +
                yearlySalary.getBytes().length + 1;
    }

    public AddEmployeeCmd(String name, String address, String city, String state, int yearlySalary) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.yearlySalary = Integer.toString(yearlySalary);
    }

    public void write(OutputStream outputStream) throws Exception {
        outputStream.write(header);
        outputStream.write(getSize());
        outputStream.write(cmommandChar);
        outputStream.write(name.getBytes());
        outputStream.write(0x00);
        outputStream.write(address.getBytes());
        outputStream.write(0x00);
        outputStream.write(city.getBytes());
        outputStream.write(0x00);
        outputStream.write(state.getBytes());
        outputStream.write(0x00);
        outputStream.write(yearlySalary.getBytes());
        outputStream.write(0x00);
        outputStream.write(footer);
    }
}
