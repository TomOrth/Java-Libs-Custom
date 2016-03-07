package com.atf.util;

import java.util.Arrays;

public class Stack<T>{
    private int DEFAULT_SIZE = 1;
    private boolean isStart = true;
    Object arr[];
    public Stack(){
      this.arr = new Object[DEFAULT_SIZE];
    }
    public T push(T item){
      if(isStart){
        this.arr[this.arr.length - 1] = item;
        isStart = false;
      }
      else{
        this.arr = Arrays.copyOf(this.arr, this.arr.length+1);
        this.arr[this.arr.length - 1] = item;
      }
      return (T)item;
    }
    @SuppressWarnings("unchecked")
    public T pop(){
       if(isEmpty()){
         return null;
       }
       Object ret = this.arr[this.arr.length-1];
       Object tmp[] = new Object[this.arr.length - 1];
       for(int i = 0; i < this.arr.length - 1; ++i){
         tmp[i] = this.arr[i];
       }
       this.arr = tmp;
       return (T)ret;
    }
    @SuppressWarnings("unchecked")
    public T peek(){
       if(isEmpty()){
         return null;
       }
       Object ret = this.arr[this.arr.length-1];
       return (T)ret;
    }
    public int search(Object o){
      int index = -1;
      for(int j = 0; j < this.arr.length; ++j){
        if(this.arr[j].equals(o)){
          index = j;
          break;
        }
      }
     return index;
    }
   private boolean isEmpty(){
     for(int k = 0; k < this.arr.length; ++k){
       if(!this.arr[k].equals(null)){
         return false;
       }
     }
     return true;
   }
}
