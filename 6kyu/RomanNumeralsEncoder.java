/*Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string containing the Roman Numeral representation of that integer.
Modern Roman numerals are written by expressing each digit separately starting with the leftmost digit and skipping any digit with a value of zero. There cannot be more than 3 identical symbols in a row.
In Roman numerals:
    1990 is rendered: 1000=M + 900=CM + 90=XC; resulting in MCMXC.
    2008 is written as 2000=MM, 8=VIII; or MMVIII.
    1666 uses each Roman symbol in descending order: MDCLXVI.
Example:
   1 -->       "I"
1000 -->       "M"
1666 --> "MDCLXVI"
Help:
Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
*/
public class Conversion {
   private int[] values = { 1000, 900, 800, 500, 400, 100, 90, 80, 50, 40, 10, 9, 8, 5, 4, 1 };
    private String[] symbols = { "M", "CM", "DCCC", "D", "CD", "C", "XC", "LXXX", "L", "XL", "X", "IX", "VIII", "V", "IV", "I" };
    public String solution(int n) {
      final StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            final int value = values[i];
            while (n >= value) {
                n -= value;
                result.append(symbols[i]);
            }
        }
        return result.toString();
    }
}
