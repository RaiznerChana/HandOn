package org.webActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebActions {
    private WebDriver driver;

    public WebActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButton(WebElement element){

        element.click();
    }

    public void setText(WebElement element,String value){
        element.sendKeys(value);
    }


    public void goToTab(String tabName){
        WebElement tabElement= driver.findElement(By.xpath(String.format("//li//a[text()='%s']",tabName)));
        tabElement.click();
    }



    public void setRadioButton(String radioValue){
        WebElement tabElement=driver.findElement(By.xpath(String.format("//input[@aria-label='%s']",radioValue)));
    }

}
