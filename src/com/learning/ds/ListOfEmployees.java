package com.learning.ds;

import java.util.ArrayList;

public class ListOfEmployees {
    private ArrayList<EmployeeDetail> empList = new ArrayList<EmployeeDetail>();
    private int index;

    public int findEmployee(String name) {
        int found = -1;
        for(int i=0; i<empList.size();i++) {
            EmployeeDetail emp = empList.get(i);
            if (emp.getEmpName().equals(name)) {
                found = i;
                break;
            }
            else
                continue;
        }
        return found;
    }

    public void addEmpToList(EmployeeDetail employeeDetail){
        if(findEmployee(employeeDetail.getEmpName()) >= 0)
            System.out.println("Employee name exists");
        else
            empList.add(employeeDetail);
        }

    public void removeEmpFromList(int num,String name){
        if(findEmployee(name) >= 0){
            EmployeeDetail e=empList.get(findEmployee(name));
            empList.remove(e);
        }
        else
            System.out.println("Record not found!");
    }

    public void displayEmpList(){
        for(int i=0; i<empList.size();i++) {
            EmployeeDetail e = empList.get(i);
            System.out.println("Number : "+e.getEmpNumber());
            System.out.println("Name : "+ e.getEmpName());
            System.out.println("Location : "+ e.getEmpLocation());
        }
    }
}
