package Pac_2_Testng;

import org.testng.annotations.Test;

public class NewTest_1 {
  @Test( groups = {"sanity"})
  public void f() {
	  System.out.println("This is new test from pac");
  }
}
