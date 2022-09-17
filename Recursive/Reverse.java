public class Reverse {
    String reverse(String var_input, String var_reversed) {
        int var_len = var_input.length();
        int var_len2 = var_reversed.length();
        if (var_len == var_len2)
            return var_reversed;
        String reverse = var_reversed + var_input.charAt(var_len - 1 - var_len2);
        return reverse(var_input, reverse);
    }
}
