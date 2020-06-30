package com.learning.ds;

import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> list = new ArrayList<T>();

    public void addToList(T element){
        list.add(element);
    }
    public void removeFromList(T element){
        list.remove(element);
    }
    public void display() {
        for (int i = 0; i < list.size(); i++)
            System.out.println("Element of List : " + list.get(i));
    }
}
