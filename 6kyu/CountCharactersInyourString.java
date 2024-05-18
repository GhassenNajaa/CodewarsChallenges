/*The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
What if the string is empty? Then the result should be empty object literal, {}.*/
import java.util.*;
 class Kata {
  public static Map<Character, Integer> count(String str) {
HashMap <Character,Integer> res=new HashMap<>();
if (str==null || str.length()==0) return res;
for (int i=0;i<str.length();i++)
{
	if (!res.containsKey(str.charAt(i))) res.put(str.charAt(i),1);
	else res.put ( str.charAt(i) , res.get(str.	charAt(i))+1);
}
return res;
    }
}
