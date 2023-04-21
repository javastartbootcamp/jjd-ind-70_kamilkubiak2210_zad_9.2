package pl.javastart.task;

public class Vehicle {
    private final String name;
    private final int tankCapacity;
    private final double averageFuelConsumptionPer100Km;

    public Vehicle(String name, int tankCapacity, double averageFuelConsumptionPer100Km) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumptionPer100Km = averageFuelConsumptionPer100Km;
    }

    public String getName() {
        return name;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public double getAverageFuelConsumptionPer100Km() {
        return averageFuelConsumptionPer100Km;
    }

    public double fuelConsumption() {
        return 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", averageFuelConsumptionPer100Km=" + averageFuelConsumptionPer100Km +
                '}';
    }

    public double range() {
        return tankCapacity / averageFuelConsumptionPer100Km * 100;
    }
}
