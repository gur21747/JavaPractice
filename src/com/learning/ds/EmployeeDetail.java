package com.learning.ds;

public class EmployeeDetail {
    private int empNumber;
    private String empName;
    private String empLocation;

    public EmployeeDetail(int empNumber, String empName, String empLocation) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.empLocation = empLocation;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public EmployeeDetail addEmpDetail(int empNumber, String empName, String empLocation){
        return new EmployeeDetail(empNumber, empName, empLocation);
    }
}
