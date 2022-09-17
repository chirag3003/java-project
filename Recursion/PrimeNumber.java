import java.io.*;

public class PrimeNumber {
    int var_num;

    PrimeNumber(int var_num) {
        this.var_num = var_num;
    }

    boolean isPrime(int n) {
        if (n == 1)
            return true;
        if (n == var_num) {
            return isPrime(--n);
        }
        if (var_num % n == 0) {
            return false;
        }
        return isPrime(--n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int var_num = Integer.parseInt(br.readLine()); // accept a number from the user
        PrimeNumber ob = new PrimeNumber(var_num); // find if the accepted number is a prime number or not
        System.out.println(ob.isPrime(var_num - 1) ? "It's a Prime Number." : "It is not a Prime Number");
    }
}
