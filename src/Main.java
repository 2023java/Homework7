public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i=0;
        while ( total <= 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while ( i< 10) {
            i++;
            System.out.print(i+" " );
        }
        System.out.println();
        int c =11;
        while ( c> 1) {
            c--;
            System.out.print(c + " ");
        }
        System.out.println();
        for (int j = 10; j >0 ; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = population*17/1000;
        int populationMortality=population*8/1000;
        int year=0;
        while ( year < 10) {
            population =population + birthRate-populationMortality;
            year++;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int total=15000;
        int month = 1;
        double percent = 1.07;
        for (;total < 12_000_000;month++) {
            total= (int) (total*percent);
            System.out.println("Месяц " + month + ", сумма накоплений равна " +total + " рублей");
        }
          }
    public static void task5() {
        System.out.println("Задача 5");
        int total=15000;
        int month = 1;
        double percent = 1.07;
        for (;total < 12_000_000;month++) {
            total = (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int total=15000;
        int month = 1;
        double percent = 1.07;
        for (;month <= 108;month++) {
            total = (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday=3;
        for(; friday <= 31; friday = friday + 7) {
            System.out.println(" Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int a = 1823;
        int b = 2123;
        for (int year= a; year <= b; year++) {

            if (year % 79 == 0 ) {
                System.out.println(year);
            }
        }
    }

}