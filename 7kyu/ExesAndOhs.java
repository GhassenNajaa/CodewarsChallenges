/*Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
Examples input/output:
XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/
public class XO {
  public static boolean getXO (String str) {
    String s=str.toLowerCase();
	int countx=0,counto=0;
	boolean res=true;
	for (int i=0;i<s.length();i++)
	{
		if (s.charAt(i)=='x') countx++;
		else if (s.charAt(i)=='o') counto++;
	}
	if (countx==counto) res=true;
	else res=false;
	return res;
  }
}
