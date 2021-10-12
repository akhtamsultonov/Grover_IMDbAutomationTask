package com.imdb.step_definitions;

import com.imdb.pages.TopRatedMoviesPage;
import com.imdb.utilities.BrowserUtils;
import com.imdb.utilities.ConfigurationReader;
import com.imdb.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Top250StepDef {

    TopRatedMoviesPage topRatedMoviesPage = new TopRatedMoviesPage();

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));

        String expectedTitle = "IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("the user clicks the Menu")
    public void the_user_clicks_the_Menu() {
        topRatedMoviesPage.navigatesToMenu();
    }

    @When("the user clicks the {string}")
    public void the_user_clicks_the(String string) {
        BrowserUtils.waitFor(2);
        topRatedMoviesPage.topRatedMovies.click();
    }

    @Then("the user should land on the Top Rated Movies successfully")
    public void the_user_should_land_on_the_Top_Rated_Movies_successfully() {
        String expectedTitle = "IMDb";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
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

        Assert.assertEquals(expectedTitle,actualMovieTitleText);
    }

    @Then("the page should return the {string} selected by the user")
    public void the_page_should_return_the_selected_by_the_user(String expectedTitleTextSelected) {

        String actualMovieTitleTextSelected = topRatedMoviesPage.getMovieTitleText();

        Assert.assertEquals(expectedTitleTextSelected,actualMovieTitleTextSelected);
    }

    @When("the user sorts the movies by the {string}")
    public void the_user_sorts_the_movies_by_the(String expectedOptionSortedBy) {
        topRatedMoviesPage.sortBy(expectedOptionSortedBy);
    }

}
