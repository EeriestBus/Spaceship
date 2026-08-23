package src;

import java.util.function.Function;

import src.Units.Temperature;
import src.Units.Unit;
import src.Units.UnitType;
import src.Units.Volume;

public class Units {
    public static abstract class UnitType{
        protected double amount;

        public UnitType(double amount){
            this.amount = amount;
        }

        public double in(Unit<? extends UnitType> unit){
            return unit.convertFromBase(amount);
        }
    }

    public static class Unit<T extends UnitType>{
        private double addToBase;
        private double multiplyToBase;
        private Function<Double, T> supplier;

        private double convertToBase(double thisAmount){
            return thisAmount / multiplyToBase - addToBase;
        }
        private double convertFromBase(double baseAmount){
            return (baseAmount + addToBase) * multiplyToBase;
        }

        public Unit(Function<Double, T> supplier, double addToBase, double multiplyToBase){
            this.addToBase = addToBase;
            this.multiplyToBase = multiplyToBase;
            this.supplier = supplier;
        }

        public T of(double amount){
            return supplier.apply(convertToBase(amount));
        }

        public Unit(Function<Double, T> supplier, double multiplyToBase){
            this(supplier, 0, multiplyToBase);
        }
    }
    
    public static class Density extends UnitType{
        public Density plus(Density d){
            return new Density(this.amount + d.amount);
        }

        public Density minus(Density d){
            return new Density(this.amount + d.amount);
        }

        public Density(double amount){
            super(amount);
        }
    }
    public static class Volume extends UnitType{
        public Volume plus(Volume d){
            return new Volume(this.amount + d.amount);
        }

        public Volume minus(Volume d){
            return new Volume(this.amount + d.amount);
        }

        public Volume(double amount){
            super(amount);
        }
    }
    public static class Temperature extends UnitType{
        public Temperature plus(Volume d){
            return new Temperature(this.amount + d.amount);
        }

        public Temperature minus(Volume d){
            return new Temperature(this.amount + d.amount);
        }

        public Temperature(double amount){
            super(amount);
        }
    }
    public static class HeatCapacity extends UnitType{
        public HeatCapacity(double amount){
            super(amount);
        }
    }


    public static final Unit<Density> KilogramsPerMeterCubed = new Unit<>(Density::new, 1.0);
    public static final Unit<Volume> MetersCubed = new Unit<>(Volume::new, 1.0);
    public static final Unit<Temperature> Kelvin = new Unit<>(Temperature::new, 1.0);
    public static final Unit<HeatCapacity> JoulesPerKelvin = new Unit<>(HeatCapacity::new, 1.0);
}
