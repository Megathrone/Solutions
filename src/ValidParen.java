import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParen {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()){
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop()!=c) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String a = "(){}[]";
        System.out.println((new ValidParen()).isValid(a));
    }
}
