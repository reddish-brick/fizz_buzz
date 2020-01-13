package com.thoughtworks;

import static com.thoughtworks.Constant.BUZZ;
import static com.thoughtworks.Constant.FIZZ;
import static com.thoughtworks.Constant.WHIZZ;

public class FizzBuzz {

  public String say(Integer number) {
    boolean multiple3 = number % 3 == 0;
    boolean multiple5 = number % 5 == 0;
    boolean multiple7 = number % 7 == 0;
    boolean isContain3 = number.toString().contains("3");
    boolean isContain5 = number.toString().contains("5");
    boolean isContain7 = number.toString().contains("7");
    if (isContain7) {
      isContain5 = false;
      multiple5 = false;
    }
    if (isContain5) {
      isContain3 = false;
      multiple3 = false;
    }
    if (isContain3) {
      return FIZZ.toString();
    }
    StringBuilder result = new StringBuilder();
    if (multiple3) {
      result.append(FIZZ.toString());
    }
    if (multiple5) {
      result.append(BUZZ.toString());
    }
    if (multiple7) {
      result.append(WHIZZ.toString());
    }
    return result.toString().isEmpty() ? number.toString() : result.toString();
  }
}
