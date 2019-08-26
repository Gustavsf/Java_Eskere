
// Hangman game by Gustavs Freimanis
package java_loop;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_loop {


    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
       
        //User inputs a word
        System.out.println("Enter a word");
        String userInput = myObj.nextLine();
        
        //Create new list with letters(listOfLetters) and blanks(listLetterB)
        List<Character> listOfLetters  = new ArrayList<Character>();
        List<Character> listLetterB = new ArrayList<Character>();
        
        //Converts text to characters
        for (int i = 0; i < userInput.length(); i++) {            
            char lttr = userInput.charAt(i);
            
            listOfLetters.add(lttr);
        }
        
        //Prints blanks( - ) as long as word
        for (int i = 0; i < listOfLetters.size(); i++) {
            listLetterB.add('-');
            System.out.print("-");
        }        
        System.out.println("");
        
        int x = 0;
        int y = listOfLetters.size();
        int z = 0;
        
        //Loop asks user for guess and checks if its in the word
        for (int i = 0; i < 10; i++) {
            Scanner myObj2 = new Scanner(System.in);
            
            //User input guess
            System.out.println("Guess letter: ");
            char userGuess = myObj2.next().charAt(0);
            
            //Prints blanks and correctly guessed letters            
            if (listOfLetters.contains(userGuess)){
                System.out.println("Correct");
                System.out.println("");
                
                int indexBoi = listOfLetters.indexOf(userGuess);
                listOfLetters.set(indexBoi, '#');
                listLetterB.set(indexBoi, userGuess);
                
                x++;
            }
            
            else {
                System.out.println("Incorrect");
                System.out.println("");
                z++;
            }
            
            for (int j = 0; j < listLetterB.size(); j++) {
                System.out.print(listLetterB.get(j));
            }
            System.out.println("");
                     
            if (x == y) {
                System.out.println("Winner");
                break;
            }
            //User loses after 5 mistakes
            else if (z == 5){
                System.out.println("Loser");
                break;
            }           
        }       
    }
}
