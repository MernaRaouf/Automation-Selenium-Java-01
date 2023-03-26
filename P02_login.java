package org.example.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginlink(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement Email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement Password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginBtn(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }



}
