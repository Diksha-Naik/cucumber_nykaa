Feature: Nykaa Brand And Luxe Feature

  Background: User should get the link

  Scenario: Verify that the user is able to work with Brand
    Given The user navigate to the home page of nykaa
    When The user can able to hover the cursor on Brand
    Then The user should get the menu page of brand
    And The user can able to click on the Maybelline icon in brand
    Then The user should get the Maybelline Page
    And The user can able to hover over only at nykaa and
    Then The user should get Only At Nykaa page
    And The user can able to click on Nykaa Cosmetics
    Then the user should get Nykaa Cosmetics page

  Scenario:Verify that the user able to work with the Luxe
    Given The user navigate to the home page of nykaa
    When The user can able to hover the cursor on luxe
    Then The user should get the menu page of luxe
    And The user can able to hover the cursor on Fragrance
    Then The user should get the menu page of Fragrance
    And The user can able to click on deodorant
    Then The user should get deodorant page
    And The user can able to click in on luxe
    Then The user should redirect to luxe main page and come back to the main page


  Scenario:Verify that the user able to select product and add to bag
    Given The user navigate to the home page of nykaa
    When The user can able to hover the cursor on luxe and than on skin
    Then The user should get luxe skin page
    And The user should able to click on Toner
    Then The User should get the toner page
    And The user can able to click on brand and select the NUXE
    Then The selected item should display
    And The user can able to add product to cart
    Then The selected item should be displayed in bad


  Scenario: Verify that the user can able to select product
    Given The user navigate to the home page of nykaa
    When The user can able to goto deodorant page
    Then The user should get the deodorant page
    And The user can able to filter the product according to need
    Then The product should be displyed

  Scenario: Verify that user can able to enter valid and invalid pin Code
    Given The user navigate to the home page of nykaa
    When The user can able to click the jean page and click on check pin Code
    Then The Error message should be displayed that "please enter 6 digit pin Code"
    And The user Enter the wrong Pin Code
    Then The user should get the error message that"Information not found for entered pin Code."
    And The user can add correct pin Code
    Then The user should get the place name

@smoke
  Scenario Outline: Verify That user can search for FAQ in support page
    Given The user is able to goto the nykaa support page
    When The user can able to add the Queries in "<searchFAQ>"
    And The user can able to click on Enter
    Then The user should get the relevant page
    Examples:
    |searchFAQ|
    |Make Up|
    |Bath Soap|
    |How to Use the website|
    |How to Log in|







