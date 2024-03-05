@DynamicTable
Feature: Dynamic HTML Table

  @testCaseone
  Scenario: Verifying data insertion and extraction from dynamic table
    Given I open the Dynamic HTML Table 
    When Insert the values into Dynamic table reading JSON file
    Then Verify all the values are inserted inside the table are correct