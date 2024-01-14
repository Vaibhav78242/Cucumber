Feature: Test Guru99 Application

  Scenario Outline: Test RegisterPage Functionality
    Given user is on registerpage
    When user enter valid "<fname>", "<lname>", "<phone>" and "<email>"
    And user enter valid "<address>", "<city>", "<state>", "<postalcode>" and "<country>"
    And user enter valid "<username>", "<password>", "<confirmpassword>" and click on submit button
    Then validate user is on register success page by passing url



    Examples: 
      | fname   | lname | phone  | email    | address  | city     | state       | postalcode | country | username | password | confirmpassword |
      | vaibhav | patil | 989562 | vbhv@123 | latur    | latur    | maharashtra |     415263 | INDIA   | vaibhavp | vbhv@123 | vbhv@123        |
      | yogesh  | mali  | 748596 | yogi@123 | kolhapur | kolhapur | Maharashtra |     415236 | INDIA   | yogeshM  | yogi@145 | yogi@145        |

      
      