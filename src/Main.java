public class Main {
    public static void main(String[] args) {
        //Задача 1

        int total = 2459000;
        int monthMoney = 15000;
        int month = 1;
        int totalMoney = monthMoney;
        while (totalMoney < total) {
            System.out.println("Месяц " + month + " сумма накоплений равна " + totalMoney + " рублей.");
            totalMoney += monthMoney;
            month++;
        }
        //Задача 2

        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        //Задача 3

        int population = 12000000;
        int birthrate = 17;
        int dead = 8;
        int yearTotal = 10;
        int year = 0;
        while (year < yearTotal) {
            population += (population / 1000) * (birthrate - dead);
            year++;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        //Задача 4

        int totalSum = 12000000;
        int sum = 15000;
        int percent = 7;
        int months = 1;
        while (sum <= totalSum) {
            System.out.println("Месяц " + months + " сумма накоплений равна " + sum + " рублей.");
            sum += sum * percent / 100;
            months++;
        }
        System.out.println("Итоговая сумма: " + sum + " Потребовалось месяцев: " + months);
        //Задача 5

        int totalSum_1 = 12000000;
        int sum_1 = 15000;
        int percent_1 = 7;
        int months_1 = 0;
        while (sum_1 <= totalSum_1) {
            sum_1 += sum_1 * percent_1 / 100;
            months_1++;
            if (months_1 % 6 == 0) {
                System.out.println("Месяц " + months_1 + " сумма накоплений равна " + sum_1 + " рублей.");
            }
        }
        System.out.println("Итоговая сумма: " + sum_1 + " Потребовалось месяцев: " + months_1);
        //Задача 6

        int rub = 15000;
        int monthPercent = 7;
        int yearAll = 9;
        int monthStart = 0;
        while (monthStart < yearAll * 12) {
            rub += rub * monthPercent / 100;
            monthStart++;
            if (monthStart % 6 == 0) {
                System.out.println("Месяц " + monthStart + " сумма накоплений равна " + rub + " рублей.");
            }

        }
        System.out.println("Итоговая сумма: " + rub + " Потребовалось месяцев: " + monthStart);
        //Задача 7

        int friday = 5;
        int dayMonth = 31;
        while (friday <= dayMonth){
            System.out.printf("Сегодня пятница, %s-e число. Необходимо подготовить отчет%n", friday);
            friday += 7;
        }
        //Задача 8
        int yearCurrent = 2023;
        int yearBefore = 200;
        int yearAfter = 100;
        int period = 79;
        for (int i = 0; i < yearCurrent + yearAfter; i += period){
            if (i > yearCurrent - yearBefore){
                System.out.println(i);
            }

        }
    }
}