import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReportService2 reportService2 = new ReportService2();
        List<TestResult> list =List.of(new TestResult(),new TestResult());

        reportService2.generateReport(new JsonReporter(),list);
    }
}