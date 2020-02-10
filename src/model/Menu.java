package model;

import Services.CommandService;
import Services.InputService;
import Services.OutputService;


public class Menu {

    private CommandService commandService = new CommandService();

    public Menu() {
        commandService.registerCommand("light on", new LightOnCommand());
        commandService.registerCommand("light off", new LightOffCommand());
        commandService.registerCommand("lock doors", new LockDoorsCommand());
        commandService.registerCommand("unlock doors", new UnlockDoorsCommand());
        commandService.registerCommand("exit", new Exit());
    }

    public void showMenu() {
        while (true) {
            OutputService.output("Select an action");
            OutputService.output("===============================================================================");
            String command = InputService.input("(Light on, Light off, Lock doors, Unlock doors, Exit)\n\n\n");
            try {
                commandService.execute(command.toLowerCase());
            } catch (NullPointerException e) {
                OutputService.output("Wrong command. Please try again.");
            }
        }
    }
}
