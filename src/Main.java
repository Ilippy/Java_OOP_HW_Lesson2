import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();
        Cat[] cats = {
                new Cat("Гарфилд", 6),
                new Cat("Том", 10),
                new Cat("Барсик", 15),
                new Cat("Пушок", 12),
                new Cat("Саймон", 8),
                new Cat("Гарфилд", 19),
                new Cat("Гарфилд", 16)
        };
        showInfo(cats);

        boolean check = true;
        while (check) {
            System.out.println("Выберете, что вы хотите сделать:");
            System.out.println("1 - Узнать голодны ли кошки");
            System.out.println("2 - Покормить котов");
            System.out.println("3 - Узнать сколько еды осталось в тарелке");
            System.out.println("4 - Положить еду в тарелку");
            System.out.println("0 - Выход");

            Scanner scanner = new Scanner(System.in);
            int customerChoiceInt = scanner.nextInt();
            switch (customerChoiceInt) {
                case 1 -> showInfo(cats);
                case 2 -> feed(cats, plate);
                case 3 -> plate.info();
                case 4 -> {
                    System.out.println("Сколько еды вы хотите положить?");
                    int food = scanner.nextInt();
                    plate.addFood(food);
                }
                case 0 -> check = false;
                default -> System.out.println("Введите корректную цифру");
            }
        }
    }

    private static void showInfo(Cat[] cats) {
        System.out.println("------------");
        for (Cat cat : cats) {
            cat.info();
        }
        System.out.println("------------");
    }

    private static void feed(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }
}