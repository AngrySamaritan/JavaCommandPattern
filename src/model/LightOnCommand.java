package model;

import Services.OutputService;

public class LightOnCommand implements ICommand {
    @Override
    public void execute() {
        OutputService.output("Light switched on");
    }
}
