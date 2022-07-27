import java.lang.annotation.Target;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {

        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.SUM);

        int result = (int) formula.result();

        return result;
    }

    @Override
    public int mult(int arg0, int arg1) {

        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.MULT);

        int result = (int) formula.result();

        return result;

    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(a);
        formula.addOperand(b);
        formula.calculate(Calculator.Operation.POW);

        int result = (int) formula.result();

        return result;
    }
}