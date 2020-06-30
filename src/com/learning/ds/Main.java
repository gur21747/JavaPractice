package com.learning.ds;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main<listOfEmp> {
    private static ArrayListOperations listOfEmp = new ArrayListOperations();
    private static ListOfEmployees empListOfObjects = new ListOfEmployees();
    private static ListOfEmployees empListOfObjects2 = new ListOfEmployees();
    
    private static void performArrayOperations() {
    	
    	System.out.println("----- Perform Array Operations ---------");
  
    	int numOfElements = 6;
    	int searchKey = 3;
        int indexOfFoundVar = -1;
    	
    	arrayOperations arr1 = new arrayOperations(numOfElements);         //Create reference to class and call constructor

        for (int i = 0; i < numOfElements; i++)                                  //Insert values in array
            arr1.setValueAtIndex(i, i);
        
        int arr[] = arr1.getArr();
        
        BiPredicate<Integer,Integer> searchElement = (item, searchItem) -> item.equals(searchItem);
        
        //Arrays.stream(arr1.getArr()).filter(item -> searchElement.test(item, searchKey )).forEach(System.out::println);
        //Stream.of(arr1.getArr()).flatMapToInt(Arrays::stream).forEach(System.out::println);
        
        indexOfFoundVar = IntStream.range(0, arr.length)
				.filter(i -> searchElement.test(arr[i], searchKey))
				.findFirst()
				.orElse(-1);
        
        System.out.println("Element found at index : "+indexOfFoundVar);
        
        System.out.println("---- Remove found element and show remaining list ---- ");
        
        if(indexOfFoundVar != -1)
        {	
        	IntStream.range(indexOfFoundVar, arr.length-1)
        	.map(index -> {
        		
            	arr1.setValueAtIndex(index, arr1.getValueAtIndex(index+1));
            	return arr1.getValueAtIndex(index);
            }).forEach(System.out::println);
        	
        	--numOfElements;
        }
        
        System.out.println("Printing all element of array");
        Arrays.stream(arr).forEach(System.out::println);

    }
    
    private static void performBetterArrayOperations(){
    	
    	System.out.println("\n------- Better Array Operations --------\n");
    	BetterArrayOperation arr2 = new BetterArrayOperation(5);

        for (int i = 0; i < 5; i++)
            arr2.insertInArray(i);     //Insert
        
        arr2.findValueInArray(3);      //Find
        arr2.deleteInArray(2);         //Delete
        arr2.displayArray();           //Display
    	
    }
    
    private static void performArrayListOperations() {
    	
    	System.out.println("\n------- ArrayList Operation --------");

        listOfEmp.addEmpName("AAA");                    //Insert new String
        listOfEmp.addEmpName("BBB");                    //Insert new String
        listOfEmp.addEmpName("CCC");                    //Insert new String
        listOfEmp.addEmpName("DDD");                    //Insert new String

        listOfEmp.displayListOfEmp();                   //Display the list
        listOfEmp.displayEmpName(3);                	//Display item at position

        listOfEmp.removeEmployee("AAA");           		//Remove item name
        listOfEmp.modifyEmpName(2,"ZZZ");     			//Modify an existing item
        listOfEmp.displayListOfEmp();

        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.addAll(listOfEmp.getListOfEmp());   //Copy the entire list in new Array list

        String[] newArrayOfStrings = new String[listOfEmp.getListOfEmp().size()];
        newArrayOfStrings = listOfEmp.getListOfEmp().toArray(newArrayOfStrings);  //Copy the list in new String Array

        for(int i=0; i<newArrayOfStrings.length;i++)      //Print like an array
            System.out.println(newArrayOfStrings[i]);

    }
    
    private static void operateEmployee() {
    	
    	System.out.println("\n------- Array operations on a list of Objects --------");
        EmployeeDetail e1 = new EmployeeDetail(001, "AAA", "Gurgaon");
        EmployeeDetail e2 = new EmployeeDetail(002, "BBB", "Gurgaon");
        EmployeeDetail e3 = new EmployeeDetail(003, "CCC", "Gurgaon");

        EmployeeDetail e4 = new EmployeeDetail(004, "DDD", "Gurgaon");
        EmployeeDetail e5 = new EmployeeDetail(005, "EEE", "Gurgaon");
        EmployeeDetail e6 = new EmployeeDetail(006, "FFF", "Gurgaon");

        empListOfObjects.addEmpToList(e1);       //Insert into list
        empListOfObjects.addEmpToList(e2);       //Insert into list
        empListOfObjects.addEmpToList(e3);       //Insert into list

        empListOfObjects2.addEmpToList(e4);       //Insert into list
        empListOfObjects2.addEmpToList(e5);       //Insert into list
        empListOfObjects2.addEmpToList(e6);       //Insert into list

        empListOfObjects.addEmpToList(e1);       //Check duplicate entry
        empListOfObjects.displayEmpList();       //Display employee records
        empListOfObjects.removeEmpFromList(002,"ZZZ");       //Remove when record not found
        empListOfObjects.removeEmpFromList(002,"BBB");       //Remove Record
        empListOfObjects.displayEmpList();       //Display after delete
        empListOfObjects2.displayEmpList();       //Display after delete

    }
    
    private static void performLinkedListOperations() {
    	
    	System.out.println("\n--------------- LinkedList operations  -------------");
        LinkedList<String> linkedListString     = new LinkedList<String>();
        LinkedList<Integer> linkedListInteger   = new LinkedList<Integer>();

        for(int i=0; i<10; i++) {
            String tempStr = Integer.toString(i);
            linkedListString.add(tempStr);        //Add entry to list
        }

        for(int i=0; i<10; i++)
            linkedListInteger.add(i);             //Add entry to list

        linkedListInteger.remove(5);        //Remove entry from list
        linkedListString.remove(5);         //Remove entry from list

        linkedListString.addFirst("FIRST");
        linkedListString.addLast("LAST");
        linkedListString.add(3,"aaa");
        linkedListString.add(2,"zzz");
        linkedListString.add(1,"yyy");

        System.out.println("\n------Integer linked list------");
        Iterator<Integer> it = linkedListInteger.iterator();
        int traversalInt = 0;

        //------------------Collections Demo--------------
        Collections.sort(linkedListString);

        if((linkedListInteger.get(2).compareTo(linkedListInteger.get(3))) < 0);
          System.out.println("\n\n "+ linkedListInteger.get(2) +" is less than " + linkedListInteger.get(3));
        int minValue = Collections.min(linkedListInteger);
        int maxValue = Collections.max(linkedListInteger);
        System.out.println("Min = "+minValue+" Max = "+ maxValue );
        Collections.swap(linkedListInteger, linkedListInteger.get(0), linkedListInteger.get(1));


        while (it.hasNext()){
            System.out.println("Linked list node at index "+ traversalInt + " = "+ it.next());
            traversalInt++;
        }

        System.out.println("\n-------String linked list-------");
        Iterator<String> i = linkedListString.iterator();
        int traversal = 0;

        while (i.hasNext()){
            System.out.println("Linked list node at index "+ traversal + " = "+ i.next());
            traversal++;
        }

    }
    
    private static void interfaceOperations() {
    	
    	Map<Integer, EmpListImplement> employeeData = new HashMap<>();
    	
    	
    	/*System.out.println("\n------------Interface example---------------");
        ISaveEmpList emp1 = new EmpListImplement(10, "AAA", "Gurgaon");
        saveObject(emp1);
        System.out.println(emp1);

        ISaveEmpList newEmp = new EmpListImplement(21, "ZZZ", "Noida");
        saveObject(newEmp);
        System.out.println(newEmp);

        ArrayList<String> empValues = new ArrayList<String>();
        empValues.add(0, "DDD");
        empValues.add(1, "25");
        empValues.add(2, "Hyderabad");

        newEmp.read(empValues);    	
*/    }
    
    private static void genericListOperations() {
    	
    	System.out.println("\n------------Generic List example---------------");
        GenericStack<String> stringList = new GenericStack<String>();
        GenericStack<Integer> intList = new GenericStack<Integer>();

        stringList.addToList("ONE");
        stringList.addToList("TWO");
        stringList.addToList("THREE");

        intList.addToList(1);
        intList.addToList(2);
        intList.addToList(3);

        stringList.display();
        intList.display();

    }
    
    private static void MapOperations() {
    	
    	System.out.println("\n--------------- Map Demo --------------");

        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        }
        else {
            languages.put("Java", "Language 1");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "Language 2");
        languages.put("C++", "Language 3");
        System.out.println(languages.put("C", "Language 4"));
        System.out.println(languages.put("Ruby", "Language 5"));
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "Re-enter Language 1");
        }
        System.out.println("\nLanguage Map is: " + languages);
        System.out.println("The set is: " + languages.keySet());

        for(String key: languages.keySet())
            System.out.println(key + " : " + languages.get(key));

    }
    
    public static void saveObject(ISaveEmpList objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving to index " + i + " = " + objectToSave.write().get(i));
        }
    }


    public static void main(String[] args) {
    	
//--------------------------------- Array Operations ---------------------------------------
    	    	
    	//performArrayOperations();
    	
//--------------------------------- Better Array Operations ---------------------------------------
    	
    	//performBetterArrayOperations();

//---------------------------------- ArrayList Operation ----------------------------------
    	
    	//performArrayListOperations();
        
//------------------------------- Array operations on a list of Objects ----------------------------
    	
    	//operateEmployee();
    	
//------------------------------- LinkedList operations  ----------------------------

    	//performLinkedListOperations();
    	
//--------------------------- Interface example ---------------------------
        interfaceOperations();
    	
//--------------------------- Generic List example ---------------------------
        //genericListOperations();
        
//----------------------- Map Demo ------------------------
        //MapOperations();
        
    }
    

}
