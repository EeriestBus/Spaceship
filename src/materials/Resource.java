package src.materials;

import src.Units.*;
import static src.Units.KilogramsPerMeterCubed;

import src.Units;

public class Resource {
    private Volume volume;
    public final String name;
    private final Density density;
    private final Volume smallestUnit;

    private Resource(String name, Density density, Volume volume, Volume smallestUnit) {
        this.name = name;
        this.density = density;
        this.volume = inSmallestUnits(volume, smallestUnit);
        this.smallestUnit = smallestUnit;
    }

    public static Volume inSmallestUnits(Volume volume, Volume smallestUnit){
        return Units.MetersCubed.of(volume.in(Units.MetersCubed) - volume.in(Units.MetersCubed) % smallestUnit.in(Units.MetersCubed));
    }

    private Resource(String name, Density density, Volume volume) {
        this(name, density, volume, Units.MillimetersCubed.of(0.001));
    }

    public Resource(Resource resource){
        this(resource.name, resource.density, new Volume(resource.volume), resource.smallestUnit);
    }

    public Volume getVolume(){
        return this.volume;
    }

    public Volume getSmallestUnit(){
        return new Volume(smallestUnit);
    }

    public void addVolume(Volume toAdd){
        this.volume = inSmallestUnits(this.volume.plus(toAdd), getSmallestUnit());
    }

    public Resource withVolume(Volume vol){
        this.volume = inSmallestUnits(vol, getSmallestUnit());
        return this;
    }

    public static Resource Ice(Volume volume) {
        return new Resource("ice", KilogramsPerMeterCubed.of(917.0), volume);
    }
    public static Resource Water(Volume volume) {
        return new Resource("water", KilogramsPerMeterCubed.of(1000.0), volume);
    }
    public static Resource Gold(Volume volume) {
        return new Resource("gold", KilogramsPerMeterCubed.of(19320.0), volume);
    }
    public static Resource Cobalt(Volume volume) {
        //magnets, batteries
        return new Resource("cobalt", KilogramsPerMeterCubed.of(19320.0), volume);
    }
    public static Resource Platinum(Volume volume) {
        //"Speeds up petroleum refining and nitric acid creation", lab equipment
        return new Resource("platinum", KilogramsPerMeterCubed.of(19320.0), volume);
    }
    public static Resource Palladium(Volume volume) {
        //capacitors, electronics
        return new Resource("palladium", KilogramsPerMeterCubed.of(19320.0), volume);
    }
    public static Resource Silver(Volume volume) {
        return new Resource("silver", KilogramsPerMeterCubed.of(10490.0), volume);
    }
    public static Resource Aluminum(Volume volume) {
        return new Resource("aluminum", KilogramsPerMeterCubed.of(2700.0), volume);
    }
    public static Resource Ammonia(Volume volume) {
        return new Resource("ammonia", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public static Resource Iron(Volume volume) {
        return new Resource("iron", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public static Resource Steel(Volume volume){
        return new Resource("steel", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public static Resource Nickel(Volume volume) {
        return new Resource("iron", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public static Resource Silicon(Volume volume) {
        return new Resource("silicon", KilogramsPerMeterCubed.of(0.77), volume);
    }
    public static Resource Copper(Volume volume) {
        return new Resource("copper", KilogramsPerMeterCubed.of(0.77), volume);
    }
}
