package java18_arrays;

public class Pangramchecker {
    public static boolean isPangram(String input) {
        boolean[] present = new boolean[26];
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                present[c - 'a'] = true;
            }
        }

        for (boolean letterPresent : present) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A pangram is a sentence that contains all the\r\n alphabets from A to Z";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

