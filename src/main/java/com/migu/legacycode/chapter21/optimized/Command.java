package com.migu.legacycode.chapter21.optimized;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class Command {
    private  static final byte[] header = {(byte) 0xde, (byte) 0xad};
    private static final byte[] footer = {(byte) 0xbe, (byte) 0xef};
    private static final int SIZE_LENGTH = 1;
    private static final int CMD_BYTE_LENGTH = 1;

    List<String> fields = new ArrayList<>();

    private void writeField(OutputStream outputStream, String field) throws IOException {
        outputStream.write(field.getBytes());
        outputStream.write(0x00);
    }

    protected abstract byte[] getCommandChar();

    public void write(OutputStream outputStream) throws Exception {
        outputStream.write(header);
        outputStream.write(getSize());
        outputStream.write(getCommandChar());
        writeBody(outputStream);
        outputStream.write(footer);
    }

    private int getSize() {
        return header.length +
                SIZE_LENGTH +
                CMD_BYTE_LENGTH +
                footer.length +
                getBodySize();
    }

    private int getFieldSize(String field) {
        return field.getBytes().length + 1;

    }

    private int getBodySize() {
        int result = 0;
        for (String filed:fields) {
            result += getFieldSize(filed);
        }
        return result;
    }

    private void writeBody(OutputStream outputStream) throws IOException {
        for (String field:fields) {
            writeField(outputStream,field);
        }
    }
}
