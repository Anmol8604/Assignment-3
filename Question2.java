import java.util.ArrayList;
// Question2. Copy elements from one arraylist to another
//Output would be
//Before copy : [One, Two, Three, Four, Five]
//After copy : [1, 2, 3, Four, Five]
public class Question2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add("Four");
        list1.add("Five");
        System.out.println("Before copy : " + list1);

        ArrayList<String> list2 = new ArrayList<>(list1);
        list2.set(0, "1");
        list2.set(1, "2");
        list2.set(2, "3");
        System.out.println("After copy : " + list2);
    }
}
