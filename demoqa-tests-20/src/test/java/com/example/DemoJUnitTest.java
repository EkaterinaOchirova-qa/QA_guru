package com.example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoJUnitTest {

  Calculator calc;

  @BeforeAll
  static void beforeAll() {
    System.out.println("#### @BeforeAll");
    Configuration.browser = "chrome";
  }

  @AfterAll
  static void afterAll() {
    System.out.println("#### @AfterAll");
//    Configuration.browser = "chrome";
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("  #### @BeforeEach");
    calc = new Calculator();
  }

  @AfterEach
  void afterEach() {
    System.out.println("  #### @AfterEach");
  }

  @Test
  void firstTest() {
    System.out.println("    #### @Test firstTest");
    int result = calc.sum(2, 2);
    Assertions.assertTrue(result == 4);
  }

  @Test
  void secondTest() {
    System.out.println("    #### @Test secondTest");
    int result = calc.mult(2, 2);
    Assertions.assertTrue(result == 4);
  }

}
