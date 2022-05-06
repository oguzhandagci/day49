package PracticingLoops;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isItZero = false;
        while(!isItZero){
            System.out.println("Enter a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0){
                System.out.println("Number must be positive.");
            }else if (number > 0){
                System.out.println("Number is " + number);
            }else if (number == 0){
                isItZero = true;
            }
        }
    }
}
