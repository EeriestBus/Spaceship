package src;

import java.math.BigDecimal;

import src.ResourceHandler;
import src.materials.Resource;

public class Main{
    public static void main(String[] args){
        ResourceHandler r = new ResourceHandler(Units.MetersCubed.of(1));

        new Game();
    }
}
