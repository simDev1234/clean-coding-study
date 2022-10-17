package decorator;

public class CaffeLatte implements Beverage {

    private Beverage espresso;
    private Beverage milk;

    public CaffeLatte(Beverage espresso, Beverage milk) {
        this.espresso = espresso;
        this.milk = milk;
    }

    @Override
    public String getName() {
        return "카페라테";
    }

    @Override
    public int getPrice() {
        return espresso.getPrice() + milk.getPrice();
    }
}
