/* Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
Examples:

Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
*/
import java.util.ArrayList;
import java.util.Collections;
public class DescendingOrder {
  public static int sortDesc(final int num) {
        ArrayList<String> numberList=new ArrayList<>();
        for(int i=0;i<String.valueOf(num).length();i++){
         numberList.add(i,String.valueOf(num).substring(i,i+1));}
    Collections.sort(numberList,Collections.reverseOrder());
    String res="";
    for(String j:numberList){
        res=res.concat(j);
    }
    return Integer.valueOf(res);
    }
}
