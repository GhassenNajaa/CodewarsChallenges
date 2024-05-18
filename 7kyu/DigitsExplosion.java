/* Given a string made of digits [0-9], return a string where each digit is repeated a number of times equals to its value.
Examples
"312" should return "333122"
"102269" should return "12222666666999999999"
*/
import java.util.*;
public class Solution {
  public static String explode(String digits) {
      List<Integer> res= new ArrayList<>();
      String [] str=digits.split("");
      int [] temp = new int[str.length];
      for (int i=0;i<str.length;i++){
            temp[i]=Integer.parseInt(str[i]);
       }
      for (int i=0;i<temp.length;i++){
      for (int count=0;count<temp[i];count++)
       {res.add(temp[i]);}
      }
      int [] finalRes=new int[res.size()];
      for (int i=0;i<res.size();i++)
      {finalRes[i]=res.get(i);}
      StringBuilder solution=new StringBuilder();
      for (int j=0;j<finalRes.length;j++){
      solution.append(finalRes[j]);
      }
      return solution.toString();
       }
}
