package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMpage {


    public CRMpage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[2]")
    public WebElement crmButtn;

    @FindBy(xpath = "//a[@data-menu=\"268\"]/span")
    public WebElement activityTypes;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[2]/li[2]/a/span")
    public WebElement activities;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/a/span")
    public WebElement lead_And_Opportunities;




}
