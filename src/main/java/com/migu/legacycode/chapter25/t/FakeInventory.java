package com.migu.legacycode.chapter25.t;

public class FakeInventory extends Inventory {

    public Item itemForBarcode(Barcode code) {
        return new Item(code);
    }
}
