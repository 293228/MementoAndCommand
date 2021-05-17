package Command_calculator;

public class DivideCommand implements AbstractCommand{

    private Calculator calc;

    public DivideCommand(){
        calc = new Calculator();
    }

    @Override
    public void execute() {
        calc.divide();
    }
}
