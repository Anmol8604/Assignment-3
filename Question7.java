import java.util.Stack;

// Question7. Design a stack that returns the minimum element
public class Question7 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (minStack.empty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Question7 minStack = new Question7();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);
        System.out.println(minStack.getMin()); // 1
        minStack.pop();
        System.out.println(minStack.getMin()); // 2
    }
}
