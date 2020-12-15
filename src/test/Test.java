package test;

import static validation.InputValidation.*;
public class Test
{
    public static void main(String[] args)
    {
        // Variables
        int aInt;
        double aDouble;
        String aString;
        
        // getInt(String prompt)
        aInt = getInt("Enter an Integer: ");
        System.out.println("Results of getInt(): " + aInt + "\n");
        
        // getInt(String prompt, int minInt, int maxInt)
        aInt = getInt("Enter an Integer between 3 and 14: ", 3, 14);
        System.out.println("Results of getInt(): " + aInt + "\n");
/*
        // getSpecificInt(String prompt, int firstInt)
        aInt = getInt("Enter an Integer: ");
        System.out.println("Results of getInt(): " + aInt);
    
        // getSpecificInt(String prompt, int firstInt, int secondInt) 
        aInt = getInt("Enter an Integer: ");
        System.out.println("Results of getInt(): " + aInt);

        // getSpecificInt(String prompt, int firstInt, int secondInt, int thirdInt) 
        aInt = getInt("Enter an Integer: ");
        System.out.println("Results of getInt(): " + aInt);

        // getSpecificInt(String prompt, int firstInt, int secondInt, int thirdInt, int fourthInt) 
        aInt = getInt("Enter an Integer: ");
        System.out.println("Results of getInt(): " + aInt);
        
        */
    }
}
