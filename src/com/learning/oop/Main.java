package com.learning.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import static com.learning.oop.UserDefinedException.validate;

public class Main {

    public static void main(String[] args) {
        MasterEmployee[] empArray = new MasterEmployee[5];
        UserDefinedException e = new UserDefinedException();

        int empAge = 10;
        try {                   //try catch block to check the age
            validate(empAge);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }
        empArray[0] = new MasterEmployee("M-aaa", empAge, "Gurugram", 20020);
        empArray[1] = new MasterEmployee("M-bbb", 30, "Gurugram", 20021);
        empArray[2] = new MasterEmployee("M-ccc", 30, "Gurugram", 20022);
        empArray[3] = new MasterEmployee("M-ddd", 30, "Gurugram", 20023);
        empArray[4] = new MasterEmployee("M-eee", 30, "Gurugram", 20024);

        for (int i = 0; i < 5; i++)
            empArray[i].displayEmpRecords();

        ContractEmployee contEmp = new ContractEmployee("C-abc", 30, "Noida", +
                0, "Noida", 2223);
        contEmp.printMesg();

        //------------ Inner Class Example ----------------

        System.out.println("\n------------ Member Inner Class Example ----------------");
        MasterEmployee.displaySensitiveData innerExample = empArray[0].new displaySensitiveData();
        innerExample.setEmpExp(2);
        innerExample.setEmpSalary(550000);
        innerExample.checkPromotionEligibility(innerExample.getEmpSalary(), innerExample.getEmpExp());

        System.out.println("\n------------ Local Inner Class Example ----------------");
        empArray[0].setEmpPhone(999999999);
        empArray[0].displayEmpRecords();

        //-------------- Static Vs Final -----------------
        System.out.println("\n------------- Static Vs Final --------------");
        SomeClass class1 = new SomeClass("class1");
        SomeClass class2 = new SomeClass("class2");
        SomeClass class3 = new SomeClass("class3");

        System.out.println("Calling from instance class1 =" + class1.getInstanceNumber());
        System.out.println("Calling from instance class2 =" + class2.getInstanceNumber());
        System.out.println("Calling from instance class3 =" + class3.getInstanceNumber());

        //class1.instanceNumber = 5;
        System.out.println(Math.PI);


        //----------------- Collection on object of Class -----------------
        System.out.println("\n-------- Collection on object of Class --------");
        MasterEmployee rakesh = new MasterEmployee("rakesh", 35, "Gurugram", 20020);
        MasterEmployee anuj = new MasterEmployee("anuj", 36, "Gurugram", 20021);
        MasterEmployee bibek = new MasterEmployee("bibek", 29, "Gurugram", 20022);
        MasterEmployee yogesh = new MasterEmployee("yogesh", 32, "Gurugram", 20023);
        MasterEmployee manoj = new MasterEmployee("manoj", 30, "Gurugram", 20024);

        List<MasterEmployee> employees = new ArrayList<>();
        employees.add(rakesh);
        employees.add(anuj);
        employees.add(bibek);
        employees.add(yogesh);
        employees.add(manoj);

//        Collections.sort(employees, new Comparator<MasterEmployee>() {
//            @Override
//            public int compare(MasterEmployee employee1, MasterEmployee employee2) {
//                return employee1.getEmpName().compareTo(employee2.getEmpName());
//            }
//        });

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getEmpName().compareTo(employee2.getEmpName()));

//        for (MasterEmployee employee : employees)
//            System.out.println(employee.getEmpName());

        employees.forEach(employee -> {
            System.out.println(employee.getEmpAge());
            System.out.println(employee.getEmpName());
        });

        printEmployeesByAge(employees, "Employees over 30",employee -> employee.getEmpAge()>=30);

    }

    private static void printEmployeesByAge(List<MasterEmployee> employees,
                                            String ageText,
                                            Predicate<MasterEmployee> ageCondition){
        System.out.println(ageText);
        System.out.println("\n-------------------");
        for(MasterEmployee employee : employees){
            if(ageCondition.test(employee)){
                System.out.println(employee.getEmpAge());
            }
        }
    }

}
