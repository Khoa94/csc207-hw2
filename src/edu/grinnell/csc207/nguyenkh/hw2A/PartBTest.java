package edu.grinnell.csc207.nguyenkh.hw2A;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartBTest
{

  @Test
  public void
    testAverage ()
  {
   assertEquals ("4 and 7", 5, PartB.average (4, 7)); 
   assertEquals ("Max value", 1073741825 , PartB.average (Integer.MAX_VALUE, 3));
  }

}
