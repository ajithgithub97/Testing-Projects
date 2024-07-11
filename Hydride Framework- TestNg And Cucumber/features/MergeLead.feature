Feature: Check MergeLead Functionality of the LeafTab Application

Scenario Outline: CreatLead with valid Credential
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Welcome page should be displayed
When Click on crmsfa link
And Click on the leads link
And Click on the merge lead link
When Click on the from lead
Then Window one should be handle <leadid1>
When Click on the to lead
Then Window two should be handle <leadid2>
When Click on the merge button
Then Alert Should be handle
Then Leadid should be displayed <companyname>

Examples: 
|leadid1|leadid2|companyname|
|10392|10355|TestLeaf|