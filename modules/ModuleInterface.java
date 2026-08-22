package modules;

import java.util.ArrayList;

public interface ModuleInterface {

    /**
     * @param command A string that represents a command that the user inputted. Use switch case.
     */
    void runCommand(String command);

    /**
     * @return all commands that the user can input to get 
     */
    ArrayList<String> getCommands();

    /**
     * print out information to the user
     */
    void inspect();
}
