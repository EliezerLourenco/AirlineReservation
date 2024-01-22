import java.util.Scanner;

public class AirlineReservationTestHarness {
    public static void main(String[] args) {
        // Test with predefined values
        AirlineReservation ar1 = new AirlineReservation("Jack", "Blue", 7675, 27);
        displayReservationDetails(ar1);

        // Test with user input
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide your first name:");
        String firstName = in.nextLine();
        System.out.println("Please provide your last name:");
        String lastName = in.nextLine();
        System.out.println("Please provide your flight number:");
        int flightNumber = in.nextInt();
        System.out.println("Please provide your seat number:");
        int seatNumber = in.nextInt();
        in.close();

        AirlineReservation ar2 = new AirlineReservation();
        ar2.setFirstName(firstName);
        ar2.setLastName(lastName);
        ar2.setFlightNumber(flightNumber);
        ar2.setSeatNumber(seatNumber);

        displayReservationDetails(ar2);
    }

    private static void displayReservationDetails(AirlineReservation ar) {
        System.out.println("First Name: " + ar.getFirstName());
        System.out.println("Last Name: " + ar.getLastName());
        System.out.println("Flight Number: " + ar.getFlightNumber());
        System.out.println("Seat Number: " + ar.getSeatNumber());
        System.out.println("Seating Class: " + ar.getSeatingClass());
        System.out.println("No fly code: " + ar.checkNoFlyList());
        System.out.println("String Portion: " + ar.getStringPortion());
    }
}
