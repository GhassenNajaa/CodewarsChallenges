/* Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
Examples:
* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
*/
public class StringSplit {
    public static String[] solution(String s) {
      if ( s.length() % 2 != 0) s=s+ "_";
    int myString=s.length();
	String [] res=new String [myString/2];
int i=0,start=0,end=2;
while ( i < res.length && end <= myString )
{
	res[i]=s.substring(start,end);
	i++;
	start=start+2;
	end=end+2;
   }
return res;
    }
}
