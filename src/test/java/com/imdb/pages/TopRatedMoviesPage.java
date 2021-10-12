package com.imdb.pages;

import com.imdb.utilities.BrowserUtils;
import com.imdb.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TopRatedMoviesPage extends BasePage{

    @FindBy(xpath = "//td[@class='titleColumn']")
    public List<WebElement> topMovies;

    public List<WebElement> getTopMovies(){
        return topMovies;
    }

    //Dynamic method getSelectedMovie from the top list
    public WebElement getSelectedMovie(int num){
        WebElement topSelection = Driver.get().findElement(By.xpath("(//td[@class='titleColumn'])["+num+"]/a"));
        return topSelection;
    }

    @FindBy (xpath = "//h1[contains(@class,'TitleHeader__TitleText-sc')]")
    public WebElement movieTitle;

    public String getMovieTitleText(){
        String movieTitleText = movieTitle.getText();
        return movieTitleText;
    }

    @FindBy (xpath = "//select[@id='lister-sort-by-options']")
    public static WebElement sortByOptions;

    public static List<WebElement> sortBy(String option){
        Select select = new Select(sortByOptions);
        switch (option){
            case "Ranking":
                select.selectByIndex(0);
                break;
            case "IMDb Ranking":
                select.selectByIndex(1);
                break;
            case "Release Date":
                select.selectByIndex(2);
                break;
            case "Number of Ratings":
                select.selectByIndex(3);
                break;
            case "Your Rating":
                select.selectByIndex(4);
                break;
        }
        BrowserUtils.waitFor(1);
        select.getAllSelectedOptions();

        List<WebElement> optionList = new ArrayList<>();
        for (WebElement element : optionList) {
            element.click();
        }
        return optionList;
    }

    @FindBy(xpath = "//li[@class='subnav_item_main']")
    public List<WebElement> listMoviesByGender;

    public List<WebElement> getListMoviesByGender(){
        return listMoviesByGender;
    }

    //Dynamic method getGenre from the genre list
    public WebElement getGenre(int indexGenre){
        WebElement selectGenre = Driver.get().findElement(By.xpath("//li[@class='subnav_item_main'][" + indexGenre + "]/a"));
        return selectGenre;
    }
}
