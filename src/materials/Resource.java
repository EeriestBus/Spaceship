package src.materials;

import src.Units.*;
import static src.Units.KilogramsPerMeterCubed;

public class Resource extends Material {
    private Volume volume;
    final String name;
    final Density density;

    private Resource(String name, Density density, Volume volume) {
        this.name = name;
        this.density = density;
        this.volume = volume;
    }

    public Volume getVolume(){
        return this.volume;
    }

    public Resource Ice(Volume volume) {
        return new Resource("ice", KilogramsPerMeterCubed.of(917.0), volume);
    }
    public Resource Water(Volume volume) {
        return new Resource("water", KilogramsPerMeterCubed.of(1000.0), volume);
    }
    public Resource Gold(Volume volume) {
        return new Resource("gold", KilogramsPerMeterCubed.of(19320.0), volume);
    }
    public Resource Cobalt(Volume volume) {
        //magnets, batteries
        return new Resource("cobalt", KilogramsPerMeterCubed.of(19320.0), volume);
    }
    public Resource Platinum(Volume volume) {
        //"Speeds up petroleum refining and nitric acid creation", lab equipment
        return new Resource("platinum", KilogramsPerMeterCubed.of(19320.0), volume);
    }
    public Resource Palladium(Volume volume) {
        //capacitors, electronics
        return new Resource("palladium", KilogramsPerMeterCubed.of(19320.0), volume);
    }
    public Resource Silver(Volume volume) {
        return new Resource("silver", KilogramsPerMeterCubed.of(10490.0), volume);
    }
    public Resource Aluminum(Volume volume) {
        return new Resource("aluminum", KilogramsPerMeterCubed.of(2700.0), volume);
    }
    public Resource Ammonia(Volume volume) {
        return new Resource("ammonia", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public Resource Iron(Volume volume) {
        return new Resource("iron", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public Resource Steel(Volume volume){
        return new Resource("steel", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public Resource Nickel(Volume volume) {
        return new Resource("iron", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public Resource Silicon(Volume volume) {
        return new Resource("silicon", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public Resource Copper(Volume volume) {
        return new Resource("copper", KilogramsPerMeterCubed.of(0.77), volume);
    }
}
