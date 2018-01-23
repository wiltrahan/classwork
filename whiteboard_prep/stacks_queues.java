/*
STACKS AND QUEUES
Both Linear data structures in that you have one element, then another, then another.
They are both flexible with sizes..can add or delete elements as you go.
Stack memory allocation is done when your program is compiled.
Stacks are LIFO. Last In First Out.
Queues are FIFO. First In First Out.
*/

public static class Queue {

    private static class Node {

      private int data;
      private Node next;

      private Node(int data) {
          this.data = data;
      }
    }

    private Node head; //remove from here
    private Node tail; //add things here

    public boolean isEmpty() {
        return head == null;
    }
    public int peek() {
        return head.data;
    }
    public void add(int data) {
        Node node = new Node(data);
        if(tail != null) {
            tail.next = node;
        }
        tail = node;
        if(head == null) {
            head = null;
        }
    }
    public int remove() {
        int data = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return data;
    }
}

public class Stack {

    private static class Node {

        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }
}
