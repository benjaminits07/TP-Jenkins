/**
 * @author benjamin
 */
package com.imie.tp.calculator.operation;

/**
 *
 * @author benjamin
 *
 */
public abstract class OperationCommandBase implements OperationCommand {
	/**
	 *
	 */
    public float currentValue = 10;

    /**
     *
     * @param baseValue
     */
    public OperationCommandBase(float baseValue) {
        this.currentValue = baseValue;
    }

}
