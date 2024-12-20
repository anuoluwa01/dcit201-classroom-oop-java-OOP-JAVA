
abstract class Vehicle {
    private String vehicleId;
    protected String make;
    protected String model;
    protected int year;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructor
    public Vehicle(String vehicleId, String make, String model, int year, double baseRentalRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.make = make;
        this.year = year;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    //Getters
    public String getVehicleId() {
        return vehicleId;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    //Setters
    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    //Abstract methods
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return "Vehicles.Vehicle ID: " + vehicleId + ", Model: " + model + ", Base Rental Rate: " + baseRentalRate + ", Availability: " + isAvailable;
    }


}
