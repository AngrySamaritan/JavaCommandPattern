package model;

public class Exit implements ICommand {
    @Override
    public void execute() {
        System.exit(0);
    }
}
