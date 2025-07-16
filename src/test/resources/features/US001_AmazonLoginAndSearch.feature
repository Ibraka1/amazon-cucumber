@US001
  Feature: US001 Amazon Home Page Test

    Scenario: TC01 Customer search home furniture
      Given Customer visit the Amazon page
      When Search home furniture
      And Select the first product of results
      And Add to cart
      Then Customer navigate to the home page

    Scenario Outline: TC02 Customer buys a bestseller book
      Given Customer navigate to the home page
      When User searches for "<key>"
      Then take a screenshot of "<key>"
      Examples:

        | key |
        | phone|
        | book |
        | pet stuff |