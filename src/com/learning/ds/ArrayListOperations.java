package com.learning.ds;

import java.util.ArrayList;

public class ArrayListOperations {
    private ArrayList<String> listOfEmp = new ArrayList<String>();   //ArrayList is an inbuilt class

    public ArrayList<String> getListOfEmp() {
        return listOfEmp;
    }

    public void setListOfEmp(ArrayList<String> listOfEmp) {
        this.listOfEmp = listOfEmp;
    }

    public void addEmpName(String name){
        listOfEmp.add(name);
    }

    public void displayEmpName(int pos){
        System.out.println("Employee at position "+ pos +" is " + listOfEmp.get(pos));
    }

    public void displayListOfEmp(){
        for(int i=0; i<listOfEmp.size(); i++)
            System.out.println("Employee at pos " + i + " is " + listOfEmp.get(i));
    }

    public void modifyEmpName(int pos, String name){
        listOfEmp.set(pos,name);
    }
    public void removeEmployee(String name){
        listOfEmp.remove(listOfEmp.indexOf(name));
//        boolean found = false;
//        int foundIndex = 0;
//        for(int i=0; i<listOfEmp.size(); i++){
//            if(listOfEmp.get(i).equals(name)){
//                found = true;
//                foundIndex = i;
//                break;
//            }
//        }
//        if(foundIndex != 0){
//            System.out.println("Removing employee " + name + " from position "+ findEmpIndex(name));
//            listOfEmp.remove(findEmpIndex(name));
//        }
//        else
//            System.out.println("Employee record not found");
    }

    public int findEmpIndex(String name){
        return listOfEmp.indexOf(name);
    }
}
