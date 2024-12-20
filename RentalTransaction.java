
public class RentalTransaction { // This class is used to log all transactions that take place.
    private Vehicle vehicle;
    private Customer customer;
    private int days;

    public RentalTransaction(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Transaction: Vehicles.Vehicle:- " + vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getYear() +
                ", Customer:- " + customer.getName() + ", Days:- " + days;
    }


    
}
