package sml;

/**
 * This class represents the Sub instruction from the language.
 *
 * @author caleif01
 */

public class SubInstruction extends Instruction{

    private int result;
    private int op1;
    private int op2;

    /**
     * Constructor: an instruction with label l and opcode op
     * (op must be an operation of the language)
     *
     * @param l  label
     * @param op operand
     */
    public SubInstruction(String l, String op) {
        super(l, op);
    }

    /**
     * @param label of the instruction
     * @param result of the computation
     * @param op1 the first operand
     * @param op2 the second operand
     */
    public SubInstruction(String label, int result, int op1, int op2) {
        this(label, "sub");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    /**
     * Execute the instruction, probably modifying the registers.
     *
     * @param m the machine under which the instruction executes
     */
    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 - value2);
    }

    /**
     * String representation of the instruction
     *
     * @return representation of the operands and result
     */
    @Override
    public String toString() {
        return super.toString() + " " + op1 + " - " + op2 + " to " + result;
    }
}
