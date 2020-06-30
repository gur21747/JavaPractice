package com.learning.oop;

public class ContractEmployee extends MasterEmployee {

    private String contractorLocation;
    private int contractorID;

    public ContractEmployee(String s, int age, String location, int ID, String cLoc,int contractorID) {
        super(s, age, location, ID);
        this.contractorLocation = "Noida";
        this.contractorID = 000;
    }

    private void display() {
        System.out.println("Contractor Location = "+ contractorLocation + "ContractorID = "+ contractorID);
    }

    @Override
    public void printMesg() {
        System.out.println("ContractEmployee.printMesg() called");
        display();
        super.printMesg();
    }
}
