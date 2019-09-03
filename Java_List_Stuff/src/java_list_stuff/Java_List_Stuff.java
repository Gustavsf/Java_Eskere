package java_list_stuff;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List_Stuff {

    public static void main(String[] args) throws IOException {

        Scanner myObj = new Scanner(System.in);
        List<String> nameList = new ArrayList<String>();

        FileReader fullNameListFr = new FileReader("C:\\Users\\admin\\Desktop\\FullNameList.txt");
        FileWriter fullNameListFw = new FileWriter("C:\\Users\\admin\\Desktop\\FullNameList.txt", true);
        BufferedReader fullNameListBr = new BufferedReader(fullNameListFr);
        BufferedWriter fullNameListBw = new BufferedWriter(fullNameListFw);
        String st;
        while ((st = fullNameListBr.readLine()) != null) {
            nameList.add(st);
        }

        while (true) {
            System.out.println("");
            for (int j = 0; j < nameList.size(); j++) {
                System.out.println(nameList.get(j) + " " + j);
            }
            System.out.println("");
            System.out.println("Menu \n 1. Add name to list \n 2. Remove list element by index \n 3. Remove list element by name \n 4. Exit");
            int userAction = myObj.nextInt();

            if (userAction == 1) {
                addName(nameList, fullNameListBw);
            } else if (userAction == 2) {
                removeNameIndex(nameList, fullNameListBw);
            } else if (userAction == 3) {
                removeName(nameList, fullNameListBw);
            } else if (userAction == 4) {
                System.out.println("Bye Bye");
                fullNameListBw.close();
                fullNameListFw.close();
                fullNameListBr.close();
                fullNameListFr.close();
                break;
            }
        }
    }

    private static void addName(List nameList, BufferedWriter fullNameListBw) {
        Scanner mySc = new Scanner(System.in);

        System.out.println("Enter name and surname");
        String fullName = mySc.nextLine();
        nameList.add(fullName);
        try {
            fullNameListBw.write(fullName);
            fullNameListBw.newLine();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void removeNameIndex(List nameList, BufferedWriter fullNameListBw) throws FileNotFoundException {
        Scanner mySc = new Scanner(System.in);

        System.out.println("Enter user index to remove");
        int nameIndex = mySc.nextInt();
        nameList.remove(nameIndex);
        System.out.println(nameIndex + " Was removed");
        PrintWriter pw = new PrintWriter("C:\\Users\\admin\\Desktop\\FullNameList.txt");
        pw.close();

        try {
            for (int i = 0; i < nameList.size(); i++) {

                String ass = (String) nameList.get(i);
                fullNameListBw.write(ass);
                fullNameListBw.newLine();

            }
        }  catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void removeName(List nameList, BufferedWriter fullNameListBw) throws FileNotFoundException {
        Scanner mySc = new Scanner(System.in);

        System.out.println("Enter the full name of person to be removed");
        String userDead = mySc.nextLine();
        nameList.remove(userDead);
        System.out.println(userDead + " Was removed");

        PrintWriter pw = new PrintWriter("C:\\Users\\admin\\Desktop\\FullNameList.txt");
        pw.close();

        try {
            for (int i = 0; i < nameList.size(); i++) {

                String ass = (String) nameList.get(i);
                fullNameListBw.write(ass);
                fullNameListBw.newLine();

            }
        }  catch (Exception e) {
            System.out.println(e);
        }

    }
}
