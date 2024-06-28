public class Truck extends Vehicle {
    private double milesDriven;
    private double fuelConsumed;
    double cargoWeight; // in tons

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        if (fuelConsumed == 0) {
            return 0; // handle division by zero if needed
        }
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5));
    }
}
