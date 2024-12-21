import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int rateUSD = 102;
        int rateEUR = 120;
        int rateCNY = 70;
        /*
        Объявите переменные и сразу присвойте им значение:
        - rateUSD (курс доллара)
        - rateEUR (курс евро)
        - rateCNY (курс юаня)
         */

        System.out.println("Введите сумму рублей для конвертации:");
        Scanner scanner = new Scanner(System.in); // Создание нового сканера для ввода
        int roubles = scanner.nextInt();
        // Ввод суммы рублей
        /* Ввод суммы рублей для конвертации
           Сохраните введённое значение в переменную "roubles"
         */

        System.out.println("Введите номер валюты, в какую перевести рубли:");
        System.out.println("1 – доллары;");
        System.out.println("2 – евро;");
        System.out.println("3 – юани;");

        int command = scanner.nextInt(); // Ввод номера валюты
        /* Ввод номера команды
           Сохраните введенное значение в переменную "command" */

        if (command == 1) {
            double dollars = (double) roubles / rateUSD;
            if (dollars >= 0) {
                System.out.printf("Рубли в долларах: %.2f%n", dollars);
            } else {
                System.out.println("Ошибка: сумма рублей не может быть отрицательной.");
            }
        }
        else if (command == 2){
                double euros = (double) roubles / rateEUR;
                if (euros >= 0) {
                    System.out.printf("Рубли в евро: %.2f%n", euros);
                } else {
                System.out.println("Ошибка: сумма рублей не может быть отрицательной.");
            }
        }
        else if (command ==3){
            double yuan = (double) roubles / rateCNY;
            if (yuan >=0) {
                System.out.printf("Рубли в юаня: %.2f%n", yuan);
            } else {
                System.out.println("Ошибка: сумма рублей не может быть отрицательной.");
            }
        } else {
            System.out.println("Такой команды нет.");
        }
        System.out.println("Программа завершила работу.");
        scanner.close(); // Закрытие сканера
        long endTime = System.nanoTime();
        long duration = endTime - startTime;


        System.out.println("Время выполнения: " + duration + " наносекунд");
        System.out.println("Время выполнения: " + (duration / 1_000_000) + " мс");
    }
}