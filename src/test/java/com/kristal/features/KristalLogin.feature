@LoginTest
Feature: Login Screen 

Scenario: User In Need To Sigin in Kristal 

	Given User Navigated To Home Page 
	When If user seen any Change your country select any country or Close Popup
	When User Tap Login Button 
	Then user Navigated To New Tab 
	
	

Scenario Outline: User Need To Provide Login name & Password and Click Submit 
	When User Navigated to Login Page Provide Username "<User Name>"
	Then User Navigated to Login Page Provide Password "<Password>"
	And Tap Continue Button
	#And Verify User Login to Kristal Website
	
	Examples: 
		|User Name| |Password|
		|a@b.com| |Admin@12345|