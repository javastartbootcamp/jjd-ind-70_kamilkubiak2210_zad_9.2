package pl.javastart.task;

public class Truck extends Car {
    private final int loadWeight;

    public Truck(String name, int tankCapacity, double averageFuelConsumptionPer100Km, boolean airConditioning, int loadWeight) {
        super(name, tankCapacity, averageFuelConsumptionPer100Km, airConditioning);
        this.loadWeight = loadWeight;
    }

    @Override
    public double fuelConsumption() {
        double fuelConsumption;
        int weightToIncreaseConsumption = 100;
        int counter = 0;
        double averageFuelConsumptionPer100Km = getAverageFuelConsumptionPer100Km();

        if (isAirConditioning() && loadWeight >= weightToIncreaseConsumption) {
            while (loadWeight >= weightToIncreaseConsumption) {
                counter++;
                weightToIncreaseConsumption += 100;
            }
            fuelConsumption = averageFuelConsumptionPer100Km + 1.6 + (0.5 * counter);

        } else if (isAirConditioning()) {
            fuelConsumption = averageFuelConsumptionPer100Km + 1.6;

        } else if (loadWeight >= weightToIncreaseConsumption) {
            while (loadWeight >= weightToIncreaseConsumption) {
                counter++;
                weightToIncreaseConsumption += 100;

            }
            fuelConsumption = averageFuelConsumptionPer100Km + (0.5 * counter);

        } else {
            return averageFuelConsumptionPer100Km;
        }
        return fuelConsumption;
    }

    @Override
    public double range() {
        double fuelConsumptionWithOrWithoutAirConditioning = fuelConsumption();
        return getTankCapacity() / fuelConsumptionWithOrWithoutAirConditioning * 100;
    }

    @Override
    public String toString() {
        return "Nazwa: " + getName() + ", pojemność baku: " + getTankCapacity() + "l , średnie spalanie: " + getAverageFuelConsumptionPer100Km()
                + "l , klima: " + isAirConditioning() + ", ładunek: " + loadWeight + "kg";
    }

}

