package src;

import java.util.ArrayList;

import src.Units.Volume;
import src.materials.Material;

public class ResourceHandler {
    public Volume maxVolume;

    private String[] list;
    private boolean isBlacklist;

    private ArrayList<Material> materials;

    public ResourceHandler(Volume maxVolume){
        this.maxVolume = maxVolume;
        this.list = new String[0];
        this.isBlacklist = true;
    }

    public Material Deposit(Material material){
        
    }

    public ResourceHandler withList(boolean isBlacklist, String[] list){
        this.isBlacklist = isBlacklist;
        this.list = list;
        return this;
    }
}
