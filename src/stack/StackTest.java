package stack;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(8);

        System.out.println(stack.pop());//pop and delete element from stack
        System.out.println(stack);

        stack.peek();
        System.out.println(stack);//dont delete from stack


        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
