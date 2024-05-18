/* Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
*/
import java.util.*;
public class Order {
  public static String order(String words) {
   String res="";
if (words == null || words.length()==0) return res;
String [] temp = words.split("\\s+");
HashMap <String,String> numberOrder = new HashMap<>();
String [] numbers={"1","2","3","4","5","6","7","8","9"};
for (int i=0;i<temp.length;i++)
 {
	for (int j=0;j<numbers.length;j++)
	{
		if (temp[i].contains(numbers[j])) numberOrder.put(temp[i],numbers[j]);

	}}
HashMap<String,Integer> myList=new HashMap<String,Integer>();
for (String i : numberOrder.keySet())
 {myList.put( i,Integer.parseInt(numberOrder.get(i)));}
List<Map.Entry<String,Integer>> list=new LinkedList<Map.Entry<String,Integer>>(myList.entrySet());
Collections.sort(list,new Comparator<Map.Entry<String,Integer>>()
{
	public int compare(Map.Entry<String,Integer>o1,Map.Entry<String,Integer>o2)
	{
		return (o1.getValue()).compareTo(o2.getValue());
	}});
  HashMap <String,Integer> anotherTemp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            anotherTemp.put(aa.getKey(), aa.getValue());
        }

	for (String i:anotherTemp.keySet())
	{
		res+= i+" ";
	}
  String myres=res.trim();
	return myres;
  }
}
