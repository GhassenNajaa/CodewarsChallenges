/* You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
Examples
[2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number) */
public class FindOutlier {
  static int find(int[] integers) {
      int countEven=0,res=0;
  for(int i=0;i<integers.length;i++){
          if (integers[i]%2==0) countEven++;}
  if (countEven>1){
  for(int j=0;j<integers.length;j++)
  {if (integers[j]%2 !=0) res=integers[j];}}
  else{
  for(int j=0;j<integers.length;j++){
      if(integers[j]%2==0) res=integers[j];}}
  return res;
  }
}
