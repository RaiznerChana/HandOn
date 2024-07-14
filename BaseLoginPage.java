package org.baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BaseLoginPage extends BaseUIPage {

    protected BaseLoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.ID,using = "vm_userZehut")
    public WebElement txt_id;

    @FindBy(how = How.ID,using = "vm_userName")
    public WebElement txt_code;

    @FindBy(how = How.ID,using = "vm_password")
    public WebElement txt_password;

    @FindBy(how = How.NAME,using = "btnLogin")
    public WebElement txt_btnLogin;
}
