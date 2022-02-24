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
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine()); // accept a number from the user
        PrimeNumber ob = new PrimeNumber(num); // find if the accepted number is a prime number or not
        System.out.println(ob.isPrime(num - 1) ? "It's a Prime Number." : "It is not a Prime Number");
    }
}
