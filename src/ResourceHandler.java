package src;

import java.util.ArrayList;

import src.Units.Volume;
import src.materials.Resource;

public class ResourceHandler {
    public Volume maxVolume;

    private String[] list;
    private boolean isBlacklist;

    private ArrayList<Resource> resources;

    public ResourceHandler(Volume maxVolume){
        this.maxVolume = maxVolume;
        this.list = new String[0];
        this.isBlacklist = true;
    }

    //return the leftover
    public Resource Deposit(Resource resource){
        boolean deposited = false;
        Volume toDeposit = resource.getVolume();

        if(toDeposit.amount > remainingVolume().amount){
            toDeposit = Resource.inSmallestUnits(remainingVolume(), resource.getSmallestUnit());
        }

        Volume remaining = resource.getVolume().minus(toDeposit);

        for(Resource r : resources){
            if(r.name.equals(resource.name)){
                deposited = true;
                r.addVolume(toDeposit);
                break;
            }
        }

        if(deposited == false){
            resources.add(resource.withVolume(toDeposit));
        }

        return new Resource(resource).withVolume(remaining);
    }

    public ResourceHandler withList(boolean isBlacklist, String[] list){
        this.isBlacklist = isBlacklist;
        this.list = list;
        return this;
    }

    public Volume remainingVolume(){
        Volume remaining = new Volume(maxVolume);

        for(Resource r : resources){
            remaining = remaining.minus(r.getVolume());
        }
        
        return remaining;
    }
}
