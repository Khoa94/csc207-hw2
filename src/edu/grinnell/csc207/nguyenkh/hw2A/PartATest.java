package edu.grinnell.csc207.nguyenkh.hw2A;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartATest
{

  @Test
  public void
    isMultipleTest ()
  {
    // when a>b>0
    assertEquals ("6 and 2", true, PartA.isMultiple (6, 2));
    assertEquals ("15 and 3", true, PartA.isMultiple (15, 3));

    // when b>=a>0
    assertEquals ("3 and 15", false, PartA.isMultiple (3, 15));
    assertEquals ("15 and 15", true, PartA.isMultiple (15, 15));

    // when a<0 and b<0
    assertEquals ("-3 and -15", false, PartA.isMultiple (-3, -15));
    assertEquals ("-15 and -3", true, PartA.isMultiple (-15, -3));

    // when a<0 and b>0 and vice versa
    assertEquals ("-15 and 3", true, PartA.isMultiple (-15, 3));
    assertEquals ("15 and -3", true, PartA.isMultiple (15, -3));

    // when b=0 and a!=0
    assertEquals ("-15 and 0", false, PartA.isMultiple (-15, 0));
    // when b!=0 and a=0
    assertEquals ("0 and 15", true, PartA.isMultiple (0, -15));
    //when b=0 and a=0
    assertEquals ("0 and 0", true, PartA.isMultiple (0, 0));
  }
  @Test
  public void
  isOddTest (){
  assertEquals("3", true, PartA.isOdd (3));
  assertEquals("0", false, PartA.isOdd (0));
  assertEquals("-10", false, PartA.isOdd (-10));
  assertEquals("-9", true, PartA.isOdd (-9));
}
  @Test
  public void
  oddSumTest (){
    assertEquals("5",4,PartA.oddSumTo (5));
    assertEquals("0",0,PartA.oddSumTo (0));
    assertEquals("1",0,PartA.oddSumTo (1));
    assertEquals("-13",0,PartA.oddSumTo (-13));
  }
  
  @Test
  public void
  isOddProdTest(){
    int vals1[]={0, 1, 2, 5};
    int vals2[]={0, -1, 20, 15};
    int vals3[]={0, 2, 0};
    int vals4[]={0, 1, 2, -5, 90, -67};
    
    assertEquals("0,1,2,5",true, PartA.isOddProd (vals1));
    assertEquals("0,-1,20,15",true, PartA.isOddProd (vals2));
    assertEquals("0,2,0",false, PartA.isOddProd (vals3));
    assertEquals("0,1,2,-5,90,-67",true, PartA.isOddProd (vals4));
     
  }
  
  
  @Test
  public void
  allDistinctTest(){
    int vals1[]={0, 1, 2, 5};
    int vals2[]={0, -1, 20, 15};
    int vals3[]={0, 2, 0};
    int vals4[]={0, 1, 2, -5, 90, -67};
    
    assertEquals("0,1,2,5",true, PartA.allDistinct(vals1));
    assertEquals("0,-1,20,15",true, PartA.allDistinct (vals2));
    assertEquals("0,2,0",false, PartA.allDistinct (vals3));
    assertEquals("0,1,2,-5,90,-67",true, PartA.allDistinct(vals4)); 
  } 
  
  @Test
  public void
  reverseIntsTest(){
    int vals1[]={0, 1, 2, 5};
    int vals1Reverse[]={5, 2, 1, 0};
    PartA.reverseInts (vals1);
    assertArrayEquals("0,1,2,5", vals1Reverse, vals1);
  }
}
