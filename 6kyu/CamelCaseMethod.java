/* Write a method (or function, depending on the language) that converts a string to camelCase, that is, all words must have their first letter capitalized and spaces must be removed.
Examples (input --> output):
"hello case" --> "HelloCase"
"camel case word" --> "CamelCaseWord" */
public class Solution {
  public static String camelCase(String str) {
      if(str.length()==0) return "";
      String camelcaseStr=str.trim();
      String [] temp=camelcaseStr.split("\\s+");
      int l = temp.length;
      String [] res = new String [l];
      int i=0;
      while (i<l)
      {
        res[i]=temp[i].substring(0,1).toUpperCase()+temp[i].substring(1);
        i++;
      }
      StringBuilder solution=new StringBuilder();
      for (int j=0;j<res.length;j++){
        solution.append(res[j]);
      }
      return solution.toString();
        }
}
