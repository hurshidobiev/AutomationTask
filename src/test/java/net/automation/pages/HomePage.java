package net.automation.pages;

import net.automation.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
     public HomePage() {
          PageFactory.initElements(Driver.get(), this);
     }

     @FindBy(id = "run-button")
     public WebElement runButton;

     @FindBy(css = "#output")
     public WebElement output;

     @FindBy(xpath = "//input[@id='ShareLink']")
     public WebElement shareLink;

/*
locates the element by the given text and clicks it
@param text of the web element
 */
     public void clickButton(String element){
          Driver.get().findElement(By.id(element)).click();
     }

}


