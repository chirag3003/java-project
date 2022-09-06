public class Stack {
    int[] arr = new int[100];
    int size;
    int front = 0;

    Stack(int size) {
        this.size = size;
    }

    void addEle(int n) {
        if (front < size) {
            arr[++front] = n;
            return;
        }

        System.out.println("Overflow");
    }

    int delEle() {
        if (front < 1) {
            System.out.println("Underflow");
            return -999;
        }
        return arr[front--];
    }

    void display() {
        if (front == 0) {
            System.out.println("Empty");
            return;
        }
        for (int i = front; i > 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
