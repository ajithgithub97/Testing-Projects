Feature: Delete Functionality of LeafTab Application

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
And Click on the delete button
And Click on the findleads link
Given Enter the Leadid <leadid>
When Click on the find button
Then Verify the delete lead

Examples:
|phonenumber|leadid|
|9876543210|10251| 