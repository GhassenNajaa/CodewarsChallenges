/* Complete the solution so that the function will break up camel casing, using a space between words.
Examples
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""*/
class Solution {
public static String camelCase(String input) {
  if(input==null||input.length()==0) return input;
  else if(input.equals(input.toLowerCase())) return input;
  else {
    String res="";
    String [] str=input.split("(?=\\p{Upper})");
  for(int i=0;i<str.length-1;i++){
    res+=str[i]+" ";}
    return res+str[str.length-1];}
  }
}
