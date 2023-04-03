Feature: Login with Valid Credentials

@sanity
 	Scenario: Successful Login with Valid Credentials
	 	Given User Launch browser
	 	And opens URL "http://localhost/opencart/"
	 	When User navigate to MyAccount menu
	 	And click on Login
	 	And User enters Email as "denissso4ka@gmail.com" and Password as "admin123"
	 	And Click on Login button
	 	Then User navigates to MyAccount Page