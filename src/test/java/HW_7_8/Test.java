package HW_7_8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Test {
    static {
        WebDriverManager.chromedriver().setup(); // скопировано отсюда
        // https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
        // пойдет посмотрит какой последний драйвер существует, если у нас не последний, он его подтянет
    }

    private WebDriver driver;

    @org.testng.annotations.Test
    public void testFirst() throws InterruptedException {

//        ChromeDriver driver = new ChromeDriver(); // здесь мы создаем объект ChromeDriver, который будет
//        // управлять нашим браузером и следующей командой -
        driver.get("https://www.selenium.dev/selenium/web/web-form.html"); // мы говорим пойди и открой эту страничку
        Thread.sleep(3000);
    }

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }
}
