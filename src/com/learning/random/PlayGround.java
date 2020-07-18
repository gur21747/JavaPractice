package com.learning.random;

public class PlayGround {
    public static void main(String[] args) {
        //Initialize array
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Create another array arr2 with size of arr1
        int arr2[] = new int[arr1.length];

        //Copying all elements of one array into another
        for (int i = 0; i < arr1.length; i++)
            arr2[i] = arr1[i];

        //Displaying elements of array arr1
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");

        System.out.println("\n");

        //Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");

        for (int i = 1; i < arr1.length; i = i + 2)
            System.out.println("Even Position [" + i + "] =" + arr1[i]);


        String str1 = "Cow";
        String str2 = "";
        String str3 = "Goat";

        System.out.println(str1.compareTo(str2));

        System.out.println(str2.compareTo(str3));
    }
}

