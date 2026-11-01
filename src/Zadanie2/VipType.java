package Zadanie2;

public class VipType implements Discount{

    @Override
    public double calculateDiscount(double price) {
        return price * 0.15;
    }
}
