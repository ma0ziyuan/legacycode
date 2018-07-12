package com.migu.legacycode.chapter03;

import junit.framework.TestCase;

public class SaleTest extends TestCase {

    //fake example
    public void testDisplayAnItemFake() {
        FakeDisplay fakeDisplay = new FakeDisplay();
        Sale sale = new Sale(fakeDisplay);
        sale.scan("1");
        assertEquals("Milk $3.99",fakeDisplay.getLastLine());
    }


    //mock example
    /*public void testDisplayAnItemMock() {
        MockDisplay display = new MockDisplay();
        display.setExpectation("showLine","Milk $3.99");
        Sale sale = new Sale(display);
        sale.scan("1");
        display.verify();
    }*/
}
