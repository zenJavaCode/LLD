package dependencyInversion;

public class Macbook {
    private final  Mouse mouse;
    private  final Keyboard keyboard;

    public Macbook(Keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;

    }

    // TODO now these class are hard coded i.e. if we want to switch to bluetooth mouse and keyboard
    //  then i need to change the code base because of dependency on concreate classes.
    //   Inorder to avoid this we need to switch the dependency on Interfaces rather then concreate classes.
}
