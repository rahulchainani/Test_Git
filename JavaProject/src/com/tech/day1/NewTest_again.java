package com.tech.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest_again {
  @Test
  
  public void f() {
  
	  System.out.println("Hi");
  }
  @BeforeTest
  public void beforeTest() {
  
	  System.out.println("Hello");
  }

  @AfterTest
  public void afterTest() {
  
  System.out.println("See You");
  }

}
