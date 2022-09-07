import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void startTrello() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        wd.close();
        wd.quit();
    }

    WebElement el1 = wd.findElement(By.tagName("a"));
    WebElement el2 = wd.findElement(By.tagName("div"));
    WebElement el3 = wd.findElement(By.id("skip-to-content"));
    WebElement el4 = wd.findElement(By.className("visually-hidden"));
    WebElement el5 = wd.findElement(By.linkText("Log in"));

    // css
    WebElement elc1 = wd.findElement(By.cssSelector("#skip-to-content"));
    WebElement elc2 = wd.findElement(By.cssSelector(".visually-hidden"));
    WebElement elc3 = wd.findElement(By.cssSelector("[data-testid='smallnav']"));

    // for Log In
    WebElement l1 = wd.findElement(By.cssSelector("[href='/login']"));
    WebElement l2 = wd.findElement(By.cssSelector("#user"));
    WebElement l3 = wd.findElement(By.cssSelector("#login"));
    WebElement l4 = wd.findElement(By.cssSelector("#password"));
    WebElement l5 = wd.findElement(By.cssSelector("#login-submit"));
    WebElement l6 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-button']"));
    WebElement l7 = wd.findElement(By.cssSelector(".m2N684FcksCyfT"));

    // for log out
    WebElement l8 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-button']"));
    WebElement l9 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-logout']"));
    WebElement l10 = wd.findElement(By.cssSelector("#logout-submit"));

    // main page
    WebElement l11 = wd.findElement(By.cssSelector("[href='/home']"));
    WebElement l12 = wd.findElement(By.cssSelector("[data-testid='logo_link']"));
    WebElement l13 = wd.findElement(By.cssSelector("[data-testid='bignav-tab']"));


}
