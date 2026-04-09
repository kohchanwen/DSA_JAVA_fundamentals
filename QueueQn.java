package DSA_JAVA;

public class QueueQn {
    
        public static void main(String[] args) {
        MyQueue q = new MyQueue();
        
        System.out.println("Enqueue");
        q.enqueue(100);
        q.enqueue(200);
        System.out.println("Listing down first to last in queue");
        q.printFirstToLast();
    }

     // Singly LinkedList 
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            next = null;
        }

    }

    public static class MyQueue {
        ListNode left;  //Left is the front of queue
        ListNode right;

        MyQueue() {
            left = null;
            right = null;
        }

        // Add value to end of queue
        public void enqueue(int val) {
            ListNode newNode = new ListNode(val);
            if(right != null) {
                //Queue is not empty
                right.next = newNode;
                right = newNode;
            } else {
                //Queue is empty
                left = newNode;
                right = newNode;
            }
        }

        // Print all values in queue from first to last
        public void printFirstToLast() {
            ListNode curr = left;
            while(curr.next != null) {
                System.out.print(curr.val + ",");
                curr = curr.next;
            }
            System.out.println(curr.val);
        }
    }

}

