package com.learning.oop;

public class MasterEmployee {
    private String empName;
    private int empAge;
    private String empLocation;
    private int empID;
    private long empPhone;

    class displaySensitiveData{                 //Member Inner Class begins
        private long empSalary;                 //Members of Inner Class
        private float empExp;

        public long getEmpSalary() {
            return empSalary;
        }

        public void setEmpSalary(long empSalary) {
            this.empSalary = empSalary;
        }

        public float getEmpExp() {
            return empExp;
        }

        public void setEmpExp(float empExp) {
            this.empExp = empExp;
        }

        void checkPromotionEligibility(long salary, float exp){
            if(salary >= 500000 && exp>=2.5)
                System.out.println("Eligible for promotion");
            else
                System.out.println("Consider next time");
        }
    }                                              //Member Inner Class ends

    public MasterEmployee(String s, int age, String location, int ID) {
        empName = s;
        empAge = age;
        empLocation = location;
        empID = ID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public long getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(long empPhone) {
        this.empPhone = empPhone;
    }

    public void displayEmpRecords() {
        System.out.println(empName + " " + empAge + " " + empLocation + " " + empID);

        class localClassExample{            //Local Inner Class begins
            void displayMoreInfo(){
                System.out.println("Emp Phone = " + empPhone);
            }
        }                                   //Local Inner Class ends
        localClassExample lclObj = new localClassExample();
        //if (some conditional logic)
        lclObj.displayMoreInfo();
    }

    public void printMesg() {
        System.out.println("MasterEmployee.printMesg() called");
    }
}
