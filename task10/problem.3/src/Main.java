import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        int mostRepeatedElement = findMostRepeatedElement(array);
        System.out.println("Most repeated element: " + mostRepeatedElement);
    }

    public static int findMostRepeatedElement(int[] array) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();


        for (int num : array) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        int mostRepeatedElement = 0;
        int maxOccurrences = 0;

        for (int num : occurrenceMap.keySet()) {
            int occurrences = occurrenceMap.get(num);
            if (occurrences > maxOccurrences) {
                mostRepeatedElement = num;
                maxOccurrences = occurrences;
            }
        }

        return mostRepeatedElement;
    }
}
//time complexity of this method is O(n)