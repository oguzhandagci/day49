package PracticingLoops;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isItLessThanEleven = false;
        while (!isItLessThanEleven) {
            System.out.println("Enter a number less than 11");
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 12) {
                for (int i = number; i < 12; i++) {
                    System.out.println(i);
                    if (i == 11) {
                        isItLessThanEleven = true;
                    }
                }
            } else {
                isItLessThanEleven = false;
            }
        }
    }
}