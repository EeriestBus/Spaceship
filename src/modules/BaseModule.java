package src.modules;

import java.util.ArrayList;
import src.Commandable;

public abstract class BaseModule implements Commandable{

    /**
     * print out information to the user
     */
    public abstract void inspect();
}
