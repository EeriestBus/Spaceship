import java.util.ArrayList;
import java.util.List;

public class CommandHandler {
    private Game game;

    public CommandHandler(Game game){
        this.game = game;
    }


    private final ArrayList<String> COMMANDS = new ArrayList<String>(
        List.of("help")
    );

    public ArrayList<String> getCommands(){
        return this.COMMANDS;
    }

    public ArrayList<String> getAllCommands(){
        //TODO
        return this.COMMANDS;
    }

    public void handle(String command){
        //TODO
        switch (command) {
            case "help" -> help();
        }
    }

    public void help(){
        Utils.typeln("The valid commands availible are: " + getAllCommands());
    }
}
