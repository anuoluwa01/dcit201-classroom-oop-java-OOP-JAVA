

public class Car extends Vehicle implements IRentable {
    private final String color;

    public Car(String vehicleId, String make, String model, int year, double baseRentalRate, boolean isAvailable, String color) {
        super(vehicleId, make, model, year, baseRentalRate, isAvailable);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double calculateRentalCost(int days) { //Calculates the cost of renting a car depending on the year it was made
        double cost = getBaseRentalRate() * days;
        if (year > 2018) {
            cost += 300; //Additional cost for more recent car models
        }
        System.out.println("The cost to rent this car is $" + cost);
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) { //Allows a customer rent a car for a certain number of days
        if (isAvailableForRental()) {
            setAvailable(false);
            customer.addRental(this);
            System.out.println("You have rented a " + this.make + " " + this.model + " car for " + days + " days");
        } else { //Returns this if the cvar in not available
            System.out.println("Vehicles.Car is not available for rental");
        }
    }

    @Override
    public void returnVehicle() { //To make a car available for rent again
        setAvailable(true);
        System.out.println("You have successfully returned the car.");
    }
}

