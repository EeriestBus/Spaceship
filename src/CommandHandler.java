package src;
import java.util.ArrayList;
import java.util.List;

import src.modules.BaseModule;

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
        ArrayList<String> allCommands = new ArrayList<>();
        allCommands.addAll(COMMANDS);
        allCommands.addAll(game.spaceship.getCommands());
        for(ArrayList<BaseModule> row : game.spaceship.modules){
            for(BaseModule module : row){
                if(module != null){
                    allCommands.addAll(module.getCommands());
                }
            }
        }

        return allCommands;
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
