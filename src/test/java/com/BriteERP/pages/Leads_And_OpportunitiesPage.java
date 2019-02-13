package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leads_And_OpportunitiesPage {

    public Leads_And_OpportunitiesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/ul/li[1]/a/span")
    public WebElement leadTags ;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/ul/li[2]/a/span")
    public WebElement LostReasons;
}
