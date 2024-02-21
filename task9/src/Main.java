import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        int [] freq = new int [26];
        for (int i =0; i < userInput.length(); i++)
            freq[hash(userInput.charAt(i))]++;
        for (int i =0; i < freq.length; i++)
            if (freq[i] ==1)
        System.out.println((char) (i+97) );


        }
        public static int hash(int c){
        return c-'a';
        }
    }
