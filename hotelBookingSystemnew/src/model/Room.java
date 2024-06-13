package model;

public class Room {
    private int roomNumber;
    private int capacity;
    private boolean isBooked;
    private double price;
    private boolean hasAC;
    private boolean hasTV;
    private boolean hasWifi;
    private Customer customer;

    public Room(int roomNumber, int capacity, double price, boolean hasAC, boolean hasTV, boolean hasWifi) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.price = price;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasAC() {
        return hasAC;
    }

    public boolean hasTV() {
        return hasTV;
    }

    public boolean hasWifi() {
        return hasWifi;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book(Customer customer, int days) {
        this.isBooked = true;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", capacity=" + capacity +
                ", price=" + price +
                ", hasAC=" + hasAC +
                ", hasTV=" + hasTV +
                ", hasWifi=" + hasWifi +
                ", isBooked=" + isBooked +
                '}';
    }
}
