package com.gmail.nemo31.nn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobyPage {
    public MobyPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;


    @FindBy(css = "div._2vOXvqbQ4f")
    public WebElement checkBox;

    @FindBy(css = "div.pager-more__button.pager-loader_preload a")
    public WebElement showMore;

    @FindBy(css = "div:nth-child(23) li:nth-child(1) div label div span")
    public WebElement radioButton;

    @FindBy(css = "div.n-pager.i-bem.n-pager_js_inited span button div.popup__content > div:nth-child(1)")
    public WebElement showTwelve;

    @FindBy(css = "div.n-pager.i-bem.n-pager_js_inited span button")
    public WebElement show;

    public void checkboxChecking(){
        checkBox.click();
    }



    public void scrolling(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", showMore);
    }

    public void radioClicking(){
        radioButton.click();
    }

    public void showTwelveClick(){
        showTwelve.click();
    }

    public void showing(){
        show.click();
    }















}
