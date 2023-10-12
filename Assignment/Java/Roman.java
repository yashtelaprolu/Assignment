package java18_arrays;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
       
        int result = romanNumbers.get(s.charAt(s.length() - 1)); 
        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanNumbers.get(s.charAt(i)) < romanNumbers.get(s.charAt(i + 1))) {
                result -= romanNumbers.get(s.charAt(i));
            } else {
                result += romanNumbers.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; 
        int result = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
    }
}

