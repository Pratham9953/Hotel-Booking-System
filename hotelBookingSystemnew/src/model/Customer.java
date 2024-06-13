package model;

public class Customer {
    private String name;
    private int age;
    private String mobileNumber;
    private String govtID;
    private int numberOfPersons;
    private String state;
    private String city;
    private String hotelName;

    public Customer(String name, int age, String mobileNumber, String govtID, int numberOfPersons, String state, String city, String hotelName) {
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.govtID = govtID;
        this.numberOfPersons = numberOfPersons;
        this.state = state;
        this.city = city;
        this.hotelName = hotelName;
    }

    // Getter and setter methods for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGovtID() {
        return govtID;
    }

    public void setGovtID(String govtID) {
        this.govtID = govtID;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
