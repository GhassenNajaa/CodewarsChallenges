/* There is an array with some numbers. All numbers are equal except for one. Try to find it!
Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.*/
public class Kata {
public static double findUniq(double arr[]) {
  double res=0,temp=0;
  int i=1;
  if(arr[0]!=arr[1]&arr[0]!=arr[2]) return arr[0];
  else
  {temp=arr[0];
  while(i<arr.length&&res==0)
  {if (arr[i]!=temp) res=arr[i];i++;}
  return res;}}
}
