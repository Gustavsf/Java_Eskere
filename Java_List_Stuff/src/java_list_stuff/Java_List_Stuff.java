package java_list_stuff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List_Stuff {

    public static void main(String[] args) throws IOException {

        Scanner myObj = new Scanner(System.in);
        List<String> nameList = new ArrayList<String>();

        FileReader fullNameListFr = new FileReader("C:\\Users\\admin\\Desktop\\FullNameList.txt");
        BufferedReader fullNameListBr = new BufferedReader(fullNameListFr);
        String st;
        while ((st = fullNameListBr.readLine()) != null) {
            nameList.add(st);
        }
        fullNameListBr.close();
        fullNameListFr.close();

        while (true) {
            System.out.println("");
            for (int j = 0; j < nameList.size(); j++) {
                System.out.println(nameList.get(j) + " " + j);
            }
            System.out.println("");
            System.out.println("Menu \n 1. Add name to list \n 2. Remove list element by index \n 3. Remove list element by name \n 4. Exit");
            int userAction = myObj.nextInt();

            if (userAction == 1) {
                addName(nameList);
            } else if (userAction == 2) {
                removeNameIndex(nameList);
            } else if (userAction == 3) {
                removeName(nameList);
            } else if (userAction == 4) {
                System.out.println("Bye Bye");
                break;
            }
        }

    }

    private static void addName(List nameList) {
        Scanner mySc = new Scanner(System.in);

        System.out.println("Enter name and surname");
        String fullName = mySc.nextLine();
        nameList.add(fullName);
    }

    private static void removeNameIndex(List nameList) {
        Scanner mySc = new Scanner(System.in);

        System.out.println("Enter user index to remove");
        int nameIndex = mySc.nextInt();
        nameList.remove(nameIndex);
        System.out.println(nameIndex + " Was removed");
    }

    private static void removeName(List nameList) {
        Scanner mySc = new Scanner(System.in);
        
        System.out.println("Enter the full name of person to be removed");
        String userDead = mySc.nextLine();
        nameList.remove(userDead);
        System.out.println(userDead + " Was removed");
    }
}
