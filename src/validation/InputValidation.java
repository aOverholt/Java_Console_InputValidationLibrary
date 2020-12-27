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
    
    /**
    * This method prompts the user to input a double value.
    * 
    * @param prompt The string that is used to prompt the user for input
    * 
    * @return This method returns a double
    */
    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! You did not enter a Double. Try again.\n");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        
        return d;
    }
    
    
    /**
    * This method prompts the user to input a double value within a certain range.
    * 
    * @param prompt The string that is used to prompt the user for input
    * @param min The lowest acceptable value
    * @param max The highest acceptable value
    * 
    * @return This method returns an double within a specified range
    */
    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        
        while (!isValid) {
            d = getDouble(prompt);
            if (d < min || d > max) {
                System.out.println(
                        "Error! Number must be greater than or equal to " + min 
                                + " and less than or equal to " + max + ".\n");
            } else {
                isValid = true;
            }
        }
        
        return d;
    }
    
    
    
    
    
    // *******************************************************************
    //   ******************     NON-NUMBERS     ************************
    // *******************************************************************
    
    // ***********************     CHAR     ****************************
    
    /**
    * This method prompts the user to make an entry and then validates 
    * whether they entered a char
    * 
    * @param prompt The string that is used to prompt the user for input
    * 
    * @return This method returns a char
    */
    public static char getChar(String prompt) {
        char c = 0;
        boolean isValid = false;
        
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNext()) {
                c = sc.next().trim().charAt(0);
                isValid = true;
            } else {
                System.out.println("Error! You must enter a character!\n");
            }
        }
        
        return c;
    }
    
    
    /**
    * This method prompts the user to enter an alphabetic char and then 
    * after verifying its a char, it returns it
    * 
    * @param prompt The string that is used to prompt the user for input
    * 
    * @return This method returns a char
    */
    public static char getAlphabeticChar(String prompt) {
        char c = 0;
        boolean isValid = false;
        
        while (!isValid) {
            c = getChar(prompt);
            if (Character.isLetter(c)) {
                isValid = true;
            } else {
                System.out.println("Error! You must enter an alphabetic character.\n");
            }
        }
        
        return c;
    }
    
    
    /**
    * This method prompts the user to enter a character and then 
    * after verifying that they entered a char, the method returns it
    * 
    * @param prompt The string that is used to prompt the user for input
    * @param char1 One of the acceptable characters
    * @param char2 One of the acceptable characters
    * @param char3 One of the acceptable characters
    * @param char4 One of the acceptable characters
    * 
    * @return This method returns a specific char of 4 options
    */
    public static char getCharSpecific(String prompt, char char1, char char2, char char3, char char4) {
        char c = 0;
        boolean isValid = false;
        
        while (!isValid) {
            c = getChar(prompt);
            if (c == char1 || c == char2 || c == char3 || c == char4) {
                isValid = true;
            } else {
                System.out.println("Error! That is not an acceptable answer. Please try again!\n");
            }
        }
        
        return c;
    }
    
    
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
