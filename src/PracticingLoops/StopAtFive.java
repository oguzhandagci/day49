package PracticingLoops;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isItFive = false;
        while (!isItFive) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 5) {
                isItFive = true;
            } else {
                isItFive = false;
            }
        }
    }
}
