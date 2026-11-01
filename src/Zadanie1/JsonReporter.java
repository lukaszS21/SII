package Zadanie1;

import java.util.List;

public class JsonReporter implements Reporter {

    @Override
    public void generateReport(List<TestResult> results) {
        for (TestResult r : results) {
            System.out.println("Writing JSON: " + r.getName());
        }
    }
}
