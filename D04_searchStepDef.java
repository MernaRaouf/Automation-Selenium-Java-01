package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef {

    P03_homePage searchh = new P03_homePage();

    @When("user enter product name")
    public void user_enter_product_name() {
        String[] input = {"laptop", "book", "nike", "camera"};
        for (int i = 0; i < 4 ; i++) {
            searchh.Search().sendKeys(input[i]);
            searchh.searchBtn().click();
            String url = driver.getCurrentUrl();
            Assert.assertTrue(url.contains("https://demo.nopcommerce.com/search?q="));
            List<WebElement> count = Hooks.driver.findElements(By.className("price"));
            System.out.println("The number of " + input[i] + " results is "+ count.size());
        }
    }

    @And("click on search btn")
    public void click_on_search_btn() {

    }

    @And("user enter product sku")
    public void user_enter_product_sku() {
        String[] input = {"APPLE_CAM", "SCI_FAITH", "SF_PRO_11", "AP_MBP_13"};
        for (int i = 0; i < 4 ; i++) {
        searchh.Search().sendKeys(input[i]);
        searchh.searchBtn().click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("https://demo.nopcommerce.com/search?q="));
        List<WebElement> count = Hooks.driver.findElements(By.className("price"));
        System.out.println("The number of " + input[i] + " results is "+ count.size());
        }
    }

    @Then("verify the output")
    public void verify_the_output() {
//        String url = driver.getCurrentUrl();
//        Assert.assertTrue(url.contains("https://demo.nopcommerce.com/search?q="));
//        List<WebElement> count = Hooks.driver.findElements(By.className("price"));
//        System.out.println("The number of links is "+ count.size());
    }


}
