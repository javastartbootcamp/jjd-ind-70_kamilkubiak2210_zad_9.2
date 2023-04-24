package pl.javastart.task;

public class Truck extends Car {
    public static final int WEIGHT_TO_INCREASE_CONSUMPTION = 100;
    public static final double ADDITIONAL_FUEL_CONSUMPTION_WITH_AIR_CONDITIONING_ON_PER_100KM = 0.5;
    public static final double ADDITIONAL_FUEL_CONSUMPTION_WITH_LOAD_ON_PER_100KM = 1.6;
    private final int loadWeight;

    public Truck(String name, int tankCapacity, double averageFuelConsumptionPer100Km, boolean airConditioning, int loadWeight) {
        super(name, tankCapacity, averageFuelConsumptionPer100Km, airConditioning);
        this.loadWeight = loadWeight;
    }

    @Override
    public double fuelConsumption() {
        double fuelConsumption = getAverageFuelConsumptionPer100Km();

        if (isAirConditioning()) {
            fuelConsumption += ADDITIONAL_FUEL_CONSUMPTION_WITH_LOAD_ON_PER_100KM;
        }
        if (loadWeight >= WEIGHT_TO_INCREASE_CONSUMPTION) {
            int i = loadWeight / WEIGHT_TO_INCREASE_CONSUMPTION;
            fuelConsumption += i * ADDITIONAL_FUEL_CONSUMPTION_WITH_AIR_CONDITIONING_ON_PER_100KM;
        }
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Nazwa: " + getName() + ", pojemność baku: " + getTankCapacity() + "l , średnie spalanie: " + getAverageFuelConsumptionPer100Km()
                + "l , klima: " + isAirConditioning() + ", ładunek: " + loadWeight + "kg";
    }

}

