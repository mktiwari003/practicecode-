Feature:  Data table

Verify that the new user registration is unsuccessful after passing incorrect inputs.

Scenario:

Given user registration page

When I enter invalid data on the page

| Fields                 | Values              | Value2   |
| First Name             | Tom                 | info 1   |   
| Last Name              | Kenny               | unfo2     |
| Email Address          | someone@someone.com | unfo3     |
| Re-enter Email Address | someone@someone.com | unfo4     |
| Password               | Password1           | unfo5     |
| Birthdate              | 01                  |  unfo6    |


