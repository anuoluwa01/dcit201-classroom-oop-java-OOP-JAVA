import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String customerID;
    private final String name;
    private String phone;
    private String email;
    private List<Vehicle> rentalHistory;

    //Constructor
    public Customer(String customerID, String name, String phone, String email) {
        this.customerID = customerID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.rentalHistory = new ArrayList<Vehicle>();
    }

    //Getters
    public String getCustomerID() {
        return customerID;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    //Setters
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void addRental(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerID + ", Name: " + name + ", Rental History: " + rentalHistory;
    }
}
