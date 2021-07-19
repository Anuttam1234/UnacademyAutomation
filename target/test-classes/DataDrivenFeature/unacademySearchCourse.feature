Feature: Searching module Courses

  Scenario Outline: Explore courses 1
    When user searches course name as "<CourseName>"
    Then course search list appear
    And user clicks on specific course
    Then course preview page appear
    And user clicks on share button
    And user copies the share link
    And user clicks on the social media icon

    Examples: 
      | CourseName |
      | UPSC       |
