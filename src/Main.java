public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu Car
        Car car = new Car("Toyota", "Camry", 2020, 500, 20);
        System.out.println("Car:");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Fuel efficiency: " + car.calculateFuelEfficiency());

        System.out.println();

        // Tworzenie obiektu Truck
        Truck truck = new Truck("Volvo", "FH16", 2018, 1000, 100, 5);
        System.out.println("Truck:");
        System.out.println("Make: " + truck.make);
        System.out.println("Model: " + truck.model);
        System.out.println("Year: " + truck.year);
        System.out.println("Cargo weight: " + truck.cargoWeight + " tons");
        System.out.println("Fuel efficiency: " + truck.calculateFuelEfficiency());
    }
}
