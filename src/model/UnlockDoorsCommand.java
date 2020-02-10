package model;

import Services.OutputService;

public class UnlockDoorsCommand implements ICommand {
    @Override
    public void execute() {
        OutputService.output("Doors unlocked");
    }
}
