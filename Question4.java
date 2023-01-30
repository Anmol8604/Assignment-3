import java.util.Stack;

// Question4. Check if given Parentheses expression is balanced or not
//Input: str = “((()))()()”
//Output: Balanced
//Input: str = “())((())”
//Output: Not Balanced
public class Question4 {
    public static void main(String[] args) {
        String str = "())()()";

        System.out.println(balancedOrNot(str));
    }

    static  String balancedOrNot(String str) {
        Stack s = new Stack();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(') {
                s.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')') {
                if (s.empty()) {
                    return "Not Balanced";
                } else s.pop();
            }
        }
        return "Balanced";
    }
}
