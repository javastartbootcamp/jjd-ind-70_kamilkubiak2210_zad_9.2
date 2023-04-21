package pl.javastart.task;

public class Main {
    private static final Vehicle[] vehicles = new Vehicle[2];

    public static void main(String[] args) {

        vehicles[0] = new Car("Lambo", 60, 17, true);
        vehicles[1] = new Truck("Optimus Prime", 150, 23, true, 200);
        printInfoAboutVehiclesAndRanges();
    }

    private static void printInfoAboutVehiclesAndRanges() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.printf("Zasięg: %.2fkm\n", vehicle.range());
        }
    }
}
