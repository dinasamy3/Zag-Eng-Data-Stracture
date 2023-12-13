import java.util.Stack;

public class Expresssion {
    public  boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (isOpenBracket(ch))
                stack.push(ch);
             if (isClosedBracket(ch)){
                 if (stack.isEmpty())
                     return false;
                char right = stack.pop();
                if (!isMatch(right,ch))
                    return false;
            }


        }
        return stack.isEmpty();
    }
private static boolean isMatch(char right,char left){
return (right=='('&&left==')')||
        ( right=='['&&left==']')||
        ( right=='{'&&left=='}')||
        (  right=='<'&&left=='>');
}

    private static boolean isOpenBracket(char ch) {
        return (ch=='('||ch=='['||ch=='<'||ch=='{');
    }

    private static boolean isClosedBracket(char ch) {
            return (ch==')'||ch==']'||ch=='>'||ch=='}');
    }
}
