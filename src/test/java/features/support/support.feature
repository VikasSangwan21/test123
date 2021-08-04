Feature: Signup to LG.com
  As a tester
  I want to ensure Signup feature working as expected
  So that our end user can Signup into LG.com without any issues

  Background:
    Given I am at LG Home Page

  @signup @smoke @regression @TC_001 @TestRun1
  Scenario: Verify user should be able verify their account from their email after successfully sign up
    Given I click "SUPPORT" on Home Page
    When I search "OLED" using the search textbox
    And I select Product Category as "TV/Audio/Video" and "TVs" and click Submit
    And I click on Register a product for first Result product
    Then I verify new tab is opened to register the product
    When I enter product Details on product registration page and click register a product button	
 