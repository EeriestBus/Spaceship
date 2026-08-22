package src;

public class Game {
    public CommandHandler commandHandler = new CommandHandler(this);
    public Spaceship spaceship = new Spaceship();
    public final String intro = "\nWelcome to the game.";

    public Game() {
        Utils.type(intro);
        loop();
    }

    public Game(String saveData) {
        loop();
    }

    // todo make this safer
    int i = 0;

    public void loop() {
        Utils.type("\nWhat would you like to do? ");
        String input = Utils.readNext();

        if (commandHandler.getAllCommands().contains(input)) {
            commandHandler.handle(input);
        } else {
            Utils.typeln("Unfortunately, \"" + input
                    + "\" is not a valid command. Type \"help\" for the list of valid commands.");
        }

        i++;
        if (i > 1000) {
            return;
        }

        loop();
    }
}
