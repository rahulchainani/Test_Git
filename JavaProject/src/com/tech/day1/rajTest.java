package com.tech.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class rajTest {
  @Test
  public void f() {
	  System.out.println("hheee");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("hi");
  }

  @AfterTest
  public void afterTest() {
  }

}
