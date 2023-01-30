import  java.util.ArrayList;
// Question1. Create an ArrayList and search (if it is present or not )that element and tells the index. tell me if the elements is duplicate tell me the first and last occurrence of that element

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(4);

        int searchElement = 3;
        boolean isPresent = myList.contains(searchElement);
        if (isPresent) {
            int firstIndex = myList.indexOf(searchElement);
            int lastIndex = myList.lastIndexOf(searchElement);
            System.out.println("Element " + searchElement + " is present in the ArrayList.");
            System.out.println("First occurrence of element " + searchElement + " is at index " + firstIndex);
            System.out.println("Last occurrence of element " + searchElement + " is at index " + lastIndex);
        } else {
            System.out.println("Element " + searchElement + " is not present in the ArrayList.");
        }
    }
}
