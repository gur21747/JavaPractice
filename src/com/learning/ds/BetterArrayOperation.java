package com.learning.ds;

public class BetterArrayOperation {
    private int arr[];
    private int numberOfElem;

    public BetterArrayOperation(int maxElem){
        arr = new int[maxElem];
        numberOfElem = 0;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getNumberOfElem() {
        return numberOfElem;
    }

    public void setNumberOfElem(int numberOfElem) {
        this.numberOfElem = numberOfElem;
    }

    public void insertInArray(int value){
        arr[numberOfElem] = value;
        numberOfElem++;
    }

    //--------------------------------------------------------

    public void deleteInArray(int value){
        int foundAtIndex = findValueInArray(value);
        System.out.println("Found value index = "+foundAtIndex);
        if(foundAtIndex != -1){
            for(int i = foundAtIndex; i<numberOfElem-1; i++) {
                arr[i] = arr[i+1];
            }
            numberOfElem--;
        }
    }

    //--------------------------------------------------------

    public int findValueInArray(int searchKey) {
        int i;
        boolean a = false;
        for (i = 0; i < numberOfElem; i++) {
            if (arr[i] == searchKey) {
                a = true;
                break;
            }
        }
        if(a) //Return the index of the found element
            return i;
        else
            return -1;
    }

    //--------------------------------------------------------

    public void displayArray(){
            for(int i=0; i<numberOfElem; i++)
                System.out.println(arr[i]);
    }

}
