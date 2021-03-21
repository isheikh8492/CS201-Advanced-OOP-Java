# Lab 5 - Inheritance/Polymorphism

## 03/09/2020

## Objectives

1.  Be able to code a child class definition (inheritance)
2.  Demonstrate knowledge of how to use the keyword _extends_
3.  Demonstrate knowledge of how to code various non-default constructors using superclass constructors.
4.  Demonstrate knowledge of how to use super9) in constructors.
5.  Demonstrate knowledge of how to use super in other subclass methods.

## Exercise

This week, you will write a user-defined class that will encapsulate a _CTAStation_. You will then use arrays to store _CTAStation_ data.
Solution:
Add to your _GeoLocation_ class from last week to include the following:

1.  A method called _calcDistance_ that takes another _GeoLocation_ and returns a double. **Note**: This should use the formula Math.sqrt(Math.pow(lat1-lat2,2)+Math.pow(long1-long2,2)).
2.  A method called _calcDistance_ that takes a long and lat and returns a double. **Note**: See above formula.

Create a class that will implement a _CTAStation_, which should inherit from _GeoLocation_, with the following UML Diagram:

![UML Diagram](http://mypages.iit.edu/~dboliske/materials/CTAStation-UML.png)

#### CTAStopApp

This app will display a menu of options of which data to extract from the data stored in the _CTAStation[]_. The API for this app class is as below:
You do not need to follow this API exactly, but it may help you to figure out how to break down the tasks:

main():

- reads stations in the input file and stores the data in an instance of _CTAStation[]_.
- displays the menu options, which should be the following:
  - Display Station Names
  - Display Station with/without Wheelchair access
  - Display Nearest Station
  - Exit
- performs the operation requested by the user
- loops until exit is chosen

displayStationNames():

- Iterates through _CTAStation[]_ and prints the names of the stations

displayByWheelchair():

- prompts the user for accessibility (y or n)
- checks that the input is y or n, continues to prompt the user for y or n until one has been entered
- if char entered is valid choice:
  - determine which boolean to use (y -> true, n -> false)
  - loop through _CTAStation[]_ to look at wheelchair and display _CTAStations_ that meet the requirement
  - display message if no _CTAStations_ are found

displayNearest():

- prompts the user for a latitude and longitude
- calls calcDistance
- uses value returned to iterate through _CTAStation[]_ to find the nearest station and displays it to the console.
