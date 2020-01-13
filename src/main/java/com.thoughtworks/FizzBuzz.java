package com.thoughtworks;

import static com.thoughtworks.Constant.BUZZ;
import static com.thoughtworks.Constant.FIZZ;
import static com.thoughtworks.Constant.WHIZZ;

public class FizzBuzz {

  public String say(Integer number) {
    if (number % 3 == 0) {
      return FIZZ.getName();
    }
    if (number % 5 == 0) {
      return BUZZ.getName();
    }
    if (number % 7 == 0) {
      return WHIZZ.getName();
    }
    return number.toString();
  }
}
