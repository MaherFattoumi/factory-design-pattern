Feature: Factory Design Pattern

Scenario: Creating an Employee of type Manager
  Given an EmployeeFactory
  When I create an employee of type "Manager"
  Then I should get a Manager object

Scenario: Creating an Employee of type Developer
  Given an EmployeeFactory
  When I create an employee of type "Developer"
  Then I should get a Developer object

Scenario: Creating an Employee of type Tester
  Given an EmployeeFactory
  When I create an employee of type "Tester"
  Then I should get a Tester object  