import Zadanie1.JsonReporter;
import Zadanie1.ReportService2;
import Zadanie1.TestResult;
import Zadanie2.DiscountService;
import Zadanie2.EmployeeType;
import Zadanie2.RegularType;
import Zadanie2.VipType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReportService2 reportService2 = new ReportService2();
        List<TestResult> list = List.of(new TestResult(), new TestResult());

        reportService2.generateReport(new JsonReporter(), list);

        DiscountService discountService = new DiscountService();
        double price = 100.0;

        System.out.println("Regular discount: " +
                discountService.calculateDiscount(new RegularType(), price));
        System.out.println("VIP discount: " +
                discountService.calculateDiscount(new VipType(), price));
        System.out.println("Employee discount: " +
                discountService.calculateDiscount(new EmployeeType(), price));
    }
}