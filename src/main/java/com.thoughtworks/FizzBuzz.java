package com.thoughtworks;

import static com.thoughtworks.Constant.BUZZ;
import static com.thoughtworks.Constant.FIZZ;
import static com.thoughtworks.Constant.WHIZZ;
import static java.util.stream.Collectors.joining;

import java.util.Arrays;

public class FizzBuzz {

  public String say(Integer number) {
    boolean multiple3 = number % 3 == 0;
    boolean isContain3 = number.toString().contains("3");
    boolean isContain5 = number.toString().contains("5");
    if (isContain5) {
      isContain3 = false;
      multiple3 = false;
    }
    if (isContain3) {
      return format(FIZZ);
    }
    if (number % 105 == 0) {
      return format(FIZZ, BUZZ, WHIZZ);
    }
    if (number % 21 == 0) {
      return format(FIZZ, WHIZZ);
    }
    if (number % 15 == 0) {
      return format(FIZZ, BUZZ);
    }
    if (number % 35 == 0) {
      return format(BUZZ, WHIZZ);
    }
    if (multiple3) {
      return format(FIZZ);
    }
    if (number % 5 == 0) {
      return format(BUZZ);
    }
    if (number % 7 == 0) {
      return format(WHIZZ);
    }
    return number.toString();
  }

  private <T> String format(T... t) {
    return Arrays.stream(t)
        .map(Object::toString)
        .collect(joining(""));
  }

}
