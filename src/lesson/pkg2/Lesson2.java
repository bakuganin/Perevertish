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
        System.out.println("Перевертышь:" + rStr);
    }
    
}
