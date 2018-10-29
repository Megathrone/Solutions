import java.util.*;
public class StackOne {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            System.out.print(stack.push(i));
        }
        System.out.println("Oh yeah");
        
    }
}