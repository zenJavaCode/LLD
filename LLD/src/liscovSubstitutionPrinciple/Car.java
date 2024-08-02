package liscovSubstitutionPrinciple;

public class Car extends EngineVehicles {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }

    @Override
    public Boolean hasEngine() {
        return true;
    }

}
