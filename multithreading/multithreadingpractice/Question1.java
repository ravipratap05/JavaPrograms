/* Create a program to handle total earning (like you want to create a application for hotel 
booking and suppose 10 rooms book on that day). */

package multithreading.multithreadingpractice;

import java.lang.Thread;

// creating a class which is track the booked room count..
class RoomCount extends Thread {
    int rooms = 0;
    int amount = 100;

    // constructor to initialize the number of rooms
    public RoomCount() {
        int j = 0;
        for (j = 0; j <= 5; j++) {
            rooms = rooms + 1;
            System.out.println("Now Booked rooms are :" + rooms);
        }
        System.out.println("\nRooms lodding...\n");
    }

    @Override
    public void run() {
        int availableRooms = 20;

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Number of available rooms: " + availableRooms);
    }
}

// Create thread for the total earning..
class AmountCount extends Thread {
    int initialEarning = 0;
    int totalEarning = 100;

    // constructor to initialize the number of rooms
    public AmountCount() {
        int j = 0;
        for (j = 0; j <= 5; j++) {
            initialEarning = initialEarning + 100;
            System.out.println("Now Booked rooms are :" + initialEarning);
        }
        System.out.println("\nEarning lodding...\n");
    }

    @Override
    public void run() {
        int totalEarning = 2000;

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Number of available rooms: " + totalEarning);
    }
}

class Rooms extends RoomCount {

}

public class Question1 {
    public static void main(String[] args) {
        // creating an object of RoomCount with 5 rooms
        RoomCount rc = new RoomCount();
        rc.start();
        AmountCount ac = new AmountCount();
        ac.start();
    }

}
