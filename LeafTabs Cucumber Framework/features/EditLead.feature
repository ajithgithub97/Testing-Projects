Feature: Edit functionality of the Leaftabs Application

Scenario Outline: CreatLead with valid Credential
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Welcome page should be displayed
When Click on crmsfa link
And Click on the leads link
And Click on the findleads link
And Click on the phone option
Given Enter phone number <phonenumber>
And Click on the find button
And Click on the lead list
And Click on the edit button
And Clear company name
And Update company name <companyname>
When Click on the update button
Then Company name should be displayed <companyname>

Examples:
|phonenumber|companyname|
|9876543210|Qeagle|