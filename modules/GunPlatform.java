package modules;

import java.util.ArrayList;

public class GunPlatform implements ModuleInterface {
    private final ArrayList<String> COMMANDS = new ArrayList<>();

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
}
