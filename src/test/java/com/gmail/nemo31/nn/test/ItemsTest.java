package com.gmail.nemo31.nn.test;

import com.gmail.nemo31.nn.pages.MobyPage;
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
        mobyPage.checkboxChecking();
        mobyPage.checkboxChecking();
        mobyPage.scrolling();
        mobyPage.radioButtonClicking();
        //mobyPage.dropdownShowing();
        //mobyPage.showTwelveClick();
        mobyPage.getInputText();
    }

















}
