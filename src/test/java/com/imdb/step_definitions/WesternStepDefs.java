package com.imdb.step_definitions;

import com.imdb.pages.TopRatedMoviesPage;
import com.imdb.pages.WesternPage;
import com.imdb.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WesternStepDefs {
    WesternPage westernPage = new WesternPage();

    @And("the user clicks on the movie index {int}  in the Top Rated Movies By Genre")
    public void theUserClicksOnTheMovieIndexGenreInTheTopRatedMoviesByGenre(int indexGenre) {
        new TopRatedMoviesPage().getGenre(indexGenre).click();
    }

    @And("the user clicks on the {string} in Sort by options")
    public void theUserClicksOnTheInSortByOptions(String selectedOption) {
        westernPage.getSortByWestern(selectedOption).click();

    }

    @Then("the {string} is displayed in the page")
    public void theIsDisplayedInThePage(String expectedSubtitle) {
        BrowserUtils.waitFor(2);
        String actualSubtitle = westernPage.getSubtitle().getText();

        //System.out.println("actualSubtitle = " + actualSubtitle);
        //System.out.println("expectedSubtitle = " + expectedSubtitle);
        BrowserUtils.waitFor(1);
        Assert.assertEquals(expectedSubtitle,actualSubtitle);
    }
}
