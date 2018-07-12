package com.migu.legacycode.chapter03;

public class FakeDisplay implements Display {
    private String lastLine = "";
    public void showLine(String line) {
        lastLine = line;
    }

    public String getLastLine() {
        return lastLine;
    }
}
