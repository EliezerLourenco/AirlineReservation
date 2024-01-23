# Airline Reservation System

## Description
This project is a simple Java-based Airline Reservation System that allows for the creation and management of airline reservations. The system is capable of handling passenger details, flight numbers, seat assignments, and checks against a no-fly list.

## Features
- Create a reservation with passenger's first name, last name, flight number, and seat number.
- Retrieve and set passenger details and flight information.
- Determine the seating class based on seat number.
- Check if a passenger is on the no-fly list.
- Extract a portion of a string based on seat number logic.

## Installation
No installation is required. To run this project, you will need a Java Development Kit (JDK) installed on your computer.

## Usage
The project contains two main classes:
- `AirlineReservation`: Represents a reservation with methods to manage and retrieve reservation details.
- `AirlineReservationTestHarness`: Contains the `main` method and serves as the entry point for the application. It demonstrates the usage of the `AirlineReservation` class.

To compile the project, navigate to the `src` directory and run:

```bash
javac AirlineReservation.java AirlineReservationTestHarness.java
```
To run the test harness, use: java AirlineReservationTestHarness

Contributing
Contributions to the Airline Reservation System are welcome. Please ensure to update tests as appropriate.

License
MIT
