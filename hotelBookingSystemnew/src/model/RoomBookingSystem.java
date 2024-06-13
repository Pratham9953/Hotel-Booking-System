package model;
import java.util.Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomBookingSystem {
    private Map<Integer, Room> rooms = new HashMap<>();

    {
        // Initialize rooms (mock data)
        rooms.put(101, new Room(101, 2, 1000.0, true, true, true));
        rooms.put(102, new Room(102, 3, 1500.0, true, false, true));
        rooms.put(103, new Room(103, 4, 2000.0, false, true, false));
        rooms.put(104, new Room(104, 1, 500.0, false, false, true));
        rooms.put(105, new Room(105, 2, 1000.0, true, true, false));
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms.values()) {
            if (!room.isBooked()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    // Method to generate a 4-digit random password
    private String generatePassword() {
        Random random = new Random();
        int password = 1000 + random.nextInt(9000);
        return String.valueOf(password);
    }

    public void bookRoom(int roomNumber, Customer customer, int days) {
        Room room = rooms.get(roomNumber);
        if (room != null && !room.isBooked()) {
            room.book(customer, days);
            String password = generatePassword();
            double totalBill = calculateBill(room.getPrice(), days);
            System.out.println("Room " + roomNumber + " booked successfully for " + days + " days.");
            System.out.println("Customer Details: " + customer.getName());
            System.out.println("Password for room: " + password);
            System.out.println("Total Bill (including 10% service charge and 8% GST): ₹" + totalBill);
        } else {
            System.out.println("Room " + roomNumber + " is not available.");
        }
    }

    private double calculateBill(double pricePerDay, int days) {
        double roomRent = pricePerDay * days;
        double serviceCharge = roomRent * 0.10;
        double gst = roomRent * 0.08;
        return roomRent + serviceCharge + gst;
    }

    public void findBookingByName(String name) {
        for (Room room : rooms.values()) {
            if (room.isBooked() && room.getCustomer().getName().equalsIgnoreCase(name)) {
                // Assuming these variables are part of Room or Customer objects
                // If they are not, they should be passed as parameters or retrieved from somewhere else
                String hotelName = room.getCustomer().getHotelName();
                String cityName = room.getCustomer().getCity();
                String stateName = room.getCustomer().getState();

                System.out.println("Guest " + name + " is staying in Room " + room.getRoomNumber() +
                        ", Hotel " + hotelName + ", City " + cityName + ", State " + stateName);
                return;
            }
        }
        System.out.println("No booking found for guest named " + name);
    }
}
