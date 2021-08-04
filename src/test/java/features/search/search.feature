Feature: Search functionality
  As a tester
  I want to ensure functionality feature working as expected
  So that our end user can browse around in LG.com without any issues

  Background:
    Given I am at LG Home Page

  @search @smoke @regression @omd @TC_001
  Scenario: Verify user should be able to search OMD HA Innovel product
    Given I enter OMD HA Innovel product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMD HA Innovel product displays in search results page

  @search @smoke @regression @omd @TC_002
  Scenario: Verify user should be able to search OMD HA Non-Innovel product
    Given I enter OMD HA Non Innovel product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMD HA Non Innovel product displays in search results page

  @search @smoke @regression @omd @TC_003
  Scenario: Verify user should be able to search OMD HE Innovel product
    Given I enter OMD HE Innovel product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMD HE Innovel product displays in search results page

  @search @smoke @regression @omd @TC_004
  Scenario: Verify user should be able to search OMD HE Non-Innovel product
    Given I enter OMD HE Non Innovel product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMD HE Non Innovel product displays in search results page

  @search @smoke @regression @omv @TC_005
  Scenario: Verify user should be able to search OMV Subscription product
    Given I enter OMV subscription product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMV Subscription product displays in search results page

  @search @smoke @regression @omv @TC_006
  Scenario: Verify user should be able to search OMV Non Subscription product
    Given I enter OMV Non subscription product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMV Non Subscription product displays in search results page

  @search @smoke @regression @TC_007
  Scenario Outline: Verify user should be able to search item with space
    Given I search for "<productName>"
    When I click on search icon from GNB
    Then I will verify list of "<productName>" in my search results page
    
    Examples:
      | productName |
      | OLED        |
      | SMART TV    |
      | 4K SMART    |

  @search @smoke @regression @omv @TC_008
  Scenario: Verify user should be able to search using invalid wording
    Given I enter invalid wording into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify We Are Sorry error message

  @search @smoke @regression @omv @TC_009
  Scenario: Verify user should be able to search using special characters
    Given I enter special characters into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify We Are Sorry error message

  @search @smoke @regression @omv @TC_010
  Scenario: Verify user should be able to search for subscription product from we are sorry search results page
    Given I enter special characters into search edit box from GNB
    And I click on search icon from GNB
    And I will verify We Are Sorry error message
    And I enter OMV subscription product Code into search edit box from Search Results Page
    When I click on search icon from search results page
    Then I will verify OMV Subscription product displays in search results page

  @search @smoke @regression @omv @TC_011
  Scenario: Verify user should be able to search for non subscription product from we are sorry search results page
    Given I enter special characters into search edit box from GNB
    And I click on search icon from GNB
    And I will verify We Are Sorry error message
    And I enter OMV non subscription product Code into search edit box from Search Results Page
    When I click on search icon from search results page
    Then I will verify OMV Non Subscription product displays in search results page

  @search @smoke @regression @omv @TC_012
  Scenario: Verify user should be able to search for OMD HE Innovel product from we are sorry search results page
    Given I enter special characters into search edit box from GNB
    And I click on search icon from GNB
    And I will verify We Are Sorry error message
    And I enter OMD HE Innovel product Code into search edit box from Search Results Page
    When I click on search icon from search results page
    Then I will verify OMD HE Innovel product displays in search results page

  @search @smoke @regression @omv @TC_013
  Scenario: Verify user should be able to search for OMD HA Non Innovel product from we are sorry search results page
    Given I enter special characters into search edit box from GNB
    And I click on search icon from GNB
    And I will verify We Are Sorry error message
    And I enter OMD HA Non Innovel product Code into search edit box from Search Results Page
    When I click on search icon from search results page
    Then I will verify OMD HA Non Innovel product displays in search results page

  @search @smoke @regression @omd @TC_014
  Scenario: Verify user should be able to search OMD HA Innovel product from Shop page
    Given I am at shop page
    And I enter OMD HA Innovel product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMD HA Innovel product displays in search results page

  @search @smoke @regression @omd @TC_015
  Scenario: Verify user should be able to search OMD HA Non-Innovel product from Shop page
    Given I am at shop page
    And I enter OMD HA Non Innovel product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMD HA Non Innovel product displays in search results page

  @search @smoke @regression @omd @TC_016
  Scenario: Verify user should be able to search OMD HE Innovel product from Shop page
    Given I am at shop page
    And I enter OMD HE Innovel product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMD HE Innovel product displays in search results page

  @search @smoke @regression @omd @TC_017
  Scenario: Verify user should be able to search OMD HE Non-Innovel product from Shop page
    Given I am at shop page
    And I enter OMD HE Non Innovel product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMD HE Non Innovel product displays in search results page

  @search @smoke @regression @omv @TC_018
  Scenario: Verify user should be able to search OMV Subscription product from Shop page
    Given I am at shop page
    And I enter OMV subscription product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMV Subscription product displays in search results page

  @search @smoke @regression @omv @TC_019
  Scenario: Verify user should be able to search OMV Non Subscription product from Shop page
    Given I am at shop page
    And I enter OMV Non subscription product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMV Non Subscription product displays in search results page

  @search @smoke @regression @omv @TC_020
  Scenario: Verify user should be able to search using invalid wording from Shop Page
    Given I am at shop page
    And I enter invalid wording into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify We Are Sorry error message

