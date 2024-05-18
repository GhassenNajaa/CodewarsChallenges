/*Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
Examples:
"Hey fellow warriors"  --> "Hey wollef sroirraw"
"This is a test        --> "This is a test"
"This is another test" --> "This is rehtona test"
*/
import java.util.*;
public class SpinWords {
 public static String spinWords(String sentence)
   {
String out = null;
        String[] array = sentence.split(" ");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = array[i].length() >= 5 ? array[i] = new StringBuffer(array[i]).reverse().toString() : array[i];
        }
        out = Arrays.toString(array);
        return out = out.substring(1, out.length() - 1).replaceAll(",", "");
 }
   }
