package com.atf.util;

public class Driver{
  public static void main(String[] args){
    ArrayList<String> al = new ArrayList<String>();
    al.add("Hello");
    al.add("World");
    for(int i = 0; i < al.size(); ++i){
      System.out.println(al.get(i));
    }
  }

}
