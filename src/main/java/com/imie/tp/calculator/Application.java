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

        int choice;
        switch (value) {
            case 1: String a = KeyboardUtils.readFromKeyboard("Enter value a :");
        			int aa = Integer.parseInt(a);
        			String b = KeyboardUtils.readFromKeyboard("Enter value b :");
                	int bb = Integer.parseInt(b);
                	choice = aa + bb;
                     break;
            case 2:  String c = KeyboardUtils.readFromKeyboard("Enter value a :");
					 int cc = Integer.parseInt(c);
					 String d = KeyboardUtils.readFromKeyboard("Enter value b :");
		        	 int dd = Integer.parseInt(d);
		        	 choice = cc - dd;
                     break;
            case 3:  String e = KeyboardUtils.readFromKeyboard("Enter value a :");
			 		 int ee = Integer.parseInt(e);
			 		 String f = KeyboardUtils.readFromKeyboard("Enter value b :");
			 		 int ff = Integer.parseInt(f);
			 		 choice = ee / ff;
                     break;
            case 4:  String g = KeyboardUtils.readFromKeyboard("Enter value a :");
			 		 int gg = Integer.parseInt(g);
			 		 String h = KeyboardUtils.readFromKeyboard("Enter value b :");
			 		 int hh = Integer.parseInt(h);
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
