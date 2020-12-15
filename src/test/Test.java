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
        System.out.println("getInt(String prompt): PASSED!\n");
        
        // getInt(String prompt, int minInt, int maxInt)
        aInt = getInt("Enter an Integer between 3 and 14: ", 3, 14);
        System.out.println("getInt(String prompt, int minInt, int maxInt): PASSED!\n");
        
        // getSpecificInt(String prompt, int firstInt)
        aInt = getSpecificInt("Enter an Integer(1): ", 1);
        System.out.println("getSpecificInt(String prompt, int firstInt): PASSED!\n");
/*
    
        // getSpecificInt(String prompt, int firstInt, int secondInt) 

        // getSpecificInt(String prompt, int firstInt, int secondInt, int thirdInt) 

        // getSpecificInt(String prompt, int firstInt, int secondInt, int thirdInt, int fourthInt) 
        
        */
    }

}
