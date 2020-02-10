package model;

import Services.OutputService;

public class LightOffCommand implements ICommand {
    @Override
    public void execute() {
        OutputService.output("Light switched off");
    }
}
