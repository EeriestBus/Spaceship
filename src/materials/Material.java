package src.materials;

import src.Units.Volume;

public abstract class Material {
    public abstract Volume getVolume();
    public abstract Volume getSmallestUnit();
    public abstract Volume getName();
}
