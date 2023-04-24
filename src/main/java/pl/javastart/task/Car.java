package pl.javastart.task;

public class Car extends Vehicle {
    public static final double ADDITIONAL_FUEL_CONSUMPTION_WITH_AIR_CONDITIONING_ON_PER_100KM = 0.8;
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
        double fuelConsumption = getAverageFuelConsumptionPer100Km();
        if (airConditioning) {
            fuelConsumption += ADDITIONAL_FUEL_CONSUMPTION_WITH_AIR_CONDITIONING_ON_PER_100KM;
        }
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Nazwa: " + getName() + ", pojemność baku: " + getTankCapacity() + "l , średnie spalanie: " + getAverageFuelConsumptionPer100Km()
                + "l , klima: " + airConditioning;
    }
}

