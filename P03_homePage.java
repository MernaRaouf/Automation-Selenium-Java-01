package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_homePage {

    public WebElement DropDownd(){

        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement Search(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchBtn(){
        return Hooks.driver.findElement(By.className("button-1"));
    }

}
