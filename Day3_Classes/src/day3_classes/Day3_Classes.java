package day3_classes;

import java.util.Scanner;

public class Day3_Classes {

    public static void main(String[] args) {
        MathE mathe = new MathE();
        Scanner myObj = new Scanner(System.in);
        double result = 1;

        while (true) {

            System.out.println("What action to do? \n 1. Plus \n 2. Minus "
                    + "\n 3. Times \n 4. Divide \n 5. Exit");
            int userAction = myObj.nextInt();
            if (userAction == 5) {
                System.out.println("Bye Bye");
                break;
            }

            System.out.println("Enter first num");
            double numOne = myObj.nextDouble();

            System.out.println("Enter second num");
            double numTwo = myObj.nextDouble();

            if (userAction == 1) {
                result = mathe.plusE(numOne, numTwo);
            } else if (userAction == 2) {
                result = mathe.minusE(numOne, numTwo);
            } else if (userAction == 3) {
                result = mathe.timesE(numOne, numTwo);
            } else if (userAction == 4) {
                result = mathe.divideE(numOne, numTwo);
            } else {
                System.out.println("Please select a valid option");
            }
            System.out.println("result is: " + result);

        }
    }

}
