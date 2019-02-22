package com.BriteERP.step_definitions;

import com.BriteERP.pages.ActivitiesPage;
import com.BriteERP.pages.CRMpage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilietes.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActivitiesStepDefinitions {

    CRMpage crMpage = new CRMpage();
    LoginPage loginPage = new LoginPage();
    ActivitiesPage activitiesPage = new ActivitiesPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);


    @Given("user should be able to open the login page")
    public void user_should_be_able_to_open_the_login_page() {

        loginPage.open();
    }


    @When("User logs in using {string} and {string}")
    public void user_logs_in_using_and(String string, String string2) {
        loginPage.singin("EventsCRM_Manager@info.com", "Ugh45wQ12");

    }

    @Then("User should be able to click on CRM module")
    public void user_should_be_able_to_click_on_CRM_module() throws Exception {
        // Thread.sleep(2000);
        crMpage.crmButtn.click();

    }

    @And("Click on Activities")
    public void click_on_Activities() throws Exception {
        // Thread.sleep(2000);
        crMpage.activities.click();
        // Thread.sleep(2000);
        Assert.assertTrue(crMpage.activities.isDisplayed());
        System.out.println("Clicked on Activities successfully");
    }

    @Then("Click on search")
    public void click_on_search() throws Exception {

        // Thread.sleep(3000);
        activitiesPage.searchButton.click();

        Assert.assertTrue(activitiesPage.searchButton.isDisplayed());
        System.out.println("Clicked on Search button successfully");

    }


    @Then("Click on Group-by")
    public void click_on_Group_by() throws Exception {


        activitiesPage.groupClick.click();
        // Thread.sleep(4000);
        Assert.assertTrue(activitiesPage.groupClick.isDisplayed());
        System.out.println("Clicked on Group-by successfully");
    }

    @Then("Click on Filter")
    public void click_on_Filter() throws Exception {


        // Thread.sleep(2000);
        activitiesPage.filtersClick.click();
        Assert.assertTrue(activitiesPage.filtersClick.isDisplayed());
        System.out.println("Clicked on Filter successfully");

    }

    @Then("Click on Favorites")
    public void click_on_Favorites() throws Exception {

        //Thread.sleep(2000);
        activitiesPage.favoritesClick.click();
        Assert.assertTrue(activitiesPage.favoritesClick.isDisplayed());
        System.out.println("Clicked on Favorites successfully");
    }

    @Then("Click on Measure")
    public void click_on_Measure() throws Exception {

//        Thread.sleep(2000);
        activitiesPage.measuresClick.click();
        Assert.assertTrue(activitiesPage.measuresClick.isDisplayed());
        System.out.println("clicked on Measure successfully");
    }


}
