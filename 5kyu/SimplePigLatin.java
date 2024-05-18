/* Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway ! */
import java.util.regex.Pattern;
import java.util.ArrayList;
public class PigLatin {
public static String pigIt(String str) {
String [] temp=str.split(" ");
ArrayList<String> res= new ArrayList<>();
for(int i=0;i<temp.length;i++){
if (Pattern.matches("\\p{IsPunctuation}",temp[i])){res.add(temp[i]);}
else {res.add(temp[i].substring(1,temp[i].length())+temp[i].charAt(0)+"ay");}}
String s="";
for(int i=0;i<res.size()-1;i++){
s+=res.get(i)+" ";
}
s=s+res.get(res.size()-1);
return s;}}
