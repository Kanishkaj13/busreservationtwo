
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter passengerName:");
        passengerName = scanner.next();
        System.out.println("enter busNo:");
        busNo = scanner.nextInt();
        System.out.println("enter date dd-mm-yyyy");
        String date = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            dateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<bus> busses) {
        int capacity = 0;
        for (bus Bus : busses) {
            if (Bus.getBusNo() == busNo)
                capacity = Bus.getCapacity();
        }
        int booked = 0;

        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;

            }
        }


            return booked < capacity ? true : false;


        }

    }
