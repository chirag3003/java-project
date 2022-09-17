public class Queue {
    int[] var_arr = new int[100];
    int var_rear = 0;
    int var_front = 0;
    int var_size;

    Queue(int var_size) {
        this.var_size = var_size;
    }

    void addEle(int var_num) {
        if (var_rear < var_size) {
            var_arr[++var_rear] = var_num;
            return;
        }
        System.out.println("Overflow");
    }

    int delEle() {
        if (var_rear == var_front) {
            System.out.println("Underflow");
            var_front = 0;
            var_rear = 0;
            return -9999;
        }
        return var_arr[++var_front];
    }

    void display() {
        if (var_front == var_rear) {
            System.out.println("Empty");
            return;
        }
        for (int i = var_front + 1; i <= var_rear; i++) {
            System.out.println(var_arr[i]);
        }
    }

}
