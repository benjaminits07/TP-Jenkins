package com.imie.tp.calculator.operation;

/**
 *
 * @author benjamin
 *
 */
public interface OperationCommand {

	/**
	 *
	 * @param value
	 */
    void make(float value);

    /**
     *
     * @return
     */
    float getCurrentValue();
}
