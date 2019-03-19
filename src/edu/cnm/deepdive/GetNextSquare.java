package edu.cnm.deepdive;

public class GetNextSquare {

  static int inputSquare(long input) {

    int nextSquare = 0;

    int sqrt = (int) Math.sqrt(input);

    if (sqrt * sqrt == input) {
      System.out.println(input + " is a perfect square number!");
      nextSquare = (sqrt + 1) * (sqrt + 1);
      System.out.println("Next perfect square is: " + nextSquare);
    } else {
      System.out.println();
      System.out.println(input + " is NOT a perfect square number!");
      nextSquare = -1;
    }
    return nextSquare;
  }

  public static void main(String[] args) {
    inputSquare(225);
    inputSquare(224);
    inputSquare(-9);


  }

}
