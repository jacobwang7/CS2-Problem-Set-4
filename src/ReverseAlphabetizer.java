import java.util.Scanner;

public class ReverseAlphabetizer {

  public static void main (String[] args) {

    // We will use the Scanner class (yay!) to read
    // input from the user while running the class.

    System.out.println("Enter a string to split into words and alphabetize:");
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();

    // Split the string on space (\\s+) into an array of words
    // to create an array of Strings (words) to alphabetize.
    String[] words = s.split("\\s+");


    // Create two StackLL objects: mainstack and tempstack.



    // Algorithm

    // (Remember that you cannot peek() or pop() an empty stack! Be sure
    // to write code that will handle an empty stack.)


    /* Write a for-loop to go through each word in the
    array of words[] from the input string. For each word w in words[]:


    * peek() at the top word of mainstack. Let's call it current.

    * While current comes after w in the alphabet, pop() current off the
    mainstack and push() it on to tempstack.

    * Reset current to whatever peek() now returns.

    * When current finally is a word that comes before w in the alphabet,
    push() w onto mainstack.

    * Then pop() each element off of tempstack and push() onto mainstack.

    Using your for loop, apply the above process to the next word in the
    array of words to sort until you have sorted the whole array of words.

    When you are done, you should have a sorted stack of words
    in mainstack, ordered reverse alphabetically top to bottom "from z to a".
    In other words, the bottom of the stack should have words closer to the
    beginning of the alpphabet, and the top should have words closer to
    the end of the alphabet.

    The stack tempstack should be empty.

    Using toString(), print out the original String followed by the
    reverse-sorted stack to prove that your code works correctly. 
    */

  }



}
