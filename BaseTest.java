package org.baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.webActions.WaitWebActions;
import org.webActions.WebActions;

public class BaseTest {

    public WebDriver driver;
    public WebActions webActions;
    public WaitWebActions waitWebActions;


    private final static String url = "https://ps.btl.gov.il/#/login";
    public final static String id = "305111619";
    private final static String code = "DN8XYMSK";
    private final static String password = "jbhrhhzbr5";




    @BeforeClass
    public void beforeClass() {
        initBrowser();
        initWebActions();
        login();
    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }


    private void initBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    private void initWebActions() {
        webActions = new WebActions(driver);
        waitWebActions= new WaitWebActions(driver);

    }

    private void login() {
        BaseLoginPage loginPage = new BaseLoginPage(driver);
        webActions.setText(loginPage.txt_id, id);
        webActions.setText(loginPage.txt_code, code);
        webActions.setText(loginPage.txt_password, password);
        webActions.clickOnButton(loginPage.txt_btnLogin);
        //waitWebActions.waitForElementNotBeExist(loginPage.btn_login);
        waitWebActions.WaitForElementNotBeExist(loginPage.txt_btnLogin);

    }

}




