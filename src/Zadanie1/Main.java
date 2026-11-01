package Zadanie1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReportService2 reportService = new ReportService2();
        List<TestResult> results = List.of(new TestResult(), new TestResult());

        reportService.generateReport(new JsonReporter(), results);
    }
}
