

public class Motorcycle extends Vehicle implements IRentable {
    private final double avgSpeed;

    public Motorcycle(String vehicleId, String make, String model, int year, double baseRentalRate, boolean isAvailable, double avgSpeed) {
        super(vehicleId, make, model, year, baseRentalRate, isAvailable);
        this.avgSpeed = avgSpeed;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    @Override
    public double calculateRentalCost(int days) { //Calculates the cost of renting a motorcycle depending on its average speed
        double cost = getBaseRentalRate() * days;
        if (avgSpeed >= 95) {
            cost += 250; //Additional cost for motorcycles with an average speed greater than or equal to 9km/h
        }
        System.out.println("The cost to rent this motorcycle is $" + cost);
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) { //Allows a motorcycle to be rented b a customer for a certain number of days if available
        if (isAvailableForRental()) {
            setAvailable(false);
            customer.addRental(this);
            System.out.println("You have rented a " + this.make + " " + this.model + " motorcycle for " + days + " days");
        } else { // Returns this if motorcycle unavailable
            System.out.println("Vehicles.Motorcycle is not available for rental");
        }
    }

    @Override
    public void returnVehicle() { //Makes a motorcycle available again.
        setAvailable(true);
        System.out.println("You have returned the motorcycle.");
    }
}
