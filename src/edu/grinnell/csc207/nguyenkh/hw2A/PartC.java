package edu.grinnell.csc207.nguyenkh.hw2A;

public class PartC
{
  // fields
  int numerator;
  int denominator;

  
  // Observer method
  static public int
    getNumerator ()
  {
    return 3;
  }

  static public int
    getDenominator ()
  {
    return 4;
  }

  static public double
    getDecimal ()
  {
    //convert our fraction to a decimal number and return it
    return 0.75;
  }

  
  // Mutator method
  static public void
    setNumerator (int newNumerator)
  {
    // set the current object's numerator equals to newNumerator.
  }

  static public void
    setDenominator (int newDenominator)
  {
    // set the current object's denominator equals to newDenominator.
  }

  static public void
    simplify ()
  {
    // simplify the fraction if possible;
  }

  static public void
    addFraction (int numeratorOfAddedFraction, int denominatorOfAddedFraction)
  {
    // add the fraction of the current object to a fraction. Then set the
    // current object's numerator and denominator to those of the new fraction,
    // which is the sum.
  }

  static public void
    timeFraction (int numeratorOfTimedFraction, int denominatorOfTimedFraction)
  {
    // Multiply the fraction of the current object to a fraction. Then set the
    // current object's numerator and denominator to those of the new fraction,
    // which is the product.
  }

  
  // Constructor method
  public PartC (int num, int denom)
  {
    numerator = num;
    denominator = denom;
  }

}
