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
        for (int var_i = var_front; var_i > 0; var_i--) {
            System.out.println(var_arr[var_i]);
        }
    }

    public static void main(String[] args) {
        Stack ob = new Stack(4);
        // Adding elements
        System.out.println("Adding Elements");
        ob.addEle(3);
        ob.addEle(4);
        ob.addEle(5);
        ob.addEle(6);
        // Adding extra element to show case of overflow
        ob.addEle(7);
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
