// Last updated: 8/10/2026, 10:34:24 PM
class Solution {
    public static void main(String[] args) {
        System.out.println("Input: s = \"III\"");
        System.out.println("Output: " + romanToInt("III")); // Output: 3

        System.out.println("Input: s = \"LVIII\"");
        System.out.println("Output: " + romanToInt("LVIII")); // Output: 58

        System.out.println("Input: s = \"MCMXCIV\"");
        System.out.println("Output: " + romanToInt("MCMXCIV")); // Output: 1994
    }

    static int romanToInt(String s) {
        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanCharToInt(s.charAt(i));

            // Check subtractive combination
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }

            prevValue = currentValue;
        }

        return sum;
    }

    static int romanCharToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0; // Invalid Roman numeral
        };
    }
}
