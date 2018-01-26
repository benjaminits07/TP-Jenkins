package com.imie.tp.calculator.utils;

import java.util.Locale;
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
        final Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.ENGLISH);

        System.out.println(displayAsk);

        //keyboard.close();

        return keyboard.nextLine();
    }
}
