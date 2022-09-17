public class Stack {
    int[] var_arr = new int[100];
    int var_size;
    int var_front = 0;

    Stack(int var_size) {
        this.var_size = var_size;
    }

    void addEle(int var_n) {
        if (var_front < var_size) {
            var_arr[++var_front] = var_n;
            return;
        }

        System.out.println("Overflow");
    }

    int delEle() {
        if (var_front < 1) {
            System.out.println("Underflow");
            return -999;
        }
        return var_arr[var_front--];
    }

    void display() {
        if (var_front == 0) {
            System.out.println("Empty");
            return;
        }
        for (int i = var_front; i > 0; i--) {
            System.out.println(var_arr[i]);
        }
    }
}
