package DSA_JAVA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionPractice {
    public static void main(String args[]) {
        /**** List implementation ****/
        // arrayListPractice();
        linkedListPractice();

        /**** Set implementation ****/
        // HashSet
        // LinkedHashSet
        // TreeSet

        /**** QUEUE DEQUE implementation ****/
        // PriorityQueue
        // ArrayDeque
        // LinkedList
    }

    private static void arrayListPractice() {
        List<String> al = new ArrayList<>();
        List<String> al2 = new ArrayList<>(List.of("a","b","c"));
        al.add("my"); // O(1) Amortized
        al.add("code"); // O(1) Amortized
        System.out.println("Original List: " + al);
        System.out.println("List with starting initialization: " + al2);
        al.add(1, "Java"); // O(N)
        System.out.println("List after adding at index 1 " + al);
        al.remove(0); // O(N)
        System.out.println("List after removing at index 0 " + al);
        al.remove("code");
        System.out.println("List after removing code " + al);
        al.set(0, "Java Spring"); // O(1)
        System.out.println("List after setting at index 0 " + al);
        al.add("AOP");
        al.add("Hibernate");
        System.out.println("New List: " + al);
        al.removeIf(s -> s.equalsIgnoreCase("aop")); // Optimal way to remove O(N), internally shift once
        System.out.println("List after removing with predicate: " + al);
        String s1 = al.get(0); // O(1)
        System.out.println("String at index 0: " + s1);
    }

    private static void linkedListPractice() {
        LinkedList<String> ll = new LinkedList<>();
        LinkedList<String> ll2 = new LinkedList<>(List.of("a","b","c"));
        ll.add("my");  // O(1)
        ll.add("code"); 
        System.out.println("Original List: " + ll);
        System.out.println("List with starting initialization: " + ll2);
        ll.add(1, "Java"); // O(N)
        System.out.println("List after adding at index 1 " + ll);
        ll.remove(0); // O(N) due to search traversal
        System.out.println("List after removing at index 0 " + ll);
        ll.remove("code"); // O(N) due to search traversal
        System.out.println("List after removing code " + ll);
        ll.set(0, "Java Spring"); // O(N) due to traversal to the index
        System.out.println("List after setting at index 0 " + ll);
        String firstElm = ll.peek();
        System.out.println("Peeking first element " + firstElm);
        System.out.println("Size of linkedlist " + ll.size());
    }
}