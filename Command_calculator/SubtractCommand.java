package Command_calculator;

public class SubtractCommand implements AbstractCommand{

    private Calculator calc;

    public SubtractCommand(){
        calc = new Calculator();
    }

    @Override
    public void execute() {
        calc.subtract();
    }
}
