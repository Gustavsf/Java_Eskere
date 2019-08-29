
//Java homework 1 by Gustavs Freimanis
package java_hmwrk_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java_Hmwrk_1 {

    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        List<Integer> listNumbers = new ArrayList<Integer>();
        
        //User inputs 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1));
            int num = myObj.nextInt();
            listNumbers.add(num);
        }
        
        //Checks largest number, prints it out
        int maxNum = Collections.max(listNumbers);
        System.out.println("Largest number is: " + maxNum);
    }
}
