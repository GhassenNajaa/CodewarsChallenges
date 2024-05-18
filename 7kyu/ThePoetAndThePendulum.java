/* Scenario

the rhythm of beautiful musical notes is drawing a Pendulum

Beautiful musical notes are the Numbers

Task

Given an array/list [] of n integers , Arrange them in a way similar to the to-and-fro movement of a Pendulum

    The Smallest element of the list of integers , must come in center position of array/list.
        The Higher than smallest , goes to the right .

    The Next higher number goes to the left of minimum number and So on , in a to-and-fro manner similar to that of a Pendulum.
*/
import java.util.*;
public class Poet {
    public static int[] pendulum(final int[] values) {
          Deque<Integer> res = new ArrayDeque<>();
          List<Integer> input = new ArrayList<>();
          for (Integer valuesInput : values){
            input.add(valuesInput);
          }
          Collections.sort(input);
          for (int i=0;i<input.size();i++){
          if (i==0){
              res.addFirst(input.get(i));
          }
          else if (i==1){
              res.addLast(input.get(i));
          }
          else if (i%2==0){
             res.addFirst(input.get(i));
          }
          else if (!(i%2==0)){
             res.addLast(input.get(i));
          }}
          return res.stream().mapToInt(i -> i).toArray();
    }
}
