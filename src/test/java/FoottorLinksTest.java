import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FoottorLinksTest {
    @Test
    public void qaTutorComFoottorLinks() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[text()='QATutor.com']")).click();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(currentUrl, "https://www.qatutor.com/", "Выполен переход не по нужной сслыке");
        driver.quit();
    }

    @Test
    public void testPortalFoottorLinks() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[text()='Test Portal']")).click();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(currentUrl, "https://www.sharelane.com/test_portal.html", "Выполен переход не по нужной сслыке");
        driver.quit();
    }

    @Test
    public void pythonSourceFilelMainPageFoottorLinks() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[text()='Python Source File']")).click();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(currentUrl, "https://www.sharelane.com/source_files/main_bright_normal.html", "Выполен переход не по нужной сслыке");
        driver.quit();
    }

}