package src.modules;

import java.util.ArrayList;
import java.util.List;

import src.ResourceHandler;

public class Storage extends BaseModule {
    private final ArrayList<String> COMMANDS = new ArrayList<>(
        List.of("inspect", "deposit materials", "move materials")
    );

    ResourceHandler resourceHandler;

    public Storage(){

    }

    public void depositMaterials(){

    }

    public void moveMaterials(){
        //move to storage or airlock
    }

    public void runCommand(String command){
        switch (command) {
            case "inspect" -> inspect();
            case "deposit materials" -> depositMaterials();
            case "move materials" -> moveMaterials();
        }
    }

    public ArrayList<String> getCommands(){
        return COMMANDS;
    }

    public void inspect(){
        //give info about the platform and the gun object it has
    }

    public String snippet(String coord){
        //TODO temporary
        return '\"' + coord + "\": A class-A gun platform with a railgun, located at " + coord;
    }

    public boolean contains(String command){
        return getCommands().contains(command);
    }
}
