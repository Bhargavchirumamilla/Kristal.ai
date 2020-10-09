@SanityTest 
Feature: Home Screen 

Scenario: HomePage  consists of search bar 
	Given Search bar displayed on home page 
	
	
Scenario Outline: Search for  word  facebook and verify autosuggestion list showing and  click on autosuggestion 

	When EnterSearcKeyword is "<CompanyName>" 
	Then Autosuggestion size is 0 or less than 0 
	And NavigateFirstAutosuggestion 
	
	Examples: 
		|CompanyName|
		|kristal.ai|
		
		
Scenario Outline: User can search a sentence  in google and in results page all type of results will show 

	When provide Name "<name>" 
	Then ClickSearchbar 
	And Verify Images and Videos 
	Examples: 
		|name|
		|About Kristal.ai Company|
		
Scenario: Verify the search result page title  is proper or not 
	Then Veify Home Page URL 
	
	
Scenario: Verify Google logo is present 
	When Logo Present Results Page 
	Then Navigate Back 
	And Verify Logo In Home Page 
	
 