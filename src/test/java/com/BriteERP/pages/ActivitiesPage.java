package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.channels.Selector;


public class ActivitiesPage {

    public ActivitiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@title='Advanced Search...']")
   // /html/body/div[1]/div[2]/div[1]/div[1]/div/span
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/button")
    public WebElement groupClick;

    @FindBy(xpath = "//span[@class='fa fa-star']")
    public WebElement favoritesClick;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button")
    public WebElement filtersClick;

    @FindBy(xpath = "(//span[@class='caret'])[1]")
    public WebElement measuresClick;


}
