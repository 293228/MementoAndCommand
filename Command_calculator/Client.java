package Command_calculator;

public class Client {

    public static void main(String[] args) {

        AbstractCommand addCommand,subtractCommand,multiplyCommand,divideCommand;

        addCommand = new AddCommend();
        subtractCommand = new SubtractCommand();
        multiplyCommand = new MultiplyCommand();
        divideCommand = new DivideCommand();

        Controller control = new Controller(addCommand,subtractCommand,multiplyCommand,divideCommand);

        control.add();
        control.subtract();
        control.multiply();
        control.divide();

    }

}
