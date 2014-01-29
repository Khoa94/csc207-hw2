package edu.grinnell.csc207.nguyenkh.hw2A;

public class PartA
{

  // We have the idea “return (a/b == (int) a/b))” from
  // http://stackoverflow.com/questions/5502548/checking-if-a-number-is-an-integer-in-java
  public static boolean
    isMultiple (long a, long b)
  {
    if (0 < a && a < b)
      {
        return false;
      }

    if (0 > a && a > b)
      {
        return false;
      }

    else if (b == 0 && a != 0)
      {
        return false;
      }
    else if (b == 0 && a == 0)
      {
        return true;
      }

    return (a / b == (int) a / b);
  }

  public static boolean
    isOdd (int a)
  {
    return (java.lang.Math.pow (-1, a) != 1);
  }

  public static int
    oddSumTo (int a)
  {
    int sum = 0;
    for (int i = 1; i < a; i = i + 2)
      {
        sum = sum + i;
      }
    return sum;
  }

  public static boolean
    isOddProd (int[] vals)
  {
    int numOfOdd = 0;
    for (int i = 0; i < vals.length; i++)
      {
        if (isOdd (vals[i]) == true)
          numOfOdd++;
      }
    return (numOfOdd > 1);
  }


  public static boolean
    allDistinct (int[] vals)
  {
    for (int i = 0; i < vals.length; i++)
      {
        for (int j = i + 1; j < vals.length; j++)
          {
            if (vals[i] == vals[j])
              {
                return false;
              }
          }
      }
    return true;
  }

  public static void
 reverseInts (int[] vals)
 {
   int[] reverse = new int [vals.length] ; 
   for (int i =0; i<vals.length; i++){
     reverse[i]=vals[vals.length-1-i];
     }
   for (int k=0; k<vals.length; k++){
     vals[k]=reverse[k];
       }
      }
}

