Feature: Searching module

  Background: 
    Given User on unacademy home page

  Scenario: Explore a educator profile
    When user searches educator name
      | Sahil |
    Then user on the educator profile details page
    And user clicks on dedication icon
    Then dedication drawyer open
    And user clicks on each hat icon
    And user clicks on cross icon
    And user clicks on profile highlighter
    Then profile highlighter drwayer open
    And user clicks on cross icon again

  Scenario: Search from Trending search list
    When user click on search textbox
    Then Trending search list appears
    And user clicks an item from Trending search list
    Then Educator search list appear

  Scenario Outline: Explore courses 1
    When user searches course name as "<CourseName>"
    Then course search list appear
    And user clicks on specific course
    Then course preview page appear
    And user clicks on share button
    And user copies the share link
    And user clicks on the facebook icon
    And user clicks on the facebook icon

    Examples: 
      | CourseName |
      | UPSC       |
