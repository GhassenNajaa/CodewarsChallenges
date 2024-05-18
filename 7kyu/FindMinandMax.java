//Implement a function that returns the minimal and the maximal value of a list (in this order).
import java.util.List;
class MinMax {
  static int[] getMinMax(List<Integer> list) {
    int [] res = new int[2];
        int min=list.get(0),max=list.get(0);
        for (int i=1;i<list.size();i++){
        if (list.get(i)<min) min=list.get(i);
         if(list.get(i)>max) max=list.get(i);
    }
   res[0]=min;
   res[1]=max;
return res;
  }
}
