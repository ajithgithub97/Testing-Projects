Feature: Ceratlead functinality of LeafTab Application
#Background:
#Given Launch the browser
#And Load the url

Scenario Outline: CreatLead with valid Credential
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Welcome page should be displayed
When Click on crmsfa link
And Click on the leads link
And Click on the Creatlead link
Given Enter the company name <companyname>
And Enter the first name <firstname>
And Enter the last name <lastname>
And Enter the phone number <phonenumber>
When Click on the submit button
Then Leadid should be displayed <companyname>

Examples:
|companyname|firstname|lastname|phonenumber|
|TestLeaf|Ajith|Kumar|9876543210|
