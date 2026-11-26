package Zadanie8;

public class BaseScreen {

  String testType = "Unit";

  public void someCommonMethod() {
    if (testType.equals("Unit")) {
      System.out.println("Unit tests");
    } else if (testType.equals("E2E")) {
      System.out.println("E2E tests");
    } else {
      System.out.println("Undefined");
    }
  }

  public void setTestType(String testType) {
    this.testType = testType;
  }
}