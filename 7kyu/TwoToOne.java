/* Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible,
containing distinct letters - each taken only once - coming from s1 or s2.
Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" */
import java.util.*;
public class TwoToOne {
public static String longest (String s1, String s2) {
      ArrayList<Character> temp= new ArrayList<>();
for(int i=0;i<s1.length();i++){if (!temp.contains(s1.charAt(i))){temp.add(s1.charAt(i));}}
for(int j=0;j<s2.length();j++){
if (!temp.contains(s2.charAt(j))){temp.add(s2.charAt(j));}}
  Collections.sort(temp);
  String res="";
for(Character i : temp){res+=String.valueOf(i);}
return res;}
}
