@tag
Feature: add a customer through two dimension list

@tag1
  Scenario:to add customer detail 
    Given user navigte to home page
    And user click no add customer
    When fill all detail
    |raghu|varan|hu@gmail.com|green tech|8220325156|
     |ram|n|aghu@gmail.com|chennai |822032456156|
      |loki|e|rghu@gmail.com|palani|8220325156|
       |sonthos|v|ru@gmail.com|andaman|8220325156|
    And click on submit button
    Then I validate the outcomes
