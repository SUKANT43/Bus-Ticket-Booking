import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passenger name:");
        passengerName = scanner.nextLine();

        System.out.println("Enter bus No:");
        busNo = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.println("Enter date (dd-MM-yyyy):");
        String dateInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please try again.");
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
                break;
            }
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.getBusNo() == busNo && b.getDate().equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public Date getDate() {
        return date;
    }
}
