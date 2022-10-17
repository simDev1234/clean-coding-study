package decorator;

public class CaffeMocha implements Beverage {

    private Beverage caffeLatte;
    private int syrupPrice;
    public CaffeMocha(Beverage caffeLatte, int syrupPrice) {
        this.caffeLatte = caffeLatte;
        this.syrupPrice = syrupPrice;
    }

    @Override
    public String getName() {
        return "카페모카";
    }

    @Override
    public int getPrice() {
        return caffeLatte.getPrice() + syrupPrice;
    }
}
