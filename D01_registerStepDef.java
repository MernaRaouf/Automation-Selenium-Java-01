package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @Given("user go to register page")
        public void goReisterPage() {
        register.registerlink().click();
        //System.out.println("This is a test before start coding");
//        WebElement registerBtn = Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
//        registerBtn.click();
    }

    @When("user select gender type")
    public void gender_type() {
        register.Gender().click();
    }

    @And("user enter first name and last name")
    public void user_enter_first_name_and_last_name() {
        register.FristName().sendKeys("automation");
        register.LastName().sendKeys("tester");
    }

    @And("user enter date of birth")
    public void user_enter_date_of_birth() {
        Select day = new Select(register.DropDownday());
        day.selectByIndex(16);
        Select month = new Select(register.DropDownmonth());
        month.selectByIndex(5);
        Select year = new Select(register.DropDownyear());
        year.selectByValue("1997");
    }

    @And("user enter email field")
    public void user_enter_email_field() {
        register.Email().sendKeys("test@example.com");
    }

    @And("user fills Password fields")
    public void user_fills_password_fields() {
        register.Password().sendKeys("P@ssw0rd");
        register.ConfirmPass().sendKeys("P@ssw0rd");
    }

    @And("click on Register button")
        public void register_button() {
            register.ClickRegBtn().click();
    }

    @Then("verify that your registration completed successfully")
        public void verify_registration() {
        String color = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        //System.out.println(color);
        //Assert.assertEquals(color, "rgba(93, 164, 35, 1)");
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(color,"rgba(76, 177, 124, 1)");
        soft.assertAll();

        //String text = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();
        //System.out.println(text);
        //Assert.assertTrue(text.contains("completed"));
    }

}