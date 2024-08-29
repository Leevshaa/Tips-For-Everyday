package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Створюємо сканер
        Scanner scanner = new Scanner(System.in);

        //Просимо користувача обрати день тижня
        System.out.print("\nВітаю! Введіть день тижня: ");
        String userDay = scanner.nextLine().trim().toUpperCase();

        //Створюємо змінну day типу Day, в яку передаємо користувацьке
        // значення userDay за допомогою статичного методу valueOf
        Day day = Day.valueOf(userDay);

        //Створюємо екземпляр класу DataProcessing, щоб отримати доступ до
        // методу advise
        DataProcessing dataProcessing = new DataProcessing();
        dataProcessing.advise(day);
    }
}
