public class Queue {
    int[] var_arr = new int[100];
    int var_rear = 0;
    int var_front = 0;
    int var_size;

    Queue(int var_size) {
        this.var_size = var_size;
    }

    void addEle(int var_num) {
        // checking if its possible to add elements
        if (var_rear < var_size) {
            var_arr[++var_rear] = var_num;
            return;
        }
        System.out.println("Overflow");
    }

    int delEle() {
        // checking if its possible to delete elements
        if (var_rear == var_front) {
            System.out.println("Underflow");
            var_front = 0;
            var_rear = 0;
            return -9999;
        }
        return var_arr[++var_front];
    }

    void display() {
        // checking if the queue is empty
        if (var_front == var_rear) {
            System.out.println("Empty");
            return;
        }
        for (int i = var_front + 1; i <= var_rear; i++) {
            System.out.println(var_arr[i]);
        }
    }

    public static void main(String[] args) {
        Queue ob = new Queue(4);
        // Adding elements
        System.out.println("Adding Elements");
        ob.addEle(3);
        ob.addEle(3);
        ob.addEle(3);
        ob.addEle(3);
        // Adding extra element to show case of overflow
        ob.addEle(3);
        // Displaying elements after adding elements
        System.out.println("Elements: ");
        ob.display();
        // Removing elements
        System.out.println("Removing Elements");
        ob.delEle();
        ob.delEle();
        // Displaying elements after removing
        System.out.println("Elements after removing 2 elements: ");
        ob.display();
        System.out.println("Removing the rest of the elements");
        ob.delEle();
        ob.delEle();
        // Removing extra element to show case of underflow
        ob.delEle();
        // displaying empty queue
        ob.display();

    }

}
