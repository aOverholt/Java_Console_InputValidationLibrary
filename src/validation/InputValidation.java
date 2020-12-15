package validation;

import java.util.Scanner;

/**
 * @author L. Andrew Overholt
 */
public class InputValidation {
    
    private static Scanner sc = new Scanner(System.in);
    
    // *******************************************************************
    //   ********************     NUMBERS     **************************
    // *******************************************************************
    
   /**
    * This method prompts the user to input an integer value.
    * 
    * @param prompt The string that is used to prompt the user for input
    * 
    * @return This method returns an integer
    * 
    */
    public static int getInt(String prompt) 
    {
        int i = 0;
        boolean isValid = false;
        
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! You did not enter an integer. Try again.\n");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        
        return i;
    }
    
    // TODO: getInt(String prompt, int minInt, int maxInt)
    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min || i >= max) {
                System.out.println(
                        "Error! Number must be greater than " + min + " and less than " + max + ".\n");
            } else {
                isValid = true;
            }
        }
        
        return i;
    }
    
    // TODO: getSpecificInt(String prompt, int firstInt)
    
    // TODO: getSpecificInt(String prompt, int firstInt, int secondInt) 
    
    // TODO: getSpecificInt(String prompt, int firstInt, int secondInt, int thirdInt) 
    
    // TODO: getSpecificInt(String prompt, int firstInt, int secondInt, int thirdInt, int fourthInt) 
    
    
    
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
