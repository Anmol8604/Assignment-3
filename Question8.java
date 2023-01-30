import java.util.Stack;

// Question8. Implement a Stack using queue Data Structure
public class Question8 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public Question8() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

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

    public static void main(String[] args){
        Question8 minStack = new Question8();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);
        System.out.println(minStack.getMin()); // 1
        minStack.pop();
        System.out.println(minStack.getMin()); // 2
    }
}