package com.thoughtworks;

public enum Constant {
  FIZZ("Fizz"),
  BUZZ("Buzz"),
  WHIZZ("Whizz");

  private String name;

  Constant(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
