import java.util.Stack;

// Question6. Reverse a stack using recursion
public class Question6 {
    public static void revStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int x = stack.pop();
        revStack(stack);
        insertAtBottom(stack, x);
    }

    public static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int a = stack.pop();
        insertAtBottom(stack, x);
        stack.push(a);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack: " + stack);
        revStack(stack);
        System.out.println("Reverse Stack: " + stack);
    }
}
