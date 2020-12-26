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
    
    
    
    // *********************     INTEGERS     **************************
    
   /**
    * This method prompts the user to input an integer value.
    * 
    * @param prompt The string that is used to prompt the user for input
    * 
    * @return This method returns an integer
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
    
    
    
    
    /**
    * This method prompts the user to input an integer value within a certain range.
    * 
    * @param prompt The string that is used to prompt the user for input
    * @param min The lowest acceptable integer
    * @param max The highest acceptable integer
    * 
    * @return This method returns an integer within a specified range
    */
    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        
        while (!isValid) {
            i = getInt(prompt);
            if (i < min || i > max) {
                System.out.println(
                        "Error! Number must be greater than or equal to " + min 
                                + " and less than or equal to " + max + ".\n");
            } else {
                isValid = true;
            }
        }
        
        return i;
    }
    
    
    
    
    // **********************     DOUBLE     ****************************
    
    // TODO: getDouble(String prompt)
    
    // TODO: getDouble(String prompt, double minDouble, double maxDouble)
    
    
    // *******************************************************************
    //   ******************     NON-NUMBERS     ************************
    // *******************************************************************
    
    // ***********************     CHAR     ****************************
    
    // TODO: getChar(String prompt)
    
    // TODO: getSpecificChar(Scanner sc, String prompt, char firstChar)
    
    // TODO: getSpecificChar(Scanner sc, String prompt, char firstChar, char secondChar)
    
    // TODO: getSpecificChar(Scanner sc, String prompt, char firstChar, char secondChar, char thirdChar)
    
    // TODO: getSpecificChar(Scanner sc, String prompt, char firstChar, char secondChar, char thirdChar, char fourthChar)
    
    
    
    // *********************     STRINGS     ***************************
    
    /**
    * This method prompts the user to make an entry and then validates 
    * whether they entered anything or not
    * 
    * @param prompt The string that is used to prompt the user for input
    * 
    * @return This method returns a String
    */
    public static String getString(String prompt) {
        
        String s = "";
        boolean isValid = false;
        
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNext()) {
                s = sc.next();
                isValid = true;
            } else {
                System.out.println("Error! You did not enter anything! Try again.\n");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        
        return s;
    }
    
    
    
    
    /**
    * This method prompts the user to input a specific string such as a password
    * 
    * @param prompt The string that is used to prompt the user for input
    * @param answer The only acceptable answer.
    * 
    * @return This method returns a specified String
    */
    public static String getStringSpecific(String prompt, String answer) {
        
        String s = "";
        boolean isValid = false;
        
        while (!isValid) {
            s = getString(prompt);
            if (s.equals(answer)) {
                isValid = true;
            } else {
                System.out.println("Incorrect!\n");
            }
        }
        
        return s;
        
    }
}
