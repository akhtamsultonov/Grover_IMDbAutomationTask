package com.imdb.pages;

import com.imdb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(id = "home_img_holder")
    public WebElement imdb;

    @FindBy(xpath = "//div[.='Menu']")
    public WebElement menu;

    @FindBy (xpath = "//a[.='Top Rated Movies']")
    public WebElement topRatedMovies;

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigatesToMenu(){
        menu.click();
    }

}
