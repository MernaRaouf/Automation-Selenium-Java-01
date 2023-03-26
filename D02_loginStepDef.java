package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef {


    P02_login loginn= new P02_login();
    @Given("user go to login page")
    public void user_go_to_login_page() {
        loginn.loginlink().click();
    }
    @When("user login with valid username and password")
    public void user_login_with_and() {
        loginn.Email().sendKeys("test@example.com");
        loginn.Password().sendKeys("P@ssw0rd");
    }
    @When("user press on login button")
    public void user_press_on_login_button() throws InterruptedException {
        loginn.loginBtn().click();
        //Hooks.driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        boolean myaccount = driver.findElement(By.className("ico-account")).isDisplayed();
        soft.assertTrue(myaccount);
        soft.assertAll();
    }

    @When("user login with invalid username and password")
    public void user_login_with_invalid_input() {
        // "wrong@example.com" and "P@ssw0rd"
        loginn.Email().sendKeys("wrong@example.com");
        loginn.Password().sendKeys("P@ssw0rd");
    }

    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        SoftAssert softt = new SoftAssert();
        String text = driver.findElement(By.className("message-error")).getText();
        softt.assertTrue(text.contains("Login was unsuccessful"));

        String color = Hooks.driver.findElement(By.className("message-error")).getCssValue("color");
        String hexcolor = Color.fromString(color).asHex();
        softt.assertEquals(hexcolor, "#e4434b");
        softt.assertAll();
    }
}
