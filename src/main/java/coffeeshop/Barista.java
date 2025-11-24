package coffeeshop;

public class Barista {

    public Coffee order(MenuItem item) {
        return new Coffee(item.getName(), item.getPrice());
    }
}
