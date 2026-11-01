package Zadanie2;

public class EmployeeType implements Discount {


    @Override
    public double calculateDiscount(double price) {
        return price * 0.30;
    }


}
