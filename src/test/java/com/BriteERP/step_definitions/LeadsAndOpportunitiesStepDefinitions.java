package com.BriteERP.step_definitions;

import com.BriteERP.pages.CRMpage;
import com.BriteERP.pages.Leads_And_OpportunitiesPage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilietes.ConfigurationReader;
import com.BriteERP.utilietes.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadsAndOpportunitiesStepDefinitions {
    Leads_And_OpportunitiesPage leads_and_opportunitiesPage = new Leads_And_OpportunitiesPage();
    WebDriverWait wait =new WebDriverWait(Driver.getDriver(),15);
    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println("I am opening the login page");
        // open the login page of the application
        // url is in the properties file
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String userName, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.singin(userName,password);

    }

    @Given("user clicks on crm")
    public void user_clicks_on_crm() {
        CRMpage crMpage = new CRMpage();
        wait.until(ExpectedConditions.elementToBeClickable(crMpage.crmButtn)).click();
    }

    @When("user goes to leads and opportunities")
    public void user_goes_to_leads_and_opportunities() {
        CRMpage crMpage = new CRMpage();
        crMpage.lead_And_Opportunities.click();
    }

    @When("user clicks on lead tags")
    public void user_clicks_on_lead_tags() {

        leads_and_opportunitiesPage.leadTags.click();
    }
    @When("user clicks on Lost Reasons")
    public void user_clicks_on_Lost_Reasons() {

      leads_and_opportunitiesPage.LostReasons.click();
    }

    @Then("user should be able to click on create")
    public void user_should_be_able_to_click_on_create() {


        wait.until(ExpectedConditions.elementToBeClickable(leads_and_opportunitiesPage.create)).click();
    }

    @Then("user should create a name using {string}")
    public void user_should_create_a_name_using(String name) {

        leads_and_opportunitiesPage.name.sendKeys(name);
    }
    @Given("user should save the name")
    public void user_should_save_the_name() {

        if(leads_and_opportunitiesPage.save.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(leads_and_opportunitiesPage.save)).click();
        }else {
            wait.until(ExpectedConditions.elementToBeClickable(leads_and_opportunitiesPage.secondCreate)).click();
        }
    }

    @Given("user should click on action dropdown")
    public void user_should_click_on_action_dropdown() {
       leads_and_opportunitiesPage.action.click();
//       Select sel = new Select(leads_and_opportunitiesPage.action);
//       sel.getFirstSelectedOption().click();

    }


}
