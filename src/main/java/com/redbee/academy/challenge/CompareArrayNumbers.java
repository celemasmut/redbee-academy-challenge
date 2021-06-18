package com.redbee.academy.challenge;

import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> newList = new ArrayList<>();
    int max;
    if(a.size() == b.size()){
      for(int i =0; i < a.size();i++){
        max = Math.max(a.get(i),b.get(i));
        newList.add(max);
      }
    }else {
      List<Integer> shorter = new ArrayList<>();
      shorter = a.size() < b.size() ? a : b;
      List<Integer> greater = new ArrayList<>();
      greater = a.size() > b.size() ? a : b;
      for(int i =0; i < shorter.size();i++){
        max = Math.max(a.get(i),b.get(i));
        newList.add(max);
      }
      for(int i = shorter.size()-1; i < greater.size(); i++){
        newList.add(greater.get(i));
      }
    }
    return newList;
  }




}
