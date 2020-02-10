package Services;

import model.ICommand;

import java.util.HashMap;
import java.util.Map;

public class CommandService {

    private Map<String, ICommand> commandMap = new HashMap<>();

    public void registerCommand(String key, ICommand command) {
        commandMap.put(key, command);
    }

    public void execute(String commandKey) throws NullPointerException {
        ICommand command = commandMap.get(commandKey);
        command.execute();
    }

}
