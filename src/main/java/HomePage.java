import org.openqa.selenium.WebElement;

public class HomePage {

  public static final String PAGE = "HomePage";
  @SearchWith(inPage = HomePage.PAGE, locatorsFile = "src/main/resources/locators.json", name = "abTesting")
  private WebElement abTestingLink = null;

  @SearchWith(inPage = HomePage.PAGE, locatorsFile = "src/main/resources/locators.json", name = "checkBox")
  private WebElement checkBoxLink = null;

  public HomePage() {
  }

  public CheckBoxPage navigateToCheckBoxPage() {
    checkBoxLink.click();
    return new CheckBoxPage();
  }
}