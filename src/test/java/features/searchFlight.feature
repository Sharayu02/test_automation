Feature: To search flight
  As A User
  I want to search flight
  So That I can view available flight options


  Background:
    Given I'am on cleartrip search flight page


  @flight
  Scenario: To search flight from Pune to Chennai
    When I enter details and search flights
    |Departure City|Arrival City|Departure Date |Passengers|
    |Pune          |Chennai     |21/07/2020     |1         |
    Then I should see flight options

  @flight1
  Scenario: To search flight from Pune to Chennai
     When I enter departure city as "Pune", arrival city as "Chennai", departure date as "21/07/2020", Passengers as 1
     Then I should see flight options

  @flight2
  Scenario Outline: To search flight from Pune to Chennai
    When I enter departure city as "<Departure City>", arrival city as "<Arrival City>", departure date as "<Departure date>" and passengers as "<Passenger>"
    Then I should see flight options

    Examples:
    |Departure City|Arrival City|Departure date|Passenger|
    |Pune          |Chennai     |21/07/2020    |1        |


