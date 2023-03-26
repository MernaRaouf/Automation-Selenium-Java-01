package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D03_currenciesStepDef {

    P03_homePage home = new P03_homePage();

    @When("Select Euro currency from the dropdown list")
    public void Euro_currency(){
        Select currency = new Select(home.DropDownd());
        currency.selectByIndex(1);
    }

    @Then("Verify the Euro Symbol")
    public void verify_Euro(){
        List<WebElement> l = Hooks.driver.findElements(By.className("price"));
        for (int i = 0; i < l.size() ; i++ ){
            String v = l.get(i).getText();
            System.out.println(v);
            Assert.assertTrue(v.contains("€"));
        }
    }
}
