package hw1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    /**
     * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
     * 2) Вывести все простые числа от 1 до 1000
     * 3) Реализовать простой калькулятор
     * 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
     * заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
     * Предложить хотя бы одно решение или сообщить, что его нет.
     */
    public static void main(String[] args) {
        task1(3);
        task2();
        task3();
    }

    public static void task1(int n){
        BigInteger resultN = BigInteger.valueOf(1);
        BigInteger resultN2 = BigInteger.valueOf(1);
        System.out.println("1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)");
        for (int i = 1; i <= n; i++) {
            resultN = resultN.add(BigInteger.valueOf(i));
            resultN2 = resultN2.multiply(BigInteger.valueOf(i));
        }
        System.out.println("сумма чисел от 1 до " + n + " " + resultN);
        System.out.println("произведение чисел от 1 до " + n + " " + resultN2);
    }
    public static void task2(){
        System.out.println("2) Вывести все простые числа от 1 до 1000");
        for (int i = 1; i <= 1000; i++) {
            boolean primitive = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    primitive = false;
                    break;
                }
            }
            if(primitive) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task3(){
        System.out.println("Реализовать простой калькулятор");
        Scanner scanner = new Scanner(System.in);
        Integer a  = scanner.nextInt();
        String operation = scanner.next().toLowerCase();
//        System.out.println(operation);
        Integer b = scanner.nextInt();
        switch (operation) {
            case  ("+"):
                System.out.println(a+b);
                break;
            case ("-"):
                System.out.println(a-b);
                break;
            case ("/"):
                System.out.println(a/b);
                break;
            case ("*"):
                System.out.println(a*b);
                break;
            default:
                System.out.println("Unknown arithmetic operation " + operation);
                break;
        }
    }
}
