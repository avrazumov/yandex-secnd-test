package com.gmail.nemo31.nn;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ItemsTest extends BaseTest {

    public static MobyPage mobyPage;

    @BeforeClass
    protected void initiliaze(){
        mobyPage = new MobyPage(driver);
    }

    @Test
    public void test(){
        driver.get("https://market.yandex.by/catalog/54726/list?local-offers-first=0&deliveryincluded=0&onstock=1");
        mobyPage.checkboxChecking();
        mobyPage.checkboxChecking();
        mobyPage.scrolling();
        mobyPage.radioClicking();
        //mobyPage.showing();
        //mobyPage.showTwelveClick();





    }

















}
