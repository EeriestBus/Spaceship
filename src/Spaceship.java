package src;
import java.util.ArrayList;
import java.util.List;

import src.modules.BaseModule;
import src.modules.GunPlatform;
import src.modules.Storage;

/**
 * Your spaceship
 */
public class Spaceship {
    public final ArrayList<ArrayList<BaseModule>> modules = new ArrayList<>(
        List.of(
            new ArrayList<>(
                List.of(new GunPlatform(), new Storage(Units.MetersCubed.of(10.0)))
            )
        )
    );

    public int WIDTH = 1;
    public int HEIGHT = 2;
}
