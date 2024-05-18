/*Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case*/
public class BitCounting {
public static int countBits(int n){
String temp=Integer.toBinaryString(n);
int occ=0;
for(int i=0;i<temp.length();i++){
char ch=temp.charAt(i);
if(ch=='1'){occ++;}}
return occ;}
}
