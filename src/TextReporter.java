import java.util.List;

public class TextReporter implements Reporter{

    @Override
    public void generateReport(List<TestResult> results) {
        for (TestResult r : results) {
            System.out.println("Writing TXT: " + r.getName());
        }
    }
}
