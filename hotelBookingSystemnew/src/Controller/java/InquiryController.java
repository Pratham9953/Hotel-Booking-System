package Controller.java;

import model.RoomBookingSystem;

public class InquiryController {
    private RoomBookingSystem roomBookingSystem;

    public InquiryController(RoomBookingSystem roomBookingSystem) {
        this.roomBookingSystem = roomBookingSystem;
    }

    public void findBookingByName(String name) {
        roomBookingSystem.findBookingByName(name);
    }
}
