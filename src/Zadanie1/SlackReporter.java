package Zadanie1;

import java.util.List;

public class SlackReporter implements Reporter {

    @Override
    public void generateReport(List<TestResult> results) {
        if (!System.getenv().toString().equals("uat")) {
            for (TestResult r : results) {
                System.out.println("Writing TXT: " + r.getName());
            }
        } else throw new UnsupportedOperationException("brak polaczenia");

    }
}
