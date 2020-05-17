public class Furniture {
    private String name;
    private double price;
    private static double vatPercent = 0.10;


    public double getPriceWithVAT(){
        return price*vatPercent+price;
    }

    public double getPrice() {
        return price;
    }

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }
}