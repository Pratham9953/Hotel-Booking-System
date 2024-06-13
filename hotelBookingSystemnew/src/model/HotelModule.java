package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HotelModule {

    // Class to represent a hotel
    public static class Hotel {
        private String name;
        private int distance;

        public Hotel(String name, int distance) {
            this.name = name;
            this.distance = distance;
        }

        public String getName() {
            return name;
        }

        public int getDistance() {
            return distance;
        }

        @Override
        public String toString() {
            return "Hotel{name='" + name + "', distance=" + distance + " km}";
        }
    }

    // Method to generate a list of default hotels
    public List<Hotel> getDefaultHotels() {
        List<Hotel> hotels = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            String name = "hotel" + i;
            int distance = random.nextInt(10) + 1; // Generates a random number between 1 and 10
            hotels.add(new Hotel(name, distance));
        }

        return hotels;
    }

    public static void main(String[] args) {
        HotelModule hotelModule = new HotelModule();
        List<Hotel> defaultHotels = hotelModule.getDefaultHotels();

        for (Hotel hotel : defaultHotels) {
            System.out.println(hotel);
        }
    }
}
