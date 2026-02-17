import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("VIN7666", "Model S", "BMW", 2022, 30000, 5550000));
        cars.add(new Car("VIN111", "Model M", "KIA", 2020, 60000, 50000));
        cars.add(new Car("VIN897", "Model XS", "Lada", 2025, 100000, 600000));
        cars.add(new Car("VIN333", "Model XXl", "KIA", 2012, 1000, 1000000));
        cars.add (new Car("VIN7666", "Model SS", "Audi", 2022, 36000, 777000));
        cars.add(new Car("VIN111", "Model L", "Mersedes", 2020, 80000, 890000));
        cars.add(new Car("VIN897", "Model XL", "Audi", 2025, 10000, 2000000));
        cars.add(new Car("VIN333", "Model XXXl", "BMW", 2012, 8000, 1500000));

        System.out.println("Машины с пробегом меньше 50000");
        ArrayList<Car> MileageCar = new ArrayList<>();
        for (int i=0; i<cars.size();i++){
            Car car2 = cars.get(i);
            if(car2.mileage<50000){
                MileageCar.add(car2);
                System.out.println(car2.manufacturer + " " + " " +car2.model + " пробег " +car2.mileage);
            }
        }
        System.out.println();

        System.out.println("Сортировка по цене");
        ArrayList<Car> PriceSort = new ArrayList<>(cars);
        for (int i = 0; i < PriceSort.size() - 1; i++) {
            for (int j = 0; j < PriceSort.size() - i - 1; j++) {
                Car before = PriceSort.get(j);
                Car next = PriceSort.get(j+1);
                if(before.price<next.price){
                    Car temp = PriceSort.get(j);
                    PriceSort.set(j, PriceSort.get(j+1));
                    PriceSort.set(j+1, temp);
                }
            }
        }
        for (int i=0; i<PriceSort.size(); i++){
            Car car2 = PriceSort.get(i);
            System.out.println((i+1) + " " + car2.manufacturer + " "+ car2.model + " " + car2.price);
        }
        System.out.println();

        System.out.println("Топ 3 дорогие машины");
        for (int i = 0; i < 3; i++) {
            if (i < PriceSort.size()) {
                Car car = PriceSort.get(i);
                System.out.println((i + 1) + " " + car.manufacturer + " " + car.model + " цена " + car.price);
            }
        }
        System.out.println();

        int Sum = 0;
        for (int i = 0; i < cars.size(); i++) {
            Sum = Sum + cars.get(i).mileage;
        }
        double AverageMil = (double) Sum / cars.size();
        System.out.println("Средний пробег");
        System.out.println(AverageMil);
        System.out.println();


        System.out.println("Сортировка машин по производителю");
        HashMap<String, ArrayList<Car>> carsByManufacturer = new HashMap<>();
        for (int i = 0; i < cars.size(); i++) {
            Car currentCar = cars.get(i);
            String manufacturer = currentCar.manufacturer;
            if (!carsByManufacturer.containsKey(manufacturer)) {
                ArrayList<Car> manufacturerCars = new ArrayList<>();
                manufacturerCars.add(currentCar);
                carsByManufacturer.put(manufacturer, manufacturerCars);
            } else {
                ArrayList<Car> manufacturerCars = carsByManufacturer.get(manufacturer);
                manufacturerCars.add(currentCar);
            }
        }
        Set<String> manufacturers = carsByManufacturer.keySet();
        for (String manufacturer : manufacturers) {
            System.out.println(manufacturer + " ");
            ArrayList<Car> manufacturerCars = carsByManufacturer.get(manufacturer);
            for (int i = 0; i < manufacturerCars.size(); i++) {
                Car car = manufacturerCars.get(i);
                System.out.println(" " + car.model + " " + car.yearRelease + " пробег " + car.mileage + " цена " + car.price);
            }
            System.out.println();
        }
    }
}