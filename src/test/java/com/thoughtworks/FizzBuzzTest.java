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

  @Test
  public void should_return_FizzBuzz_when_number_is_the_multiple_3_5_at_the_same_time() {
    assertEquals(FIZZ.getName() + BUZZ.getName(), fizzBuzz.say(15));
  }

  @Test
  public void should_return_FizzWhizz_when_number_is_the_multiple_3_7_at_the_same_time() {
    assertEquals(FIZZ.getName() + WHIZZ.getName(), fizzBuzz.say(21));
  }

  @Test
  public void should_return_FizzBuzzWhizz_when_number_is_the_multiple_3_5_7_at_the_same_time() {
    assertEquals(FIZZ.getName() + BUZZ.getName() + WHIZZ.getName(), fizzBuzz.say(105));
  }

  @Test
  public void should_return_Fizz_when_number_contains_3() {
    assertEquals(FIZZ.getName(), fizzBuzz.say(13));
  }
}
