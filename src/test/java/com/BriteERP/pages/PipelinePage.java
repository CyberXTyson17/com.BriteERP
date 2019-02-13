package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PipelinePage extends CRMpage {

    public PipelinePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="(//span[@class='oe_menu_text'])[30]")
    public WebElement pipline_button;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[3]")
    ////div[@class='btn-group btn-group-sm'][2]/button[3]
    public WebElement pie_Chart;


    @FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[2]")
    public WebElement line_Chart;

 @FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]") // turn off
   public WebElement Bar_Chart;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement piplinePage_Title;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement piplinePieChart_Title;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement piplineMeasures;

    @FindBy(xpath ="//ul[@class='dropdown-menu o_graph_measures_list']/li[2]/a" )
    public WebElement piplineDelay2Assign;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li[3]/a")
    public WebElement piplineDelay2Close;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li[4]/a")
    public WebElement piplineOverpassedDeadline;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li[5]/a")
    public WebElement piplineOfActivities;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li[6]/a")
    public WebElement piplineProbablity;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li[7]/a")
    public WebElement piplineTotalRevenue;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li[9]/a")
    public WebElement piplineCount;
















}
