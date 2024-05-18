/*The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
*/
import java.util.*;
public class DuplicateEncoder {
	static String encode(String word){
    String myString="";
	String res=word.toLowerCase();
      Map<Character,String> map=new HashMap<>();
	  if ( res==null || res.length()==0) return "";
	  for (char c : res.toCharArray()){
	if (map.containsKey(c)) {
		String counter=map.get(c);
	    map.put(c,counter+"1");
	 }
	 else {
		  map.put(c,"1");
	}
	  }
for (Character i: map.keySet()){
	if (map.get(i).length()>1) map.replace(i,")");
	else map.replace(i,"(");
}

for (int i=0;i<res.length();i++){
	for (Character k : map.keySet()){
	   if (res.charAt(i)==k){
	    myString= myString + map.get(k);}
  }
}
return myString;
  }
}
