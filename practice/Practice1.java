/* Create a program to handle total earning (like you want to create a application for hotel 
booking and suppose 10 rooms book on that day). 

Client want to enter the room number which are available in the hotel at that time while customer visit,
also want to enter the bookable room as per the customer request and number of person want to stay in the room,
charging amount as per the person per day, enter the day count for stay in the hotel room, after the above manually enter the variable client
want to show the result as booked room and with its room number and also show the result of avaiable room after booking and amount for customer.
*/

package practice;

import java.util.Scanner;

// Creating a class that tracks the booked room count.
class RoomCount extends Thread {
    int roomsBooked = 0;
    int availableRooms;
    int roomsToBook;
    int daysStayed;

    // Constructor to initialize the number of rooms to book, available rooms, and
    // day stayed
    public RoomCount(int roomsToBook, int availableRooms, int daysStayed) {
        this.roomsToBook = roomsToBook;
        this.availableRooms = availableRooms;
        this.daysStayed = daysStayed;
    }

    @Override
    public void run() {
        // Check if enough rooms are available
        if (roomsToBook > availableRooms) {
            System.out.println("Sorry, we don't have enough rooms to book " + roomsToBook
                    + " rooms. We can only book " + availableRooms + " rooms.");
        } else {
            // Book rooms in a single line
            roomsBooked = roomsToBook;
            // If you want to store the value of for loop in a variable so you should
            // decalre the variable outside the for loop
            int roomNumber = 100;
            System.out.println("Now Booked rooms are: " + roomsBooked);
            System.out.println("Room numbers booked: ");

            // Print room numbers (assuming room numbers start from 1)
            for (int i = 1; i <= roomsBooked; i++) {
                System.out.print(roomNumber + i + "," + " ");
            }
            System.out.println("\n\nRooms loading...\n");

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Number of available rooms left: " + (availableRooms - roomsBooked));
        }
    }
}

// Class to calculate total earning based on people per room
class AmountCount extends Thread {
    int initialEarning = 0;
    int roomsToBook;
    int peoplePerRoom;
    int amountPerPersonPerDay;
    int daysStayed;

    // Constructor to initialize the number of rooms to book, amount per room per
    // day, and days stayed and amount per person for a day
    public AmountCount(int roomsToBook, int peoplePerRoom, int amountPerPersonPerDay, int daysStayed) {
        this.roomsToBook = roomsToBook;
        this.peoplePerRoom = peoplePerRoom;
        this.amountPerPersonPerDay = amountPerPersonPerDay;
        this.daysStayed = daysStayed;
    }

    @Override
    public void run() {
        initialEarning = roomsToBook * peoplePerRoom * amountPerPersonPerDay * daysStayed;
        System.out.println("Total earning from booked rooms for " + daysStayed + " days: " + initialEarning);

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of available rooms
        System.out.print("Enter the number of available rooms: ");
        int availableRooms = scanner.nextInt();

        // Get the number of rooms to book
        System.out.print("Enter the number of rooms to book: ");
        int roomsToBook = scanner.nextInt();

        // Check if enough rooms are available before asking for earnings
        if (roomsToBook > availableRooms) {
            System.out.println("Sorry, we don't have enough rooms to book " + roomsToBook
                    + " rooms. We can only book " + availableRooms + " rooms.");
        } else {
            // Get number of people per room
            System.out.print("Enter the number of people staying per room: ");
            int peoplePerRoom = scanner.nextInt();

            // Get the earning per person per day
            System.out.print("Enter the amount charged per person per day: ");
            int amountPerPersonPerDay = scanner.nextInt();

            // Get the number of days stayed
            System.out.print("Enter the number of days stayed: ");
            int daysStayed = scanner.nextInt();

            // Start room booking thread
            RoomCount rc = new RoomCount(roomsToBook, availableRooms, daysStayed);
            rc.start();

            // Wait for room booking to complete
            try {
                rc.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            // Start earnings calculation thread
            AmountCount ac = new AmountCount(roomsToBook, peoplePerRoom, amountPerPersonPerDay, daysStayed);
            ac.start();
        }

        scanner.close();
    }
}
