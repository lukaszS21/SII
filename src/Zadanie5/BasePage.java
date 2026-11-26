package Zadanie5;

abstract class BasePage {
    protected final WebDriver driver;
    BasePage(WebDriver driver) { this.driver = driver; }

    protected void click(By by)             { driver.findElement(by).click(); }
    protected void type(By by, String text) { driver.findElement(by).sendKeys(text); }

    public void logout()   { click(By.id("logout")); } 
    public void openMenu() { click(By.id("menu")); } 
}

class LoginPage extends BasePage { 
    LoginPage(WebDriver driver) { super(driver); }

    void loginAs(String user, String pass) {
        type(By.id("user"), user);
        type(By.id("pass"), pass);
        click(By.id("submit"));
    }
}