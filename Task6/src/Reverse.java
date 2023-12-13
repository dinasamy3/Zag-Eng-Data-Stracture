import java.util.Stack;

public class Reverse {
    public  String Reverse(String s) {
        Stack<Character> stack = new Stack<>();
        String reverse = "";
        for (int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));
        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }

        return reverse;

    }

}
