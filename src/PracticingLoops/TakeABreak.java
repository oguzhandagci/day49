package PracticingLoops;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isItYes = false;
        while (!isItYes) {
            System.out.println("Do you want to take a break?");
            String text1 = scanner.nextLine();
            if (text1.equals("yes")) {
                isItYes = true;
            } else {
                isItYes = false;
            }
        }
    }
}
