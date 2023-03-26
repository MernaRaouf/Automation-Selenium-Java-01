package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {


    @When("select random one of the three sub categories")
    public void select_random_one_of_the_three_sub_categories() throws InterruptedException {
        // get all products whose quanity >0
        List<WebElement> categories = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li"));
        // get the len of productElems
        int maxProducts = categories.size();
        // get random number
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        // Select the list item
        categories.get(randomProduct).click();
        Thread.sleep(2000);
    }
    @And("hover on the selected category")
    public void hover_on_the_selected_category() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//li//a[@href=\"/desktops\"]"))).click().build().perform();

    }
    @Then("verify that the sub category title")
    public void verify_that_the_sub_category_title_is() {
        String title = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")).getText();
        System.out.println(title);
        Assert.assertEquals(title.toLowerCase().trim(),"desktops");
    }
}
