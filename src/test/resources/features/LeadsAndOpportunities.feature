Feature: Leads and Opportunities

  Background:
    Given user on the login page


  Scenario: Login as a manager to crm page
    Given user logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And user clicks on crm
    When user goes to leads and opportunities
    And user clicks on lead tags

  @wip
    Scenario Outline: user should modify lost reasons
      Given user logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
      And user clicks on crm
      When user goes to leads and opportunities
      And user clicks on Lost Reasons
      Then user should be able to click on create
      And user should create a name using "<name>"
      Given user should save the name
      And user should click on action dropdown

      Examples:
      |name             |
      |Setter and Getter|
      |Gara Os          |
      |Oguz ozyurt      |
      |Adem Hergul      |
      |Mike             |
      |Mesut Duman      |

      @wip
      Scenario: user should modify lead tags
        Given user logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
        And user clicks on crm
        When user goes to leads and opportunities
        And user clicks on lead tags
