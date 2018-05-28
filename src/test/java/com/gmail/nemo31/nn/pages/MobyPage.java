package com.gmail.nemo31.nn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(css = "div.popup.popup_animate_no.popup_direction_down.popup_theme_ffffff.popup_autoclosable_yes.popup_adaptive_yes.select__popup.select__popup_size_s.select__popup_theme_normal.i-bem.popup_js_inited.popup_to_bottom.popup_visibility_visible div.popup__content div:nth-child(1)")
    public WebElement showTwelve;

    @FindBy(css = "div.n-pager.i-bem.n-pager_js_inited span button")
    public WebElement show;

    @FindBy(id = "header-search")
    public WebElement headerSearchField;

    public void checkboxChecking(){
        (new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div._2vOXvqbQ4f")));
        checkBox.click();
    }

    public void scrolling(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", showMore);
    }

    public void radioButtonClicking(){
        (new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(23) li:nth-child(1) div label div span")));
        radioButton.click();
    }

    public void showTwelveClick(){
        (new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.popup.popup_animate_no.popup_direction_down.popup_theme_ffffff.popup_autoclosable_yes.popup_adaptive_yes.select__popup.select__popup_size_s.select__popup_theme_normal.i-bem.popup_js_inited.popup_to_bottom.popup_visibility_visible div.popup__content div:nth-child(1)")));
        showTwelve.click();
    }

    public void dropdownShowing(){
        show.click();
    }

    public void getInputText(){
        headerSearchField.sendKeys("Apple Iphone 7");
        String inputedText = headerSearchField.getAttribute("value");
        System.out.println(inputedText);
    }















}
