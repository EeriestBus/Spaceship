package src.modules;

import java.util.ArrayList;

public abstract class BaseModule {

    /**
     * @param command A string that represents a command that the user inputted. Use switch case.
     */
    public abstract void runCommand(String command);

    /**
     * @return all commands that the user can input to get 
     */
    public abstract ArrayList<String> getCommands();

    /**
     * print out information to the user
     */
    public abstract void inspect();

    /**
     * print out snippet of information
     */
    public abstract void snippet();
}
