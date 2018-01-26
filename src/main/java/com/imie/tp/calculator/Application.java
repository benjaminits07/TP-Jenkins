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

    	final String saisie = KeyboardUtils.readFromKeyboard("Votre choix :");
    	final int value = Integer.parseInt(saisie);

        int choice;
        switch (value) {
            case 1: final String a = KeyboardUtils.readFromKeyboard("Enter value a :");
        			final int aa = Integer.parseInt(a);
        			final String b = KeyboardUtils.readFromKeyboard("Enter value b :");
                	final int bb = Integer.parseInt(b);
                	choice = aa + bb;
                     break;
            case 2:  final String c = KeyboardUtils.readFromKeyboard("Enter value a :");
					 final int cc = Integer.parseInt(c);
					 final String d = KeyboardUtils.readFromKeyboard("Enter value b :");
		        	 int dd = Integer.parseInt(d);
		        	 choice = cc - dd;
                     break;
            case 3:  final String e = KeyboardUtils.readFromKeyboard("Enter value a :");
			 		 final int ee = Integer.parseInt(e);
			 		 final String f = KeyboardUtils.readFromKeyboard("Enter value b :");
			 		 int ff = Integer.parseInt(f);
			 		 choice = ee / ff;
                     break;
            case 4:  final String g = KeyboardUtils.readFromKeyboard("Enter value a :");
			 		 final int gg = Integer.parseInt(g);
			 		 final String h = KeyboardUtils.readFromKeyboard("Enter value b :");
			 		 final int hh = Integer.parseInt(h);
			 		 choice = gg * hh;
                     break;
            case 5:  choice = 5;
                     break;
            case 9:  choice = 6;
                     break;
            default: choice = 12;
                     break;
        }
        System.out.println(choice);
    }

}
