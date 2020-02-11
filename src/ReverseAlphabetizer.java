import java.util.Scanner;

public class ReverseAlphabetizer extends StackLL implements Stack {

  public static void main (String[] args) {

    // We will use the Scanner class (yay!) to read
    // input from the user while running the class.

    System.out.println("Enter a string to split into words and alphabetize:");
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    //This takes user input as a string

    // Split the string on space (\\s+) into an array of words
    // to create an array of Strings (words) to alphabetize.
    String[] words = s.split("\\s+");
    //This line turns the string into an array, splitting the strings whenever
    //there's a space

    // Create two StackLL objects: mainstack and tempstack.
    StackLL mainstack = new StackLL();
    StackLL tempstack = new StackLL();
    //These are the two stacks that are used as the code is running

    // Algorithm

    // (Remember that you cannot peek() or pop() an empty stack! Be sure
    // to write code that will handle an empty stack.)
    for (int i = 0; i < words.length; i++) {
    //This loop runs through the user input/array
    if (mainstack.isEmpty()) {
      mainstack.push(words[0]);
      //This if statement runs only the first time the loop iterates, adding
      //the first word in the array
    } else {
      String current = mainstack.peek();
      //The variable current refers to the top value in the stack
      while(current != null && current.compareToIgnoreCase(words[i])>0) {
        mainstack.pop();
        tempstack.push(current);
        current = mainstack.peek();
        //While the mainstack isn't empty and the top word in the stack (the
        //variable current) comes after the word from the array, pop off the
        //top word from the mainstack and push it to the tempstack. Then we
        //reset the variable current to the top word in the mainstack

      } mainstack.push(words[i]);
      //If current doesn't come after the word from the array, just push the
      //word onto mainstack

    } while(tempstack.isEmpty() == false) {
      String first = tempstack.pop();
      mainstack.push(first);
      //This line just pushes the words from tempstack onto the mainstack after
      //the words have all been organized in tempstack
    }

  }
  System.out.println("This is the original string: " + s);
  //prints out original string
  System.out.println("This is the reversed alphabetized string: " + mainstack.toString());
  //prints out reversed alphabetized string using the stringbuilder

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
    beginning of the alphabet, and the top should have words closer to
    the end of the alphabet.

    The stack tempstack should be empty.

    Print out the original String. Then use toString() to print out the
    reverse-sorted stack to prove that your code works correctly.
    */

  }



}
