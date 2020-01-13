package com.thoughtworks;

import static com.thoughtworks.Constant.BUZZ;
import static com.thoughtworks.Constant.FIZZ;
import static com.thoughtworks.Constant.WHIZZ;
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

  @Test
  public void should_return_separated_Fizz_Buzz_Whizz_when_number_is_multiple_of_3_5_7() {
    assertEquals(FIZZ.getName(), fizzBuzz.say(3));
    assertEquals(BUZZ.getName(), fizzBuzz.say(5));
    assertEquals(WHIZZ.getName(), fizzBuzz.say(7));
  }
}
