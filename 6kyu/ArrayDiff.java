/*Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
It should remove all values from list a, which are present in list b keeping their order.
Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:
Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}*/
import java.util.*;
public class Kata {
public static int[] arrayDiff(int[] a, int[] b) {
  List<Integer> temp=new ArrayList<Integer>();
for(int i=0;i<a.length;i++){
    	temp.add(a[i]);}
for(int j=0;j<b.length;j++){
  if (temp.contains(b[j])){
  	temp.removeAll(Arrays.asList(b[j]));
  	}}
	int s=temp.size();
	int res[]=new int[s];
for (int k=0;k<s;k++){
    res[k]=temp.get(k);
}
return res;
}}
