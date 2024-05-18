/* Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.
This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!
All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace.
Examples
"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
class BraceChecker{
public boolean isValid(String braces) {
    Deque<Character> temp = new ArrayDeque<>();
    Map<Character, Character> myMap = new HashMap<>();
    myMap.put('(', ')');
    myMap.put('[', ']');
    myMap.put('{', '}');
    for (Character c : braces.toCharArray()) {
        if (c.equals('(') || c.equals('[') || c.equals('{')) {
            temp.push(c);
        } else if (!isValid2(myMap, temp, c)) {
            return false;
        } else {
            temp.pop();
        } }
        return temp.isEmpty();
    }
    protected static boolean isValid2(Map<Character, Character> myMap,Deque<Character> deque,Character character) {
        if (deque.isEmpty()) {
            return false;
        }
        Character openingCharacter = (Character) deque.peek();
        return myMap.get(openingCharacter) != null && myMap.get(openingCharacter).equals(character);}
      }
