package com.imie.tp.calculator;

import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 *
 * @author benjamin
 *
 */
public class Application {

	/**
	 *
	 * @param args
	 */
    public static void main(String[] args) {

        // Process...
        // Display & Ask "Type of Operation ":
        //               - 1 : Addition
        //               - 2 : Subtraction
        //               - 3 : Divide
        //               - 4 : Multiplication
        //               - 5 : Display History
        //               - 9 : Quit

        // If enter 1
        // Display & Ask "Enter Value a : "
        // Display & Ask "Enter Value b : "
        // after
        // Display : result

        // If enter 5
        // Display last calculate :
        //    1 + 1 = 2
        //    2 * 3 = 6

        // If enter 9 => Quit application

        //TODO
    	System.out.println("Type of Operation :");
    	System.out.println("1 : Addition");
    	System.out.println("2 : Substraction");
    	System.out.println("3 : Divide");
    	System.out.println("4 : Multiplication");
    	System.out.println("5 : Display History");
    	System.out.println("9 : Quit");

    	String saisie = KeyboardUtils.readFromKeyboard("Votre choix :");
    	int value = Integer.parseInt(saisie);


        String choice;
        switch (value) {
            case 1:  choice = "function addition";
                     break;
            case 2:  choice = "- 2 : Substraction";
                     break;
            case 3:  choice = "- 3 : Divide";
                     break;
            case 4:  choice = "- 4 : Multiplication";
                     break;
            case 5:  choice = "- 5 : Display History";
                     break;
            case 9:  choice = "- 9 : Quit";
                     break;
            default: choice = "Invalid choice";
                     break;
        }
        System.out.println(choice);
    }

}
