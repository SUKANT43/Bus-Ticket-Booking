import java.util.*;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        // Adding bus objects
        buses.add(new Bus(1, true, 45));
        buses.add(new Bus(2, false, 50));
        buses.add(new Bus(3, true, 48));

        // Display all bus info
        for (Bus b : buses) {
            b.displayBusInfo();
        }

        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        while (userOpt == 1) {
            System.out.println("\nEnter 1 to Book and 2 to Exit:");
            userOpt = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (userOpt == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed!");
                } else {
                    System.out.println("Sorry, no available seats on this bus for the selected date.");
                }
            }
        }

        System.out.println("Thank you for using the Bus Booking System!");
    }
}
