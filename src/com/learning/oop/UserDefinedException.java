package com.learning.oop;

//Creating user-defined exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

class UserDefinedException {
    static void validate(int age) throws InvalidAgeException {   //InvalidAgeException
        if (age < 18)
            // if age is less than 18 , then throw user-defined exception
            throw new InvalidAgeException("Age Not OK");
        else
            System.out.println("Age OK");
    }
}
