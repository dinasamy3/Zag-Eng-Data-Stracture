/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.Scanner;

/**
 *
 * @author Dina Samy
 */
public class Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int reversedNum = General.reverseInteger(num);
        System.out.println("ReversedNumber:" + reversedNum);
        
        int randomValueUpTo10 = General.getRandom(10);
        System.out.println("Random Value Up To 10:" + randomValueUpTo10);
        
        int randomValueRange5to10 = General.getRandom(5,10);
        System.out.println("Random Value Range 5 to 10:" + randomValueRange5to10);
        
        char randomchar = General.randomCharacter();
        System.out.println("Random Character:" + randomchar);
        
        Integer[] intArray = {1, 2, 3};
        General.printArray(intArray);
    }
    
}
