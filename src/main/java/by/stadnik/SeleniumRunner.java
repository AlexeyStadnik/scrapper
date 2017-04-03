package by.stadnik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;

/**
 * Created by aliaksei on 3/31/17.
 */
public class SeleniumRunner {
  public static void main(String[] args) {

    //"/Users/aliaksei/Soft/phantomjs-2.1.1-macosx/bin/phantomjs"
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setJavascriptEnabled(true);
    caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/Users/aliaksei/Soft/phantomjs-2.1.1-macosx/bin/phantomjs");

    WebDriver driver = new PhantomJSDriver(caps);
    driver.navigate().to("http://www.hm.com/us/products/ladies");
    List<WebElement> elements = driver.findElements(By.className("product-list-item"));

    for (WebElement webElement : elements) {
      System.out.println(webElement.findElement(By.className("product-title")).getText());
      System.out.println(webElement.findElement(By.className("price")).getText());
      System.out.println(webElement.findElement(By.className("product-url")).getAttribute("href"));
    }
  }
}

