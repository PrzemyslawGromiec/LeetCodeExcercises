package romanToInt;

public class Solution {

/*    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

            Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

    Given a roman numeral, convert it to an integer.

    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.*/

    public static int romanToInt(String s) {
        int currentResult = 0;
        int lastResult = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char letter = s.charAt(i);
            int valueOfRomanSign = romanCharToValue(letter);

            if (valueOfRomanSign < lastResult) {
                currentResult -= valueOfRomanSign;
            } else {
                currentResult += valueOfRomanSign;
            }

            lastResult = valueOfRomanSign;
        }

        return currentResult;
    }

    public static int romanCharToValue(char sign) {
        return switch (sign) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }


    public static void main(String[] args) {
        String s1 = "MCMXCIV";
        String s2 = "VIII";
        String s3 = "LIX";
        System.out.println("Decimal value of roman: " + s1 + " is: " + romanToInt(s1));
        System.out.println("Decimal value of roman: " + s2 + " is: " + romanToInt(s2));
        System.out.println("Decimal value of roman: " + s3 + " is: " + romanToInt(s3));
    }
}
