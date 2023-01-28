package pageObjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CreateNewUserPage {
  @FindBy(xpath =" //div[@class='label' and (.='Users')]")private WebElement usertab;
  }
}
