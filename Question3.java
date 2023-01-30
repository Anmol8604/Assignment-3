import java.util.ArrayList;

// Question3. Swap elements of Java ArrayList At the defined index
//Before swapping, ArrayList contains : [A, B, C, D, E]
//After swapping, ArrayList contains : [E, B, C, D, A]
public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        int index1 = 0;
        int index2 = list1.size()-1;
        System.out.println("Before swapping, ArrayList : " + list1);

        String temp = list1.get(index1);
        list1.set(index1, list1.get(index2));
        list1.set(index2, temp);

        System.out.println("After swapping, ArrayList : " + list1);
    }
}
