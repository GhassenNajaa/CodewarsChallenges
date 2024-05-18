/* In this kata you have to write a method that folds a given array of integers by the middle x-times.

An example says more than thousand words:

Fold 1-times:
[1,2,3,4,5] -> [6,6,3]

A little visualization (NOT for the algorithm but for the idea of folding):

 Step 1         Step 2        Step 3       Step 4       Step5
                     5/           5|         5\
                    4/            4|          4\
1 2 3 4 5      1 2 3/         1 2 3|       1 2 3\       6 6 3
----*----      ----*          ----*        ----*        ----*


Fold 2-times:
[1,2,3,4,5] -> [9,6] */
import java.util.*;
public class Kata
{
  public static int[] foldArray(int[] array, int runs){
            int arrayLength=array.length;
            int [] outputArray=Arrays.copyOf(array, arrayLength);
            for (int run=0;run<runs;run++){
            for (int arrayElement=0;arrayElement<countTo(arrayLength);arrayElement++){
                   outputArray[arrayElement]=outputArray[arrayElement]+outputArray[arrayLength-1-arrayElement];
                  }
                arrayLength=nextArrayLength(arrayLength);
                }
            return Arrays.copyOf(outputArray, arrayLength);
          }
  private static int countTo(int length){
    return length%2==0 ? length/2 : (length-1)/2;
    }
  private static int nextArrayLength(int length){
    return length%2==0 ? length/2 : (length+1)/2;
  }
}
