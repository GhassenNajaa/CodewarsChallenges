/* Your task is to write a function toLeetSpeak that converts a regular english sentence to Leetspeak.
More about LeetSpeak You can read at wiki -> https://en.wikipedia.org/wiki/Leet
Consider only uppercase letters (no lowercase letters, no numbers) and spaces.
For example:
toLeetSpeak("LEET") returns "1337"
In this kata we use a simple LeetSpeak dialect. Use this alphabet:
{
  A : '@',
  B : '8',
  C : '(',
  D : 'D',
  E : '3',
  F : 'F',
  G : '6',
  H : '#',
  I : '!',
  J : 'J',
  K : 'K',
  L : '1',
  M : 'M',
  N : 'N',
  O : '0',
  P : 'P',
  Q : 'Q',
  R : 'R',
  S : '$',
  T : '7',
  U : 'U',
  V : 'V',
  W : 'W',
  X : 'X',
  Y : 'Y',
  Z : '2'
} */
class Kata {
    static String toLeetSpeak(final String speak) {
        String res=speak.toUpperCase();
        char [] temp= new char[res.length()];
        for (int i=0;i<res.length();i++)
        {
           temp[i]=res.charAt(i);}
    for (int i=0;i<temp.length;i++)
    {
      switch (temp[i])
    {
    case 'A':
    temp[i]='@';
    break;
    case'B':
    temp[i]='8';
    break;
    case 'C':
    temp[i]='(';
    break;
    case 'D':
    temp[i]='D';
    break;
    case 'E':
    temp[i]='3';
    break;
     case 'F':
    temp[i]='F';
    break;
     case 'G':
    temp[i]='6';
    break;
     case 'H':
    temp[i]='#';
    break;
     case 'I':
    temp[i]='!';
    break;
     case 'J':
    temp[i]='J';
    break;
     case 'K':
    temp[i]='K';
    break;
     case 'L':
    temp[i]='1';
    break;
     case 'M':
    temp[i]='M';
    break;
     case 'N':
    temp[i]='N';
    break;
     case 'O':
    temp[i]='0';
    break;
     case 'P':
    temp[i]='P';
    break;
     case 'Q':
    temp[i]='Q';
    break;
     case 'R':
    temp[i]='R';
    break;
     case 'S':
    temp[i]='$';
    break;
     case 'T':
    temp[i]='7';
    break;
     case 'U':
    temp[i]='U';
    break;
     case 'V':
    temp[i]='V';
    break;
    case 'W':
    temp[i]='W';
    break;
     case 'X':
    temp[i]='X';
    break;
     case 'Y':
    temp[i]='Y';
    break;
     case 'Z':
    temp[i]='2';
    break;
   }}
   String myString = new String(temp);
   return myString;
     }
}
