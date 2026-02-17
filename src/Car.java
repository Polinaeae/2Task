import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Car implements Comparable <Car> {
    String vin;
    String model;
    String manufacturer;
    int yearRelease;
    int mileage;
    double price;

    public Car(String vin, String model, String manufacturer, int year, int mileage, double price) {
        this.vin = vin;
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearRelease = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return vin.equals(car.vin);
    }

    @Override
    public int hashCode() {
        return vin.hashCode();
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(other.yearRelease, this.yearRelease);
    }

    @Override
    public String toString() {
        return String.format(vin, model, manufacturer, yearRelease, mileage, price);
    }
}
