import java.util.HashMap;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String userInput = input.next();

                HashMap<Character, Integer> freq = new HashMap<>();

                for (int i = 0; i < userInput.length(); i++) {
                    char c = userInput.charAt(i);
                    freq.put(c, freq.getOrDefault(c, 0) + 1);
                }

                for (char c : freq.keySet()) {
                    if (freq.get(c) == 1) {
                        System.out.println(c);
                    }
                }
            }
        }


