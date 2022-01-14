package com.jack;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theater theater = new Theater("Olympian", 8, 12);
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theater.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }
//        theater.getSeats();
//        if (theater.reserveSeat("H11")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, seat is already taken");
//        }
//
//
//        if (theater.reserveSeat("H11")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, seat is already taken");
//        }
    }

        public static void printList(List<Theater.Seat> list) {
            for (Theater.Seat seat : list) {
                System.out.print(" " + seat.getSeatNumber());
            }
            System.out.println();
            System.out.println("=======================================================");
        }
}
