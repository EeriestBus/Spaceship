package src.modules;

import java.util.ArrayList;
import java.util.List;

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
        ArrayList<String> array = new ArrayList<>();

        for(String s : COMMANDS){
            array.add(s);
        }
        
        return array;
    }

    public void inspect(){
        //give info about the platform and the gun object it has
    }

    public String snippet(String coord){
        //TODO temporary
        return '\"' + coord + "\": A gun platform with a railgun, located at " + coord;
    }

    public boolean contains(String command){
        return getCommands().contains(command);
    }
    
    public char getChar(){
        return '*';
    }
}
