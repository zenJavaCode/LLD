package stretagyPattern;

public class SpecialStretagy implements DriveStretagy {

    @Override
    public void drive() {
        System.out.println("Using special Stretagy");
    }

    @Override
    public void startEngine() {
        System.out.println("Using push button  to start engine ");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("using turbo accelerator to speed up");
    }

    @Override
    public void brake() {
        System.out.println("using disk Break to reduce the speed.");
    }


}
