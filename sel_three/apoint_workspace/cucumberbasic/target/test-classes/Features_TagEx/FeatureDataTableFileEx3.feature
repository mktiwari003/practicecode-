Feature: Data Table Ex
Verify that the new user registration is unsuccessful after passing incorrect inputs.

Scenario:

Given user registration page

When I enter invalid data on the page

| Fields                 | Values              | Value2   |
| First Name             | Tom                 | Ex3      |   
| Last Name              | Kenny               | Ex3      |
| Email Address          | someone@someone.com | Ex3      |
| Re-enter Email Address | someone@someone.com | Ex3      |
| Password               | Password1           | Ex3      |
| Birthdate              | 01                  | Ex3      |