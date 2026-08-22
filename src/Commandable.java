package src;

import java.util.ArrayList;

public interface Commandable {
    /**
     * @param command
     * @return if this contains the command requested
     */
    public boolean contains(String command);

    /**
     * return a snippet for when there are naming conficts when commanding
     */
    public String snippet(String key);

    /**
     * @param command A string that represents a command that the user inputted. Use switch case.
     */
    public void runCommand(String command);

    /**
     * @return all commands that the user can input to get 
     */
    public ArrayList<String> getCommands();
}
