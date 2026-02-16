import java.util.*;

public class task2 {
    public static void main(String[] args) {
        List<String> ModelCar = new ArrayList<>(Arrays.asList(
                "Toyota Camry", "BMW X5", "Lada Granta", "Kia Ceed", "Kia Rio",
                "Toyota Camry", "BMW X5", "Lada Granta", "Kia Ceed", "Kia Rio",
                "BMW X5", "Lada Granta", "Tesla Model S"
        ));

        Set<String> ModelCar2 = new LinkedHashSet<>(ModelCar);

        Set<String> CarrModel = new HashSet<>();
        for (String model : ModelCar2) {
            if (model.contains("Tesla")) {
                CarrModel.add("ELECTRO_CAR");
            } else {
                CarrModel.add(model);
            }
        }

        List<String> SortModelcar = new ArrayList<>(CarrModel);
        Collections.sort(SortModelcar, Collections.reverseOrder());


        System.out.println("Модели в обратном алфавитном порядке и заменой");
        for (String model : SortModelcar) {
            System.out.println(model);
        }
        Set<String> Resuit = new LinkedHashSet<>(SortModelcar);
    }
}

