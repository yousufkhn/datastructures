package Stack.Implimentation.LinkedlistImplementationOfArray;

import java.util.Scanner;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.next = null;
        this.data = data;
    }
}

class Stack {
    Node head;
    int size;

    public Stack() {
        head = null;
        size = 0;
    }

    public void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        size++;
        head = temp;
    }

    public int pop() {
        if (head == null) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            int data = head.data;
            head = head.next;
            size--;
            return data;
        }
    }

    public int peek() {
        if (head == null) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return head.data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public int size() {
        return size;
    }

}

public class LinkedListStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
    }

}
