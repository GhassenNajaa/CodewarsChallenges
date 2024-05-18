/* Task:
Your job is to write a function, which takes three integers a, b, and c as arguments, and returns True if exactly two of the three integers are positive numbers (greater than zero), and False - otherwise.
Examples:
two_are_positive(2, 4, -3) == True
two_are_positive(-4, 6, 8) == True
two_are_positive(4, -6, 9) == True
two_are_positive(-4, 6, 0) == False
two_are_positive(4, 6, 10) == False
two_are_positive(-14, -3, -4) == False */
public class Kata {
  public static boolean twoArePositive(int a, int b, int c) {
    if ( a>0 && b>0 && c>0 ) return false;
    else if ( (a>0 && b>0)  || (a>0 && c>0) || (b>0 && c>0)) return true;
    else return false;
  }
}
