
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageFactoryDemo {

  private WebDriver driver;

  @BeforeClass
  public void setup() {
    driver = new ChromeDriver();
  }

  @AfterClass
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void testMethod() {
    driver.get("https://the-internet.herokuapp.com/");
    HomePage homePage = new HomePage();
    ElementLocatorFactory factory = new FileBasedElementLocatorFactory(driver);
    PageFactory.initElements(factory, homePage);
    CheckBoxPage checkboxPage = homePage.navigateToCheckBoxPage();
    PageFactory.initElements(factory, checkboxPage);
    checkboxPage.unCheckCheckBoxTwo();
    Assert.assertTrue(checkboxPage.isCheckBoxTwoUnchecked());
  }
}