import java.io.*;

class Fibonacci {
    void generate(int len, int n, int prev, int current) {
        if (n == 1 || n == 2) {
            if (n == 1)
                System.out.print("0 ");
            else if (n == 2)
                System.out.print("1 ");
            if (n < len) {
                generate(len, ++n, 0, 1);
            }
        } else {
            System.out.print(prev + current + " ");
            if (n < len) {
                generate(len, ++n, current, prev + current);
            }
        }
    }

    public static void main(String[] args) {
        Fibonacci ob = new Fibonacci();
        ob.generate(10, 1, 0, 1);
        System.out.println();
    }
}
