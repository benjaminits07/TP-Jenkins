/**
 * @author benjamin
 */


package com.imie.tp.calculator.operation;

/**
 * Command to Addition a value.
 */
public class AdditionOperation extends OperationCommandBase {

	/**
	 *
	 */
    protected float baseValue;

    /**
     *
     */
    protected float result = 0;
    /**
     * @param baseValue
     */
    public AdditionOperation(float baseValue) {
        super(baseValue);
        this.baseValue = baseValue;
    }
    /**
     *
     */
    @Override
    public void make(float value) {
        this.result = this.baseValue + value;
        this.getCurrentValue();
    }
    /**
     *
     */
    public float getCurrentValue() {
        return this.result;
    }

}