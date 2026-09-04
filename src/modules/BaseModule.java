package src.modules;

import src.Commandable;

public abstract class BaseModule implements Commandable{

    /**
     * print out information to the user
     */
    public abstract void inspect();

    /**
     * print character that shows up when ship is printed
     */
    public abstract char getChar();
}
