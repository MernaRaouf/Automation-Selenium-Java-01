package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement registerlink(){

        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement Gender(){
        return Hooks.driver.findElement(By.id("gender-female"));
    }
    public WebElement FristName(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement LastName(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement DropDownday(){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement DropDownmonth(){
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement DropDownyear(){
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement Email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement Password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPass(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement ClickRegBtn(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
}
