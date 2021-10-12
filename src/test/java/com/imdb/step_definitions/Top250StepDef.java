package com.imdb.step_definitions;

import com.imdb.pages.TopRatedMoviesPage;
import com.imdb.utilities.BrowserUtils;
import com.imdb.utilities.ConfigurationReader;
import com.imdb.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Top250StepDef {

    TopRatedMoviesPage topRatedMoviesPage = new TopRatedMoviesPage();

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));

        String expectedTitle = "IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals("verify that the user is one the expected page",expectedTitle,actualTitle);
    }

    @When("the user clicks the Menu")
    public void the_user_clicks_the_Menu() {
        topRatedMoviesPage.navigatesToMenu();
    }

    @When("the user clicks the {string}")
    public void the_user_clicks_the(String string) {
        //BrowserUtils.waitFor(2);
        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.elementToBeClickable(topRatedMoviesPage.topRatedMovies));
        topRatedMoviesPage.topRatedMovies.click();
    }

    @Then("the user should land on the Top Rated Movies successfully")
    public void the_user_should_land_on_the_Top_Rated_Movies_successfully() {
        String expectedTitle = "IMDb";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals("verify the expected title",expectedTitle,actualTitle);
    }

    @When("the user clicks on the movie ranking {int} in the Top Rated Movies")
    public void the_user_clicks_on_the_movie_ranking_in_the_Top_Rated_Movies(int selectMovieNumber) {

        BrowserUtils.waitFor(3);
        topRatedMoviesPage.getSelectedMovie(selectMovieNumber);
        BrowserUtils.waitFor(1);
    }

    @When("the title is {string} and {int}")
    public void the_title_is_and(String expectedTitle, int num) {

        String actualMovieTitleText = topRatedMoviesPage.getSelectedMovie(num).getText();

        topRatedMoviesPage.getSelectedMovie(num).click();

        Assert.assertEquals("verify the expected title",expectedTitle,actualMovieTitleText);
    }

    @Then("the user should land the {string} page successfully")
    public void the_user_should_land_the_page_successfully(String expectedTitleTextSelected) {
        String actualMovieTitleTextSelected = topRatedMoviesPage.getMovieTitleText();

        Assert.assertEquals("verify the expected title of the movie page",expectedTitleTextSelected,actualMovieTitleTextSelected);
    }

    @When("the user sorts the movies by the {string}")
    public void the_user_sorts_the_movies_by_the(String expectedOptionSortedBy) {
        topRatedMoviesPage.sortBy(expectedOptionSortedBy);
    }

}
