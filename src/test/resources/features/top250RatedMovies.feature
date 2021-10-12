@imdb
Feature: Top Rated Movies

  Background:
    Given the user is on the homepage

  Scenario: Verify that user is on the Top Rate Movies page
    When the user clicks the Menu
    And the user clicks the "Top Rated Movies"
    Then the user should land on the Top Rated Movies successfully


  Scenario Outline: Verify that user can see at least one movie on the page
    When the user clicks the Menu
    And the user clicks the "Top Rated Movies"
    Then the user should land on the Top Rated Movies successfully
    When the user clicks on the movie ranking <number> in the Top Rated Movies
    And the title is "<title>" and <number>
    Then the page should return the "<movie>" selected by the user
    Examples:
      | number | title                    | movie                    |
      | 1      | The Shawshank Redemption | The Shawshank Redemption |


  Scenario Outline: Verify that user can sort movies by the options
    When the user clicks the Menu
    And the user clicks the "Top Rated Movies"
    Then the user should land on the Top Rated Movies successfully
    When the user sorts the movies by the "<options>"
    And the user clicks on the movie ranking <number> in the Top Rated Movies
    And the title is "<title>" and <number>
    Then the page should return the "<movie>" selected by the user
    Examples:
      | options           | number | title                    | movie                    |
      | Ranking           | 1      | The Shawshank Redemption | The Shawshank Redemption |
      | IMDb Ranking      | 1      | The Shawshank Redemption | The Shawshank Redemption |
      | Release Date      | 1      | Dune                     | Dune                     |
      | Number of Ratings | 1      | The Shawshank Redemption | The Shawshank Redemption |
      | Your Rating       | 1      | The Shawshank Redemption | The Shawshank Redemption |
