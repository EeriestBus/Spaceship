package src;
import java.util.ArrayList;
import java.util.List;

import src.modules.BaseModule;

public class Spaceship {
    private final ArrayList<String> COMMANDS = new ArrayList<String>(
        List.of("warp", "fly")
    );

    public final ArrayList<ArrayList<BaseModule>> modules = new ArrayList<>();

    public ArrayList<String> getCommands(){
        return this.COMMANDS;
    }
}
