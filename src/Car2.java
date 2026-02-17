import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Car2 {
    String vin;
    String model;
    String manufacturer;
    int yearRelease;
    int mileage;
    double price;

    public Car2(String vin, String model, String manufacturer, int yearRelease, int mileage, double price) {
        this.vin = vin;
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearRelease = yearRelease;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(vin + model + manufacturer + yearRelease + mileage + price);
    }
}
