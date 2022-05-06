package PracticingMethods;
import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter another number: ");
        double number2 = Double.parseDouble(scanner.nextLine());

        System.out.println(number1 + " / " + number2 + " = " + divide(number1, number2));
    }
    public static double divide(double number1, double number2) {
        return number1 / number2;
    }
}
