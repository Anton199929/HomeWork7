//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int contribution = 15000;
        int savings = 0;
        int month = 0;
        while (savings <= 2459000){
            month++;
            savings = savings + contribution;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println("Задача 2");

        int number = 0;
        while (number < 10){
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");

        int population = 12000000;
        int year = 0;
        while (year < 10){
            population = population + (((population / 1000) * 17) - ((population / 1000) * 8));
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println("Задача 4");

        int contribution1 = 15000;
        int savings1 = 0;
        int month1 = 0;
        while (savings1 < 12000000){
            month1++;
            savings1 = savings1 + ((savings1 * 7) / 100);
            savings1 = savings1 + contribution1;
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + savings1 + " рублей");
        }

        System.out.println("Задача 5");

        int contribution2 = 15000;
        int savings2 = 0;
        int month2 = 0;
        while (savings2 < 12000000){
            month2++;
            savings2 = savings2 + ((savings2 * 7) / 100);
            savings2 = savings2 + contribution2;
            if (month2 % 6 == 0){
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + savings2 + " рублей");
            }
        }

        System.out.println("Задача 6");

        int contribution3 = 15000;
        int savings3 = 0;
        int month3 = 0;
        while (month3 < 108){
            month3++;
            savings3 = savings3 + ((savings3 * 7) / 100);
            savings3 = savings3 + contribution3;
            if (month3 % 6 == 0){
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + savings3 + " рублей");
            }
        }

        System.out.println("Задача 7");

        int friday = 7;
        for ( int dayNumber = 1; dayNumber <= 31; dayNumber++ ){
            if (dayNumber % 7 == 0){
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println("Задача 8");

        for (int year1 = 1820; year1 > 1800 && year1 < 2100; year1++){
            if (year1 % 79 == 0){
                System.out.println(year1);
            }
        }

    }
}