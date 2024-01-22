public class AirlineReservation {
    private String firstName;
    private String lastName;
    private int flightNumber;
    private int seatNumber;

    // Default constructor
    public AirlineReservation() {
    }

    // Parameterized constructor
    public AirlineReservation(String firstName, String lastName, int flightNumber, int seatNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }

    // Getters and Setters for each field
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Getter method for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter method for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter method for flightNumber
    public int getFlightNumber() {
        return flightNumber;
    }

    // Getter method for seatNumber
    public int getSeatNumber() {
        return seatNumber;
    }
    

    // Returns the seating class based on seat number
    public String getSeatingClass() {
        if (seatNumber >= 1 && seatNumber <= 2) {
            return "First Class";
        } else if (seatNumber <= 4) {
            return "Second Class";
        } else if (seatNumber <= 6) {
            return "Third Class";
        } else {
            return "Fourth Class";
        }
    }

    // Checks if the passenger is on the no-fly list
    public String checkNoFlyList() {
        String fullName = firstName + lastName;
        if (fullName.equalsIgnoreCase("JackBlue") || 
            fullName.equalsIgnoreCase("JackGreen") || 
            fullName.equalsIgnoreCase("JillWhite")) {
            return "9999";
        }
        return "0000";
    }

    // Returns a portion of the string composed of passenger details
    public String getStringPortion() {
        String fullState = firstName + lastName + flightNumber + seatNumber;
        int firstDigit = Math.min(seatNumber / 10, fullState.length());
        int secondDigit = Math.min(seatNumber % 10, fullState.length());
        if (secondDigit > firstDigit) {
            return fullState.substring(firstDigit, secondDigit);
        } else {
            return "";
        }
    }
}
