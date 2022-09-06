public class Queue {
    int[] arr = new int[100];
    int rear = 0;
    int front = 0;
    int size;

    Queue(int size) {
        this.size = size;
    }

    void addEle(int num) {
        if (rear < size) {
            arr[++rear] = num;
            return;
        }
        System.out.println("Overflow");
    }

    int delEle() {
        if (rear == front) {
            System.out.println("Underflow");
            front = 0;
            rear = 0;
            return -9999;
        }
        return arr[++front];
    }

    void display() {
        if (front == rear) {
            System.out.println("Empty");
            return;
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

}
