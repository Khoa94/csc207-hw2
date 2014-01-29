package edu.grinnell.csc207.nguyenkh.hw2A;
public class PartB {
  /**
   * Compute the average of two integers.  Rounds toward zero if the
   * average is not a whole number.
   */
  public static int 
    average (int left, int right) 
  {
    return (left + right) / 2;
  } // average(int,int)
} // class TwoB

//The method doesn’t work when left+right > Integer.MAX_VALUE. The method need to specify this precondition.