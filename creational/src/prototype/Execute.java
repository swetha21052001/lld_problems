package prototype;

public class Execute {
    public static void main(String[] args){
        Prototype prototype1 = new PrototypeImpl("Hello");
        Prototype prototype2 = prototype1.clone();
        prototype1.printMessage();
        prototype2.printMessage();
    }
}
