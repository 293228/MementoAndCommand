package Command_calculator;

public class AddCommend implements AbstractCommand{

    private Calculator calc;

    public AddCommend(){
        calc = new Calculator();
    }
    @Override
    public void execute() {
        calc.add();
    }
}
