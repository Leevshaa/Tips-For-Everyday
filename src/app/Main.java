package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВітаю! Введіть день тижня: ");
        String userDay = scanner.nextLine().trim().toUpperCase();

        Day day = Day.valueOf(userDay);
        DataProcessing dataProcessing = new DataProcessing();
        dataProcessing.advise(day);
    }
}
