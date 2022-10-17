package decorator;

public class Main {
    public static void main(String[] args) {

        // 기존 객체
        Beverage water = new Water();
        water.printPrice();

        Beverage milk = new Milk();
        milk.printPrice();

        Beverage espresso = new Espresso();
        espresso.printPrice();

        // 새로운 객체 (데코레이터)
        Beverage americano = new Americano(espresso, water);
        americano.printPrice();

        Beverage caffeLatte = new CaffeLatte(espresso, milk);
        caffeLatte.printPrice();

        Beverage caffeMocha = new CaffeMocha(caffeLatte, 500);
        caffeMocha.printPrice();

    }
}
