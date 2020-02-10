package model;

import Services.OutputService;

public class LockDoorsCommand implements ICommand{
    @Override
    public void execute() {
        OutputService.output("Doors is locked");
    }
}
