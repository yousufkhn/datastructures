class MyQueue {
    int arr[];
    int size;
    int rear = -1;
    int front = -1;

    MyQueue(int size) {
        arr = new int[size];
        this.size = size;
    }

    boolean isEmpty() {
        return rear == front;
    }

    boolean isFull() {
        return size - 1 == rear;
    }

    void add(int num) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            rear++;
            arr[rear] = num;
        }
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            // int front = arr[0];
            // for (int i = 0; i < rear; i++) {
            // arr[i] = arr[i + 1];
            // }
            // rear--;
            // return front;
            front++;
            return arr[front];
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

}

public class Test {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }

}