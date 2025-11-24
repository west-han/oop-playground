package coffeeshop;

public class MenuItem {

    private String name;
    private int price;

    public boolean hasName(String name) {
        return this.name.equals(name);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
