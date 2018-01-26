package com.imie.tp.calculator.utils;

import java.util.Scanner;

/**
 *
 * @author benjamin
 *
 */
public final class KeyboardUtils {

	/**
	 *
	 * @param displayAsk
	 * @return
	 */
    public static String readFromKeyboard(String displayAsk) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(displayAsk);

        //keyboard.close();

        return keyboard.nextLine();
    }
}
