package sml;

/**
 * The instruction to move to another statement
 * @author caleif01
 */

public class BnzInstruction extends Instruction{

    private int register;
    private String newLabel;

    /**
     *
     * @param label
     * @param opcode
     */
    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    /**
     * Initialise the instruction
     *
     * @param label of the instruction
     * @param register to work with
     * @param newLabel to go
     */
    public BnzInstruction(String label, int register, String newLabel) {
        super(label, "bnz");
        this.register = register;
        this.newLabel = newLabel;

    }

    /**
     * Execute the instruction in the context of the Machine
     * @param m the machine
     */
    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(register) != 0){
            int newPc = m.getLabels().indexOf(newLabel);
            m.setPc(newPc);
        }
    }

    /**
     * String representation of the instruction
     * @return incorporating the value
     */
    @Override
    public String toString() {
        return super.toString() + " register " + register + " label to go next " + newLabel;
    }
}
