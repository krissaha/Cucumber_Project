Feature: Pricing project login

Scenario Outline: Login for pricing domain scenario
Given User will open url in the browser
Then  User enter "<email>" and "<password>"  
Then  User clicks on login button
And   User login to the CustomerCorporate page
Then Close the browser

Examples:
		| email	|	password	|
		| dibyendud@tranistics.com| pass123	|
		| suvendub@tranistics.com | Passw0rd |
		
		
		
		
		
		
		