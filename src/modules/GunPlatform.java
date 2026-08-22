package src.modules;

import java.util.ArrayList;
import java.util.List;

import src.Utils;

public class GunPlatform extends BaseModule {
    private final ArrayList<String> COMMANDS = new ArrayList<>(
        List.of("inspect", "add gun", "remove gun")
    );

    public GunPlatform(){

    }

    public void addGun(){
        //ask the user then add that gun. prompt a confirm if they already have a gun there
    }

    public void removeGun(){
        //remove the gun
    }

    public void runCommand(String command){
        switch (command) {
            case "inspect" -> inspect();
            case "add gun" -> addGun();
            case "remove gun" -> removeGun();
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
