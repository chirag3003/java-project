import java.util.Scanner;

public class Mix {
    String var_wrd = "";
    int var_len = 0;

    void feedword() {
        System.out.println("Enter a word");
        Scanner sc = new Scanner(System.in);
        var_wrd = sc.next().toUpperCase();
        var_len = var_wrd.length();
    }

    void display() {
        System.out.println(var_wrd);
    }

    void mix_word(Mix P, Mix Q) {
        String var_wrd1 = P.var_wrd;
        String var_wrd2 = Q.var_wrd;
        int minLen = Math.min(var_wrd1.length(), var_wrd2.length());
        for (int var_i = 0; var_i < minLen; var_i++) {
            var_wrd += var_wrd1.charAt(0) + "" + var_wrd2.charAt(0);
            var_wrd1 = var_wrd1.substring(1);
            var_wrd2 = var_wrd2.substring(1);
        }
        var_wrd += var_wrd1 + var_wrd2;
        var_len = var_wrd.length();

    }

    public static void main(String[] args) {
        Mix wrd1 = new Mix();
        Mix wrd2 = new Mix();
        wrd1.feedword();
        wrd2.feedword();
        Mix mixed = new Mix();
        mixed.mix_word(wrd1, wrd2);
        mixed.display();
    }
}
