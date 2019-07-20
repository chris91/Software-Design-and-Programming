package sml;

/**
 * The Print to console Instruction class
 * @author caleif01
 */

public class OutInstruction extends Instruction{
    private int register;

    /**
     *
     * @param label
     * @param opcode
     */
    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    /**
     * Initialise the instruction
     *
     * @param label of the instruction
     * @param register to print to the console
     */
    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;

    }

    /**
     * Execute the instruction in the context of the Machine
     * @param m the machine
     */
    @Override
    public void execute(Machine m) {
        int value = m.getRegisters().getRegister(register);
        this.print(value);
    }

    /**
     * String representation of the instruction
     * @return incorporating the value
     */
    @Override
    public String toString() {
        return super.toString() + " register " + register;
    }

    /**
     * Prints to the console the contents of this register
     * @param value
     */
    public void print(int value){
        System.out.println("Register " + register + " has value " + value);
    }
}
