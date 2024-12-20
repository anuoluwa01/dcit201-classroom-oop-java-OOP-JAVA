


public class Truck extends Vehicle implements IRentable {
    private final int loadCapacity;

    //Constructor
    public Truck(String vehicleId, String make, String model, int year, double baseRentalRate, boolean isAvailable, int loadCapacity) {
        super(vehicleId, make, model, year, baseRentalRate, isAvailable);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) { //Calculates the cost of renting a truck for a certain number of days depending on the load capacity.
        double cost = getBaseRentalRate() * days;
        if (loadCapacity > 1000) {
            cost += 500; //Additional cost for trucks with a load capacity of more the 1000lbs.
        }
        System.out.println("The cost to rent this truck is $" + cost);
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) { //Allow customers rent a truck for a number of days if available
        if (isAvailableForRental()) {
            setAvailable(false);
            customer.addRental(this);
            System.out.println("You have rented a " + this.make + " " + this.model + " truck for " + days + " days");
        } else { //Returns this if truck unavailable
            System.out.println("Vehicles.Truck is not available for rental");
        }
    }

    @Override
    public void returnVehicle() { //Makes truck available for rent again.
        setAvailable(true);
        System.out.println("You have returned the truck.");
    }

}
