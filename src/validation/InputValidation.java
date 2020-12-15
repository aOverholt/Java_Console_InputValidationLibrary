package validation;

import java.util.Scanner;

/**
 *
 * @author L. Andrew Overholt
 */
public class InputValidation {
    
    // *******************************************************************
    //   ********************     NUMBERS     **************************
    // *******************************************************************
    
    // int
    
   /**
    * This method prompts the user to input an integer value.
    * 
    * @param sc Scanner
    * @param prompt The string that is used to prompt the user for input
    * 
    * @return This method returns an integer
    * 
    */
    public static int getInt(Scanner sc, String prompt) 
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }
    
    // TODO: getIntWithinRange(Scanner sc, String prompt, int minInt, int maxInt)
    
    // TODO: getSpecificInt(Scanner sc, String prompt, int firstInt)
    
    // TODO: getSpecificInt(Scanner sc, String prompt, int firstInt, int secondInt) 
    
    // TODO: getSpecificInt(Scanner sc, String prompt, int firstInt, int secondInt, int thirdInt) 
    
    // TODO: getSpecificInt(Scanner sc, String prompt, int firstInt, int secondInt, int thirdInt, int fourthInt) 
    
    
    
    // double
    
    // TODO: getDouble(Scanner sc, String prompt)
    
    // TODO: getDoubleWithinRange(Scanner sc, String prompt, double minDouble, double maxDouble)
    
    
    // *******************************************************************
    //   ********************     NUMBERS     **************************
    // *******************************************************************
    
    // Char
    
    // TODO: getChar(Scanner sc, String prompt)
    
    // TODO: getSpecificChar(Scanner sc, String prompt, char firstChar)
    
    // TODO: getSpecificChar(Scanner sc, String prompt, char firstChar, char secondChar)
    
    // TODO: getSpecificChar(Scanner sc, String prompt, char firstChar, char secondChar, char thirdChar)
    
    // TODO: getSpecificChar(Scanner sc, String prompt, char firstChar, char secondChar, char thirdChar, char fourthChar)
    
    
    
    // String
    
    // TODO: 
    
    // TODO: 
    
    // TODO: 
    
    // TODO: 
    
    // TODO: 
    
}
