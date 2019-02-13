package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActivitiesPage {

    public ActivitiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span")
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/button")
    public WebElement groupClick;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button")
    public WebElement favoritesClick;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button")
    public WebElement filtersClick;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button")
    public WebElement measuresClick;

}
