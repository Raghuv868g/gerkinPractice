@tag
Feature: to add  detail using map using 2 dimensional map

  @tag1
  Scenario:to add customer detail  using two dimension map
    Given user navigte to homepage
    When fill all information
     | f_name  | l_name |  email  			|   add     |    p_no     |
      | raghu   |  varan | r@gmail.com  |  chennai  | 82203205156  |
      |  raj    |   maan |  v@gmail.com | tamilnadu | 78795515151  |
    And click on the submit button and wait
    Then user validate the output
