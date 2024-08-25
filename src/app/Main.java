package app;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть ціле число: ");
            int number = scanner.nextInt();
            printSquare(number);

            System.out.print("Введіть радіус циліндра: ");
            double radius = scanner.nextDouble();
            System.out.print("Введіть висоту циліндра: ");
            double height = scanner.nextDouble();
            double volume = calculateCylinderVolume(radius, height);
            System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume);

            int[] array = {10, 20, 30, 40, 50};
            System.out.println("Масив чисел: " + java.util.Arrays.toString(array));
            int sum = calculateArraySum(array);
            System.out.println("Сума всіх елементів масиву дорівнює " + sum);

            scanner.nextLine();
            System.out.print("Введіть рядок: ");
            String text = scanner.nextLine();
            String reversed = reverseString(text);
            System.out.println("Рядок в зворотньому порядку: " + reversed);

            System.out.print("Введіть a: ");
            int a = scanner.nextInt();
            System.out.print("Введіть b: ");
            int b = scanner.nextInt();
            int powerResult = power(a, b);
            System.out.println("Результат " + a + "^" + b + " дорівнює " + powerResult);

            System.out.print("Введіть ціле число n: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введіть текстовий рядок: ");
            String textToPrint = scanner.nextLine();
            printTextMultipleTimes(n, textToPrint);
        }

        public static void printSquare(int number) {
            int square = number * number;
            System.out.println("Квадрат числа " + number + " дорівнює " + square);
        }

        public static double calculateCylinderVolume(double radius, double height) {
            return Math.PI * Math.pow(radius, 2) * height;
        }

        public static int calculateArraySum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }

        public static String reverseString(String text) {
            StringBuilder reversed = new StringBuilder(text);
            return reversed.reverse().toString();
        }

        public static int power(int a, int b) {
            return (int) Math.pow(a, b);
        }

        public static void printTextMultipleTimes(int n, String text) {
            for (int i = 0; i < n; i++) {
                System.out.println(text);
            }
        }
    }



