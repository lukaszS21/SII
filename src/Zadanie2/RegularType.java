package Zadanie2;

public class RegularType implements Discount{

    @Override
    public double calculateDiscount(double price) {
        return price * 0.05;
    }
}
