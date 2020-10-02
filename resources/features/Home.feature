@SanityTest 
Feature: Home Screen 

Scenario: Skip and Tap Search 
	Given Skip Onboarding 
	When Tap Search 
	
Scenario Outline: Verify India capital is New Delhi in Search bar  Using API

	When Country Name is "<India Country>" 
	Then Verify India capital is New Delhi in Search bar 
	
	
	Examples: 
		|India Country|
		|India capital|
		
		
Scenario: Verify Hide
     Then HideKeyboard and Scroll 
	 And  open 10th item in search result list
		
Scenario Outline: In wikipedia app search for string haldoc
	Then  Click Bookmarks 
	Then  Tap Save button 
	And Create New 
	When provide Name <"haldocname"> 
	
	
	Examples: 
		|haldocname|
		|haldoc|
		
Scenario Outline:  In wikipedia app search for string test
	Then Description <"testdes"> 
	And Tap ok 
	Examples: 
		|testdes|
		|test|
		
Scenario: Open “My Lists” tab and verify the recently saved page. 
	Given user navigate to Home Page 
	Then Tap My Lists 
	And verify the recently saved page 
	
	
 