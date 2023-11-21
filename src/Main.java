import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
        task8();
    }

    //Task1
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }

    //Task2
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //Task3
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        int temp;
        if (firstNumber > secondNumber) {
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Task4
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
            count++;
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее арифметическое = " + sum / count);
    }

    //Task5
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n) {
        int result;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    //Task6
    public static void task6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину линии");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    //Task7
    public static void task7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину линии");
        int n = scanner.nextInt();
        System.out.println("Введите символ");
        String s = scanner.next();

        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    //Task8
    public static void task8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        for (int i = firstNumber; i <= secondNumber; i++) {
            if ((i % 3 == 0) && (i % 5 != 0)) {
                System.out.println("Fizz");
            } else if ((i % 5 == 0) && (i % 3 != 0)){
                System.out.println("Buzz");
            } else if (i % 15 == 0){
                System.out.println("Fizz Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
