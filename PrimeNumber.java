import java.io.*;

public class PrimeNumber {
    int num;

    PrimeNumber(int num) {
        this.num = num;
    }

    boolean isPrime(int n) {
        if (n == 1)
            return true;
        if (n == num) {
            return isPrime(--n);
        }
        if (num % n == 0) {
            return false;
        }
        return isPrime(--n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        PrimeNumber ob = new PrimeNumber(num);
        System.out.println(ob.isPrime(num - 1));
    }
}
