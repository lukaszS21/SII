package Zadanie2;

public class Main {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        double price = 100.0;

        System.out.println("Regular discount: "
                + discountService.calculateDiscount(new RegularType(), price));
        System.out.println("VIP discount: "
                + discountService.calculateDiscount(new VipType(), price));
        System.out.println("Employee discount: "
                + discountService.calculateDiscount(new EmployeeType(), price));
    }
}
