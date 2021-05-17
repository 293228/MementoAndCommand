package Command_calculator;

public class MultiplyCommand implements AbstractCommand{

    private Calculator calc;

    public MultiplyCommand(){
        calc = new Calculator();
    }

    @Override
    public void execute() {
        calc.multiply();
    }
}
