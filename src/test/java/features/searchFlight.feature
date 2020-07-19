Feature: searchFlight

  As A User
  I want to search flights
  So That I can view flight options

  Background:
    Given I'am on cleartrip search flight page


  @flight
  Scenario: To search flight from Pune to Chennai
    When I enter details and search flights
    |Departure City|Arrival City|Departure date|Passengers|
    |Pune          |Chennai     |25            |1         |
    Then I should see flight options

  @flight1
  Scenario: To search flight from Pune to Chennai
     When I enter departure city as "Pune", arrival city as "Chennai", departure date as 25, Passengers as 1
     Then I should see flight options

  @flight2
  Scenario Outline: To search flight from Pune to Chennai
    When I enter departure city as "<Departure City>", arrival city as "<Arrival City>", departure date as "<Departure date>" and passengers as "<Passenger>"
    Then I should see flight options

    Examples:
    |Departure City|Arrival City|Departure date|Passenger|
    |Pune          |Chennai     |25            |1        |

