package prototype;

public class PrototypeImpl implements Prototype{
    private String message;
    public PrototypeImpl(String message){
        this.message = message;
    }

    @Override
    public Prototype clone() {
        return new PrototypeImpl(this.message);
    }

    public void printMessage(){
        System.out.println(this.message);
    }
}
