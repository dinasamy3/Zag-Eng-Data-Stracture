import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        Map<Character, Integer> occurrenceMap = new HashMap<>();


        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            occurrenceMap.put(c, occurrenceMap.getOrDefault(c, 0) + 1);
        }


        for (char c : occurrenceMap.keySet()) {
            int occurrence = occurrenceMap.get(c);
            System.out.println(c + ": " + occurrence);
        }
    }
}