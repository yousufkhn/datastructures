package Stack.Implimentation.ArrayImplimentationOfStack;

import java.util.Scanner;

class Stack {
    int size;
    int top;
    int[] arr = new int[size];

    boolean isEmpty() {
        return top < 0;
    }

    Stack() {
        top = -1;

    }

    boolean push(Scanner input) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
            return false;
        } else {
            System.out.println("Enter value: ");
            int val = input.nextInt();
            top++;
            arr[top] = val;
            System.out.println("Item pushed");
            return true;
        }
    }

    boolean pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return false;
        } else {
            top--;
            System.out.println("Item popped!");
            return true;
        }
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println(arr[top]);
        }
    }
}

public class ArrayStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        Stack s = new Stack();
        System.out.println("*********Stack operations using array*********\n");
        System.out.println("\n------------------------------------------------\n");

        while (choice != 4) {
            System.out.println("Choose any one option from below");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Peek\n5.Exit");
            System.out.println("\n Enter your choice \n");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    s.push(input);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;
                case 4:
                    s.peek();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}