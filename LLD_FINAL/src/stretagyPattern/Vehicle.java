package stretagyPattern;

public class Vehicle {
    DriveStretagy driveStretagyObj;
    // this is known as constructor injection.
    public Vehicle(DriveStretagy driveStretagyObj){
        this.driveStretagyObj = driveStretagyObj;
    }
    public void drive(){
        driveStretagyObj.drive();
    }
}
