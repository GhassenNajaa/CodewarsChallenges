/* Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.

Happy Coding! */
import java.util.HashMap;
public class SquareDigit {
  public int squareDigits(int n) {
      String temp=Integer.toString(n),myString="";
      int res=0,sum=0;
      HashMap<Integer,String> myMap= new HashMap<Integer,String>();
      for (int i=0;i<temp.length();i++){
            res=Character.getNumericValue(temp.charAt(i))*Character.getNumericValue(temp.charAt(i)); //81
            myMap.put(i,Integer.toString(res));
      }
      for (Integer i : myMap.keySet()){
            myString+=myMap.get(i);
      }
      sum=Integer.parseInt(myString);
      return sum;
  }

}
