package adapter;

public class Adapter implements Target{
    private final Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;;
    }
    @Override
    public void onSuccess(String message, int usd) {
        adaptee.setMessage(message);
        adaptee.setUsd(usd);
        System.out.println(adaptee.toString());
    }
}
