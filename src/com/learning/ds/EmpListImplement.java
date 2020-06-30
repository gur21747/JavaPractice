package com.learning.ds;

import java.util.ArrayList;
import java.util.List;

public class EmpListImplement implements ISaveEmpList{
    private int empNumber;
    private String empName;
    private String empLocation;

    public EmpListImplement(int empNumber, String empName, String empLocation) {
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

    @Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getEmployeeDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEmployee(Object remove_emp) {
		// TODO Auto-generated method stub
		
	}

	public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.empName);
        values.add(1, "" + this.empNumber);
        values.add(2, this.empLocation);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.empName = savedValues.get(0);
            this.empNumber = Integer.parseInt(savedValues.get(1));
            this.empLocation = savedValues.get(2);
        }
    }
}
