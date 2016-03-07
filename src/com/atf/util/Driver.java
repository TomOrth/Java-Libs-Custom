package com.atf.util;

public class Driver{
  public static void main(String[] args){
    System.out.println("****ArrayList test****");
    System.out.println("****Items****");
    ArrayList<String> al = new ArrayList<String>();
    al.add("Hello");
    al.add("World");
    al.add("Lol");
    for(int i = 0; i < al.size(); ++i){
      System.out.println(al.get(i));
    }
    al.delete(0);
    System.out.println("****First element deleted****");
    for(int i = 0; i < al.size(); ++i){
      System.out.println(al.get(i));
    }
    al.delete("Lol");
    System.out.println("****Deleted 'Lol' item****");
    for(int i = 0; i < al.size(); ++i){
      System.out.println(al.get(i));
    }
    System.out.println("****Stack test****");
    System.out.println("****Pushing 'Hello' and 'Can you hear me?' in that order****");
    Stack<String> stack = new Stack<String>();
    stack.push("Hello");
    stack.push("Can you here me?");
    System.out.println("Peeking: " + stack.peek());
    System.out.println("Popping: " + stack.pop());
    System.out.println("Index of 'Hello'(-1 if not exist): " + stack.search("Hello"));
    System.out.println("Index of 'Can you hear me?'(-1 if not exsit): " + stack.search("Can you hear me?"));
  }

}
