package coffeeshop;

import java.awt.*;

public class Customer {

    private Menu menu;
    private Barista barista;

    public void order(String menuName) {
        MenuItem item = menu.choose(menuName);
        Coffee coffee = barista.order(item);
    }
}
