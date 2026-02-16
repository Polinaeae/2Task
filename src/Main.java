import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] car = new int[50];
        Random random = new Random();
        System.out.println("Годы выпуска авто");
        for (int i = 0; i <car.length; i++) {
            car[i] = 2000 + random.nextInt(26);
        }
        for(int year : car) {
            System.out.print(year + " ");
        }
        System.out.println();

        System.out.println("Авто выпущены после 2015");
        int auto2015 = 0;
        for (int i = 0; i < 50; i++) {
            if (car[i] > 2015) {
                System.out.print(car[i] + " ");
                auto2015++;
            }
        }
        System.out.println();

        System.out.println("Средний возраст авто");
        int Sum = 0;
        int CurrentYear = 2026;
        for (int i = 0; i < 50; i++) {
            int age = CurrentYear - car[i];
            Sum = Sum + age;
        }
        double AverageAge = (double) Sum / 50;
        System.out.print(AverageAge);
    }
}
