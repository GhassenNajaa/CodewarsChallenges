 /*In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
 Kata.makeNegative(1);  // return -1
 Kata.makeNegative(-5); // return -5
 Kata.makeNegative(0);  // return 0 */
 int makeNegative(int num){
   if(num>0) return -num;
   else return num;
 }
