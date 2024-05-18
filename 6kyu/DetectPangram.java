/*A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
*/
public class PangramChecker {
  public boolean check(String sentence){
        String [] alphabets= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
      	boolean res=true;
        int count=0;
      	String temp=sentence.toUpperCase();
      	for ( int i=0;i<alphabets.length;i++){if ( temp.contains(alphabets[i])) count++;}
      	if ( count == 26 ) return true ;
      	else return false;
        }
}
