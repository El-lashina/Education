package Module2_Collections.Example2;

public class Commodity {
    private String name;
    private int price;
    private String madeIn;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public Commodity(String name, int price, String madeIn) {
        this.name = name;
        this.price = price;
        this.madeIn = madeIn;
    }

    public Commodity() {
    }

    @Override
    public String toString() {
        return name + ";" + price + ";" +madeIn;
    }
}
