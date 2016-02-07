package com.atf.util;

import java.util.Arrays;

public class ArrayList<T>{
  Object arr[];
  final int DEFAULT_CAP = 1;
  int size = 0;
  boolean isFirst = true;
  public ArrayList(){
    this.size = DEFAULT_CAP;
    this.arr = new Object[size];
  }
  public void add(T item){
    if(isFirst){
      this.arr[this.arr.length - 1] = item;
      isFirst = false;
    }
    else{
      this.arr = Arrays.copyOf(arr, arr.length+1);
      this.arr[this.arr.length - 1] = item;
    }
  }
  @SuppressWarnings("unchecked")
  public T get(int i){
    return (T)this.arr[i];
  }
  public int size(){
    return this.arr.length;
  }

}
