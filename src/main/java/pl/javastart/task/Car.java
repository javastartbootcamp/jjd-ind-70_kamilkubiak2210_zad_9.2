package pl.javastart.task;

public class Car extends Vehicle {
    private final boolean airConditioning;

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public Car(String name, int tankCapacity, double averageFuelConsumptionPer100Km, boolean airConditioning) {
        super(name, tankCapacity, averageFuelConsumptionPer100Km);
        this.airConditioning = airConditioning;
    }

    @Override
    public double fuelConsumption() {
        double fuelConsumption;
        double averageFuelConsumptionPer100Km = getAverageFuelConsumptionPer100Km();
        if (airConditioning) {
            fuelConsumption = averageFuelConsumptionPer100Km + 0.8;

        } else {
            fuelConsumption = averageFuelConsumptionPer100Km;
        }
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Nazwa: " + getName() + ", pojemność baku: " + getTankCapacity() + "l , średnie spalanie: " + getAverageFuelConsumptionPer100Km()
                + "l , klima: " + airConditioning;
    }

    @Override
    public double range() {
        double fuelConsumptionWithOrWithoutAirConditioning = fuelConsumption();
        return getTankCapacity() / fuelConsumptionWithOrWithoutAirConditioning * 100;
    }
}

