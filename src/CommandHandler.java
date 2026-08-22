package src;

import java.util.ArrayList;
import java.util.List;

import src.Utils.Pair;
import src.modules.BaseModule;

public class CommandHandler implements Commandable {
    private Game game;

    public CommandHandler(Game game) {
        this.game = game;
    }

    private final ArrayList<String> COMMANDS = new ArrayList<String>(
            List.of("help"));

    public ArrayList<String> getCommands() {
        return this.COMMANDS;
    }

    public ArrayList<String> getAllCommands() {
        ArrayList<String> allCommands = new ArrayList<>();
        allCommands.addAll(COMMANDS);
        allCommands.addAll(game.spaceship.getCommands());
        for (ArrayList<BaseModule> column : game.spaceship.modules) {
            for (BaseModule module : column) {
                if (module != null) {
                    allCommands.addAll(module.getCommands());
                }
            }
        }

        return allCommands;
    }

    public void handle(String command) {

        ArrayList<Pair<Commandable, String>> containers = new ArrayList<>();

        if (this.contains(command)) {
            containers.add(new Pair<>(this, "system"));
        }
        if (game.spaceship.contains(command)) {
            containers.add(new Pair<>(this.game.spaceship, "ship"));
        }
        for (int column = 0; column < game.spaceship.modules.size(); column++) {
            for (int row = 0; row < game.spaceship.modules.get(column).size(); row++) {
                BaseModule module = game.spaceship.modules.get(column).get(row);
                if (module != null) {
                    if (module.contains(command)) {
                        containers.add(new Pair<>(module, "(" + column + "," + row + ")"));
                    }
                }
            }
        }

        if (containers.size() == 1 && (containers.get(0).one.getClass().equals(CommandHandler.class))) {
            containers.get(0).one.runCommand(command);
        } else if (containers.size() >= 1) {
            Utils.typeln("");
            for (Pair<Commandable, String> pair : containers) {
                Utils.typeln(pair.one.snippet(pair.two));
            }
            Utils.typeln("\nWhat do you want to \"" + command + "\"? ");
            String answer = Utils.readNext();

        } else {
            System.out.println("error: no legal object for command to run on");
        }
    }

    public String snippet(String key) {
        return "\"" + key + "\": system";
    }

    public boolean contains(String command) {
        return getCommands().contains(command);
    }

    public void runCommand(String command) {
        switch (command) {
            case "help" -> help();
        }
    }

    public void help() {
        Utils.typeln("The valid commands availible are: " + getAllCommands());
    }

}
