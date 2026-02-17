import java.lang.reflect.Array;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();
        Car car1 = new Car("Vin111", "Model XL", "Kia", 2015, 1000, 550000);
        Car car2 = new Car("Vin753", "Model L", "Lada", 2012, 1500, 560000);
        Car car3 = new Car("Vin988", "Model S", "Tesla", 2022, 1700, 100000);
        Car car4 = new Car("Vin1222", "Model M", "BMW", 2024, 1600, 577000);
        Car car5 = new Car("Vin111", "Model XXXL", "Lada", 2023, 1070, 4000000);

        System.out.println("car1 " + carSet.add(car1));
        System.out.println("car2 " + carSet.add(car2));
        System.out.println("car3 " + carSet.add(car3));
        System.out.println("car4 " + carSet.add(car4));
        System.out.println("car5 " + carSet.add(car5));

        System.out.println("Добавлены: " + carSet.size());
        for (Car car :carSet){
            System.out.println(" " + car);
        }
        Set<Car> sortedCars = new TreeSet<>(carSet);
        System.out.println("Сортировка по году выпуска: ");
        for (Car car : sortedCars) {
            System.out.println("  " + car.yearRelease + " - " + car.model + " (" + car.vin + ")");
        }
    }
}

