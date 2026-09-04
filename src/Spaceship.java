package src;
import java.util.ArrayList;
import java.util.List;

import src.modules.BaseModule;
import src.modules.GunPlatform;
import src.modules.Storage;

public class Spaceship implements Commandable {
    private final ArrayList<String> COMMANDS = new ArrayList<String>(
        List.of("warp", "fly", "inspect")
    );

    public final ArrayList<ArrayList<BaseModule>> modules = new ArrayList<>(
        List.of(
            new ArrayList<>(
                List.of(new GunPlatform(), new Storage())
            )
        )
    );

    public int WIDTH = 1;
    public int HEIGHT = 2;

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
        Utils.typeln("It is your spaceship.\n");
        for(int y = 0; y < HEIGHT; y ++){

            if(modules.get(0).get(y) != null){
                    Utils.type("|");
                }else{
                    Utils.type(" ");
            }

            for(int x = 0; x < WIDTH; x ++){
                if(modules.get(x).get(y) != null){
                    Utils.type(modules.get(x).get(y).getChar() + "|");
                }else{
                    Utils.type(" |");
                }
            }
        }
        Utils.typeln("");

    }
}
