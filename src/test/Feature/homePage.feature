#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@HomePageScenario
Feature: Home Page Scenario
  I want to use this template for testing Home page in pratice Hom Page

	Background:
        Given I visit pratice website
  @Scenario01
  Scenario: Home Page with thcree Sliders only
        When I click on Shop Menu
        And I click on Home menu button
        Then The Home page must contains only three sliders
  @Scenario02
   Scenario: Home Page with three Arrivals only
        When I click on Shop Menu
        And I click on Home menu button
        Then Home page must contains only three Arrivals
  @Scenario03
  Scenario Outline: Home Page - Image in Arrival should by navigate
        When I click on Shop Menu
        And I click on Home menu button
        And Now click the "<image>" in the Arrivals
        Then User can add that book to basket
	Examples:
				|image							 |
				|Selenium Ruby			 |
				|Thinking in HTML		 |
				|Mastering JavaScript|

