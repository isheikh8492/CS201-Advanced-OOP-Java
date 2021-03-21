# Lab 6 - Lists

## 03/30/2020

## Objectives

1.  Learn to write and use an ArrayList declaration
2.  Learn to manipulate the data in an ArrayList

## Exercise

In this assignment, you will write a user-defined class that will encapsulate an ArrayList of _CTAStations_ called _CTARoute_. You will allow users to look up stations by name, add new stations, and delete existing stations.

### Solution

Create a class that will implement a _CTARoute_ with the following UML diagram:

![UML Diagram](http://mypages.iit.edu/~dboliske/materials/CTARoute-UML.png)

In the previous lab, you only needed to concern yourself with the Green Line. In this lab, however, you will need to be able to handle two CTA routes, the Red and Green lines. The information for all of these stations should be read from _CTAStops.csv_. The format is similar to before, but with two extra columns to list the location of each stop along either the Red or Green lines. The order is as follows:
Name, Latitude, Longitude, Location, Wheelchair, Red Line, Green Line
**Note**: A -1 for Red/Green line means that the station is not on that route.

In addition to a new _CTARoute_ class, you will also need to modify you menu to have the following options:

1.  Display the names of all stations
2.  Display the stations with wheelchair access
3.  Display the nearest station to a location
4.  Display information for a station with a specific name
5.  Display information for all stations
6.  Add a new station
7.  Delete an existing station
8.  Exit

- Adding a station should ask for each variable individually as well as the name of the route that the station is on.
- Adding a station should ask for the names of the previous and following stations and insert the new station into the correct position.
- Removing an existing station needs to task for the name of the station and the route(s) that is appears on.
