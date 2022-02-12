package GeneralProg;
import java.util.Scanner;

public class Calculator {
    String equation;
    int size;
    int b1, b2;

    Calculator(String a) {
        equation = a.trim();
        size = a.length();
    }

    boolean numberCheck() {
        for (int i = 0; i < size; i++) {
            if (Character.isLetter(equation.charAt(i))) {
                System.out.println("Error");
                return false;
            }
        }
        return true;
    }

    // checks if brackets are used correctly
    boolean paranCheck() {
        int p1 = 0, p2 = 0;
        for (int i = 0; i < size; i++) {
            if (equation.charAt(i) == '(') {
                p1++;
            } else if (equation.charAt(i) == ')') {
                p2++;
                if (p2 > p1) {
                    System.out.println("Error");
                    return false;
                }
            }
        }
        if (p1 != p2) {
            System.out.println("Error");
            return false;
        }
        b1 = p1;
        b2 = p2;
        return true;
    }

    void spaceCheck() {
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            if (equation.charAt(i) == ' ') {
                if (equation.charAt(i + 1) == ' ') {
                    equation = equation.substring(0, i) + equation.substring(i + 1, size);
                    i--;
                }
            }
        }
        size = equation.length();
    }

    void spacer() {
        int i;
        for (i = 1; i < size - 1; i++) {
            if (includes(equation.charAt(i))) {
                if (equation.charAt(i - 1) != ' ') {
                    equation = equation.substring(0, i) + ' ' + equation.substring(i, size);
                    size = equation.length();
                    i++;
                }
                if (equation.charAt(i + 1) != ' ') {
                    equation = equation.substring(0, i + 1) + ' ' + equation.substring(i + 1, size);
                    size = equation.length();
                }
            }
        }
    }

    // checks if the passed character is a operator
    boolean includes(char a) {
        char arr[] = { '+', '-', '*', '/' };
        for (int i = 0; i < 4; i++) {
            if (a == arr[i])
                return true;
        }
        return false;
    }

    // checks if operators are used correctly
    boolean operandCheck() {
        for (int i = 1; i < size; i++) {
            if (includes(equation.charAt(i))) {
                if (includes(equation.charAt(i - 1))) {
                    System.out.println("Error");
                    return false;
                }
            }
        }
        return true;
    }

    double calculate(String str) {
        str = str.trim();
        int s1, s2, s3;
        double n1, n2;
        char op;
        int strlen = str.length();
        s1 = str.indexOf(' ', 1);
        s2 = str.indexOf(' ', s1 + 1);
        s3 = str.indexOf(' ', s2 + 1);
        n1 = Double.parseDouble(str.substring(0, s1));
        op = str.charAt(s1 + 1);
        if (s3 > 0)
            n2 = Double.parseDouble(str.substring(s2 + 1, s3));
        else
            n2 = Double.parseDouble(str.substring(s2 + 1, strlen));
        double res = calculate2(n1, op, n2);
        if (s3 > 0) {
            str = Double.toString(res) + str.substring(s3, strlen);
            res = calculate(str);
        }
        return res;
    }

    void calculate() {
        int p1 = 0, p2 = 0;
        // finds the postiion of the brackets that can be executed first;
        while (b1 > 0) {
            for (int i = 0; i < size; i++) {
                if (equation.charAt(i) == '(') {
                    p1 = i;
                } else if (equation.charAt(i) == ')') {
                    p2 = i;
                    break;
                }
            }
            String str = equation.substring(p1 + 1, p2);
            str = str.trim();
            double res = calculate(str);
            equation = equation.substring(0, p1).trim() + " " + Double.toString(res) + " "
                    + equation.substring(p2 + 1).trim();
            size = equation.length();
            b1--;
            b2--;
        }
        double answer;
        if (equation.trim().indexOf(' ') >= 0)
            answer = calculate(equation.trim());
        else
            answer = Double.parseDouble(equation.trim());
        System.out.println(answer);
    }

    double calculate2(double n, char op, double n1) {
        double res;
        switch (op) {
            case '+':
                res = n + n1;
                break;
            case '-':
                res = n - n1;
                break;
            case '*':
                res = n * n1;
                break;
            case '/':
                res = n / n1;
                break;
            default:
                res = 0;
                System.out.println("operator error");
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the equation:");
        System.out.println("Note: To implement bodmas use brackets");
        String equation = sc.nextLine();
        Calculator ob = new Calculator(equation);
        if (ob.numberCheck()) {
            if (ob.paranCheck()) {
                if (ob.operandCheck()) {
                    ob.spaceCheck();
                    ob.spacer();
                    ob.calculate();
                }
            }
        }
    }

}
