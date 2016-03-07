package com.atf.util;

import java.util.Arrays;

public class ArrayList<T>{
  Object arr[];
  final int DEFAULT_CAP = 1;
  boolean isFirst = true;
  public ArrayList(){
    this.arr = new Object[DEFAULT_CAP];
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
    if(i > this.arr.length || i < 0){
     throw new IndexOutOfBoundsException("Array index out of bounds(GET): " + i);
    }
    return (T)this.arr[i];
  }
  public int size(){
    return this.arr.length;
  }
  public void delete(int index){
     if(index > this.arr.length){
       System.out.println(this.arr.length);
       throw new IndexOutOfBoundsException("Array index out of bounds: " + index);
     }
     else{
     Object[] tmp = new Object[this.arr.length-1];
     for(int j = 0; j < arr.length; ++j){
       if(j != index ){
        if(j > 0){
        tmp[j-1] = this.arr[j];
       }
       else{
        tmp[j] = this.arr[j];
       }
       }
     }
     this.arr = tmp;
    }
  }
 @SuppressWarnings("unchecked") 
  public void delete(T item){
    Object[] tmp = new Object[this.arr.length-1];
     for(int j = 0; j < arr.length; ++j){
       if(!arr[j].equals((Object)item)){
        tmp[j] = this.arr[j];
       }
     }
     this.arr = tmp;
    }
}
