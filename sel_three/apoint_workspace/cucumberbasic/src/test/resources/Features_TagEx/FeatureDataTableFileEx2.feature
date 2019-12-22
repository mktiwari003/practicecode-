Feature: Data Table Ex
Verify that the new user registration is unsuccessful after passing incorrect inputs.

Scenario:

Given user registration page

When I enter invalid data on the page

| Fields                 | Values              | Value2   |
| First Name             | Tom                 | Ex2      |   
| Last Name              | Kenny               | Ex2      |
| Email Address          | someone@someone.com | Ex2      |
| Re-enter Email Address | someone@someone.com | Ex2      |
| Password               | Password1           | Ex2      |
| Birthdate              | 01                  | Ex2      |