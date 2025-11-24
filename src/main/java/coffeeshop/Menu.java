package coffeeshop;

import java.util.Map;

public class Menu {

    Map<String, MenuItem> items;

    public MenuItem choose(String menuName) {
        return items.get(menuName);
    }
}
