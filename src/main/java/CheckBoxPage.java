import org.openqa.selenium.WebElement;

public class CheckBoxPage {

  private static final String PAGE = "CheckBoxPage";

  @SearchWith(inPage = CheckBoxPage.PAGE, locatorsFile = "src/main/resources/locators.json", name = "checkBox1")
  private WebElement checkBoxOne;

  @SearchWith(inPage = CheckBoxPage.PAGE, locatorsFile = "src/main/resources/locators.json", name = "checkBox2")
  private WebElement checkBoxTwo;

  public void unCheckCheckBoxTwo() {
    if (checkBoxTwo.isSelected()) {
      checkBoxTwo.click();
    }
  }

  public boolean isCheckBoxTwoUnchecked() {
    return (!checkBoxTwo.isSelected());
  }
}