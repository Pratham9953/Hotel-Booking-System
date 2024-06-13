package view;

import Controller.java.BookingController;
import Controller.java.InquiryController;
import model.*;

import java.util.List;
import java.util.Scanner;

public class
MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomBookingSystem roomBookingSystem = new RoomBookingSystem();
        BookingController bookingController = new BookingController(roomBookingSystem);
        InquiryController inquiryController = new InquiryController(roomBookingSystem);
        HotelModule hotelModule = new HotelModule();

        while (true) {
            System.out.println("Welcome to the Room Booking System.");
            System.out.println("1. Book a room");
            System.out.println("2. Inquire about a guest");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                // Select state
                System.out.println("Available states:");
                List<String> states = bookingController.getStates();
                for (String state : states) {
                    System.out.println(state);
                }

                System.out.println("Enter state name:");
                String stateName = scanner.nextLine();

                // Select city
                List<String> cities = bookingController.getCitiesByStateName(stateName);
                if (cities.isEmpty()) {
                    System.out.println("Invalid state name.");
                    continue;
                }

                System.out.println("Available cities in " + stateName + ":");
                for (String city : cities) {
                    System.out.println(city);
                }

                System.out.println("Enter city name:");
                String cityName = scanner.nextLine();

                // Select hotel
                System.out.println("Available hotels:");
                List<HotelModule.Hotel> hotels = hotelModule.getDefaultHotels();
                for (HotelModule.Hotel hotel : hotels) {
                    System.out.println(hotel.getName() + " - " + hotel.getDistance() + " km away");
                }

                System.out.println("Enter hotel name:");
                String hotelName = scanner.nextLine();


                // Select hotel (for simplicity, directly proceed with room booking)
                System.out.println("Available rooms:");
                List<Room> availableRooms = bookingController.getAvailableRooms();
                for (Room room : availableRooms) {
                    System.out.println("Room Number: " + room.getRoomNumber() + ", Capacity: " + room.getCapacity() + ", Price:" + room.getPrice() + ", Has AC:" + room.hasAC() + ", Has TV:" + room.hasTV() + ", Has Wifi:" + room.hasWifi());
                }

                // Collect booking details from user
                System.out.println("Enter room number to book:");
                int roomNumber = scanner.nextInt();
                scanner.nextLine(); // consume newline

                // Find the selected room's capacity
                Room selectedRoom = null;
                for (Room room : availableRooms) {
                    if (room.getRoomNumber() == roomNumber) {
                        selectedRoom = room;
                        break;
                    }
                }

                if (selectedRoom == null) {
                    System.out.println("Invalid room number.");
                    continue; // Skip to next iteration if room number is invalid
                }


                System.out.println("Enter customer name:");
                String name = scanner.nextLine();

                System.out.println("Enter customer age:");
                int age = scanner.nextInt();
                scanner.nextLine();

                if (age < 18) {
                    System.out.println("Customer must be at least 18 years old to book a room.");
                    continue;
                }

                System.out.println("Enter number of persons:");
                int numberOfPersons;

                while (true) {
                    numberOfPersons = scanner.nextInt();
                    scanner.nextLine();

                    if (numberOfPersons < 1) {
                        System.out.println("There must be at least 1 person to book a room.");
                    } else if (numberOfPersons > selectedRoom.getCapacity()) {
                        System.out.println("You cannot book this room for more than " + selectedRoom.getCapacity() + " persons.");
                    } else {
                        break; // Valid number of persons
                    }

                    System.out.println("Please enter the number of persons again:");
                }

                System.out.println("Enter valid govt ID:");
                String govtID = scanner.nextLine();

                System.out.println("Enter mobile number:");
                String mobileNumber;

                while (true) {
                    mobileNumber = scanner.nextLine();

                    // Validate mobile number format
                    if (mobileNumber.matches("\\d{10}")) {
                        break; // Exit loop if the mobile number is valid
                    } else {
                        System.out.println("Invalid mobile number format. Please enter a 10-digit integer.");
                    }
                }

                System.out.println("Enter number of days to rent:");
                int days = scanner.nextInt();

                // Create a customer object with the collected details
                Customer customer = new Customer(name, age, mobileNumber, govtID, numberOfPersons, stateName, cityName, hotelName);
                // Book the room1
                bookingController.bookRoom(roomNumber, customer, days);
            } else if (choice == 2) {
                // Inquire about a guest
                System.out.println("Enter the name of the guest to inquire:");
                String name = scanner.nextLine();
                inquiryController.findBookingByName(name);
            } else if (choice == 3) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close(); // Close the scanner
    }
}
