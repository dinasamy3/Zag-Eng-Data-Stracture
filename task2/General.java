/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.Random;

/**
 *
 * @author Dina Samy
 */
public class General {
    public static  int reverseInteger(int num) {

        int reverse = 0;
        while (num != 0) {

            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        return reverse;
    }
    
    public static  int getRandom(int x ){

          return (int)(Math.random()*x);
    }
    
    public static int getRandom(int min, int max){

      return (int)(min+((max-min)*Math.random()));
     }
    
    public static  char randomCharacter(){

            Random  random = new Random();
              return (char) (random.nextInt(26) + 'A');
    }
    
    public static  <T> void printArray(T[] arr){
              for (T element : arr) {
                  System.out.print(element + " ");
              }
              System.out.println();
    }
}
