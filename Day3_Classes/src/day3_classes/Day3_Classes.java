package day3_classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Day3_Classes {

    public static void main(String[] args)throws Exception {
        MathE mathe = new MathE();
        Scanner myObj = new Scanner(System.in);
        double result = 1;

        FileReader fullNameListFr = new FileReader("C:\\Users\\admin\\Desktop\\FullNameList.txt");
        BufferedReader fullNameListRd = new BufferedReader(fullNameListFr);
           int i;    
          while((i=fullNameListRd.read())!=-1){  
          System.out.print((char)i);  
          }  
          fullNameListRd.close();    
          fullNameListFr.close();  

        while (true) {
            System.out.println("");
            //User chooses action
            System.out.println("What action to do? \n 1. Plus \n 2. Minus "
                    + "\n 3. Times \n 4. Divide \n 5. Exit");
            int userAction = myObj.nextInt();
            if (userAction == 5) {
                System.out.println("Bye Bye");
                break;
            }

            //User inputs numbers
            System.out.println("Enter first num");
            double numOne = myObj.nextDouble();

            System.out.println("Enter second num");
            double numTwo = myObj.nextDouble();

            //Calcalator logic
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
