/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg2;
import java.util.Scanner;

/**
 *
 * @author Jegor Bakunin
 */
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Перевертышь");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:\n");
        String answer = input.nextLine();
        char[] chStr = answer.toCharArray();
        char[] rChStr = new char[answer.length()];
        for(int i = 0; i < rChStr.length; i++) {
            rChStr[i] = chStr[(chStr.length - 1) - i];
        } 
        String rStr = new String(rChStr);
        System.out.println("Перевертышь #1: " + rStr);
        StringBuilder sbStr = new StringBuilder(answer);
        System.out.println("Перевертышь #2: "+ sbStr.reverse().toString());
        int firstSpace = answer.indexOf(" ");
        int secondSpace = answer.indexOf(" ", firstSpace+1);
        if(firstSpace == -1){
            System.out.println("Второго слова нет. #1");
        }
        else if(secondSpace < 0){
            System.out.println("Второе слово #1:" + answer.substring(firstSpace));
        }
        else{
            System.out.println("Второе слово #1: " + answer.substring(firstSpace+1,secondSpace));
        }
        
        String[] words = answer.split(" ");
        if(words.length > 1 && words[1] != null){
            System.out.println("Второе слово #2: " + words[1]);
        } else {
            System.out.println("Второго слова нет #2");
        }
    }
    
}
