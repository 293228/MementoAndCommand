package MementoAndCommand;

public class Controller {

    private AbstractCommand restoreCommand;

    public Controller(AbstractCommand restoreCommand){
        this.restoreCommand = restoreCommand;
    }

    public void restoreCommand(Memento m){
        restoreCommand.execute(m);
    }

}
