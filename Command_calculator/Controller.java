package Command_calculator;

public class Controller {

    private AbstractCommand addCommand,subtractCommand,multiplyCommand,divideCommand;

    public Controller(AbstractCommand addCommand,AbstractCommand subtractCommand,AbstractCommand multiplyCommand,
                      AbstractCommand divideCommand){
        this.addCommand = addCommand;
        this.subtractCommand = subtractCommand;
        this.multiplyCommand = multiplyCommand;
        this.divideCommand = divideCommand;
    }

    public void add(){
        addCommand.execute();
    }

    public void subtract(){
        subtractCommand.execute();
    }

    public void multiply(){
        multiplyCommand.execute();
    }

    public void divide(){
        divideCommand.execute();
    }

}
