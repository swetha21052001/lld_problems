package adapter;

public class AdapterExecute {
    public static void main(String[] args){
        Target target = new Adapter(new Adaptee());
        target.onSuccess("Adapter Pattern", 0);
    }
}
