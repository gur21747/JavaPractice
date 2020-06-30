package com.learning.ds;

import java.util.List;

public interface ISaveEmpList {
    List<String> write();
    void read(List<String> savedValues);

//    You have to instantiate a class that implements this interface
//    Interfaces are by definition abstract.
//    This is true in case of classes also. Abstract classes cannot be instantiated directly.

//    Flexibility to declare generic list which could be of any type.
//    List write2();
//    void read2(List savedValues2);
    
    public abstract void addEmployee();
    public abstract Object getEmployeeDetail();
    public abstract void removeEmployee(Object remove_emp);
    

}
