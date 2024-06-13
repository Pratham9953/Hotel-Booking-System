package Controller.java;

import model.*;
import java.util.List;

public class BookingController {

    private RoomBookingSystem roomBookingSystem;

    public BookingController(RoomBookingSystem roomBookingSystem) {
        this.roomBookingSystem = roomBookingSystem;
    }

    public List<String> getStates() {
        return StateModule.getStates();
    }

    public List<String> getCitiesByStateName(String stateName) {
        return CityModule.getCitiesByStateName(stateName);
    }

    public List<Room> getAvailableRooms() {
        return roomBookingSystem.getAvailableRooms();
    }

    public void bookRoom(int roomNumber, Customer customer, int days) {
        roomBookingSystem.bookRoom(roomNumber, customer, days);
    }
}
