public class StackLL implements Stack {

  // Instance variables for this implementation of Stack
  Node top;    // a pointer to the top of the the stack
  int size;    // stores the current size of the stack

  // Inner class, Node
  class Node {
    String item;
    Node next;
  }

  // Constructor for StackLL
  StackLL() {
    this.top = null;
    this.size = 0;
  }

  // Methods to implement from Stack interface

  // push: adds an element to the top of the stack
  public void push(String s) {

    // create a new node
    Node n = new Node();
    n.item = s;

    // If the stack is empty, top will point at the new node
    if (isEmpty()) {
      top = n;
    }
    // otherwise, top.next will point at the new node
    else {
      n.next = top;
      top = n;
    }
    size++;
  }

  // peek: returns, but does not remove, the element at the top
  public String peek() {
    if (isEmpty()) {
      return null;
    }
    return top.item;
  }

  // pop: removes and returns the element at the top
  public String pop() {
    if (isEmpty()) {
      return null;
    }
    String returnme = top.item;
    top = top.next;
    size--;
    return returnme;

  }

 // isEmpty: return true if there are no elements in the stack
  public boolean isEmpty() {
    return (this.size == 0);
  }

  //////////////////////////////////
  // ** YOUR CODE STARTS HERE! ** //
  //////////////////////////////////

  // toString()
  public String toString() {

    // Write code to return a string that is the words currently in the stack,
    // from top to bottom. Do not use push(), pop(), or peek().

    // Create a StringBuilder object.
    // Traverse the linked list as we have demonstrated in class.
    // As you visit each node, append the item followed by a space to the StringBuilder object.
    // Return the StringBuilder object as a String, calling its toString() method.
    // The String returned should start with the top of the stack and end with the bottom.

    // Below, I'm inserting dummy code so this will compile. You need to delete this
    // when you are writing your code, of course.

    return "";

  }

  // If you like, you can write code in this main method to test your toString() method.
  public static void main (String[] args) {

  }

  //////////////////////////////////
  // ** YOUR CODE ENDS HERE! ** //
  //////////////////////////////////



}
