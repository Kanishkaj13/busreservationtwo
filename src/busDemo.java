


import java.util.ArrayList;
import java.util.Scanner;


public class busDemo {

    public static  void main(String[] args) {

        ArrayList<bus> busses=new ArrayList<bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        busses.add(new bus(1,true,1));
        busses.add(new bus(2,false,35));
        busses.add(new bus(3,true,35));

        int userOpt = 1;
        Scanner  scanner = new Scanner(System.in);
        for(bus b:busses){
            b.displayBusInfo();
        }
        while(userOpt==1){
            System.out.println("enter 1 to booking and 2 to exit");
            userOpt=scanner.nextInt();
            if(userOpt==1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,busses)){
                    bookings.add(booking);
                    System.out.println("your booking is confirm");
                }
                else
                    System.out.println("sorry bus is full try another bus");


            }
        }


    }
}
