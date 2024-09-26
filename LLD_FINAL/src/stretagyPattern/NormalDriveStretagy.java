package stretagyPattern;

public class NormalDriveStretagy implements DriveStretagy{
    @Override
    public void drive() {
        System.out.println("Using Normal drive Stretagy");
    }

    @Override
    public void startEngine() {
        System.out.println("Using key to start engine ");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("using normal accelerator to speed up");
    }

    @Override
    public void brake() {
        System.out.println("using normal Break to reduce the speed.");
    }

    public void clutch(){
        System.out.println("applying clutch before changing the gear.");
    }
}
