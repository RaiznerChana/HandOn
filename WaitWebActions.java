package org.webActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;

public class WaitWebActions {



    private static WebDriverWait wait;
    final static int SECONDS=120;

    public WaitWebActions(WebDriver driver){
        wait=new WebDriverWait(driver,Duration.ofSeconds(SECONDS));
    }




    public void WaitForElementNotBeExist(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }



}
