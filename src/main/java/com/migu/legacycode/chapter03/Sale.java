package com.migu.legacycode.chapter03;

public class Sale {
    private Display display;

    public Sale(Display display) {
        this.display = display;
    }

    public void scan(String barcode) {
        //String itemLine = item.name() + " " + item.price.asDisplayText();
        String itemLine = "Milk $3.99";
        display.showLine(itemLine);
    }
}
