Feature: Cucumber Data Tables implementation practices


  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |

    #To beatify the pipes above
  #control + alt + L


  #Create a new scenario where we list the type of pets we love
  #Print out all the string in the List
  Scenario: List of pet types I love
    Then I will share my favorites
      | Husky |
      | Cats  |
      | Lion  |
      | Horse |
      | Dog   |
      | Snake |


  Scenario: Officer reads data about driver
    Then office is able to see any data he wants
      | name    | Nurik         |
      | surname | Kukusyanka    |
      | age     | 20            |
      | Address | Phila         |
      | state   | PA            |
      | zipcode | 19201         |
      | phone   | 202-1414-1241 |

  @dataTable
  Scenario: User should be able to see all 12 in month dropdown
    Given User is on the dropdown page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

