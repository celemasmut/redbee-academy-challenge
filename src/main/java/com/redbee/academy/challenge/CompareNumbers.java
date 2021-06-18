package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {

    return notNullMax(notNullMax(a,b),c);
  }

  private static Integer notNullMax(Integer a, Integer b){
    if (a != null && b != null) {
      return Math.max(a,b);
    }else if(b != null){
      return b;
    }else if (a != null) {
      return a;
    }
    return 0;
  }
}
