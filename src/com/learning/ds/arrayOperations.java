package com.learning.ds;

import java.util.stream.Stream;

public class arrayOperations {

    private int[] arr;                  // ref to arr
    
    public arrayOperations(int size){   //constructor
        arr = new int[size];            //initialize the array
    }

    public int[] getArr() {             //getter method
        return arr;
    }

    public void setArr(int[] arr) {     //setter method
        this.arr = arr;
    }

    public int getValueAtIndex(int index){
        return arr[index];
    }

    public void setValueAtIndex(int index, int value){
        arr[index] = value;
    }
}
