import java.util.ArrayList;
import java.util.List;


public class RentalAgency {
    private List<Vehicle> fleetOfVehicles; // List of all vehicles owned by the agency
    private List<RentalTransaction> transactions; //List of all transactions (rentals) that take place.

    public RentalAgency() {
        this.fleetOfVehicles = new ArrayList<Vehicle>();
        this.transactions = new ArrayList<RentalTransaction>();
    }

    public void addVehicle(Vehicle vehicle) { // Adds a vehicle to the list of vehicles owned by the agency
        this.fleetOfVehicles.add(vehicle);
    }

    public List<Vehicle> getFleetOfVehicles() { // Returns the list
        return fleetOfVehicles;
    }

    public void addTransaction(RentalTransaction transaction) { //Adds a transaction to the list of transactions
        this.transactions.add(transaction);
    }

    public List<RentalTransaction> getTransactions() { // Returns the list
        return transactions;
    }


    public void rentVehicle(String vehicleID, Customer customer, int days) {
        for (Vehicle vehicle : this.fleetOfVehicles) {
            if (vehicle.getVehicleId().equals(vehicleID) && vehicle.isAvailable()) {
                if (vehicle instanceof IRentable) { //Checks if vehicle is rentable
                    ((IRentable) vehicle).rent(customer, days); //Casts to rentable and calls the rent method.
                }
            }
        }
    }
}
