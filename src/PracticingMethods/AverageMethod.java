package PracticingMethods;

import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter another number: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the last number: ");
        int number3 = Integer.parseInt(scanner.nextLine());
        System.out.println("The average is: " + average(number1, number2, number3));

    }

    public static double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static double average(double num1, double num2, double num3) {
        return sum(num1, num2, num3) / 3;
    }
}