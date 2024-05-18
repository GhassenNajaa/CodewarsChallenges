/* You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0] */
import java.util.ArrayList;
import java.util.Collections;
public class Kata {
public static int[] sortArray(int[] array) {
  ArrayList<Integer> list=new ArrayList<>();
  for(int i=0;i<array.length;i++){
    if(array[i]%2!=0) list.add(array[i]);}
  Collections.sort(list);
  int j=0,v=0;
  while(j<array.length||v<list.size()){
    if(array[j]%2!=0) {array[j]=list.get(v);j++;v++;}
    else j++;}
  return array;
  }
}
