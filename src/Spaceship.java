package src;
import java.util.ArrayList;
import java.util.List;
import src.Commandable;

import src.modules.BaseModule;
import src.modules.GunPlatform;

public class Spaceship implements Commandable {
    private final ArrayList<String> COMMANDS = new ArrayList<String>(
        List.of("warp", "fly", "inspect")
    );

    public final ArrayList<ArrayList<BaseModule>> modules = new ArrayList<>(
        List.of(
            new ArrayList<>(
                List.of(new GunPlatform())
            )
        )
    );

    public ArrayList<String> getCommands(){
        return this.COMMANDS;
    }

    public boolean contains(String command){
        return getCommands().contains(command);
    }

    public String snippet(String key){
        return "\"" + key + "\": your spaceship";
    }

    public void runCommand(String command){
        switch (command) {
            case "warp" -> warp();
            case "fly" -> fly();
            case "inspect" -> inspect();
        }
    }

    public void fly(){

    }

    public void warp(){

    }

    public void inspect(){
        Utils.typeln("It is your spaceship.");
    }
}
