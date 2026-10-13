package src.modules;

import java.util.ArrayList;
import java.util.List;

import src.ResourceHandler;
import src.Units;
import src.Units.Volume;

public class Storage extends BaseModule {
    private final ArrayList<String> COMMANDS = new ArrayList<>(
            List.of("inspect", "deposit materials", "move materials"));

    ResourceHandler resourceHandler;

    public Storage(Volume maxVolume) {
        this.resourceHandler = new ResourceHandler(maxVolume);
    }

    public void depositMaterials() {

    }

    public void moveMaterials() {
        // move to storage or airlock
    }

    @Override 
    public void runCommand(String command) {
        switch (command) {
            case "inspect" -> inspect();
            case "deposit materials" -> depositMaterials();
            case "move materials" -> moveMaterials();
        }
    }

    @Override 
    public ArrayList<String> getCommands() {
        return COMMANDS;
    }

    @Override 
    public void inspect() {
        // give info about the platform and the gun object it has
    }

    @Override 
    public String snippet(String coord) {
        // TODO temporary
        return '\"' + coord + "\": A storage container located at " + coord;
    }

    @Override 
    public boolean contains(String command) {
        return getCommands().contains(command);
    }

    public char getChar() {
        return 'O';
    }
}
