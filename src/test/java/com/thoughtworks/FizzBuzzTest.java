package com.thoughtworks;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @Before
  public void setUp() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void should_return_itself() {
    assertEquals("1", fizzBuzz.say(1));
  }
}
