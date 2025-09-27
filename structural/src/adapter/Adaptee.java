package adapter;

public class Adaptee {
    private String message;
    private int usd;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUsd() {
        return usd;
    }

    public void setUsd(int usd) {
        this.usd = usd;
    }

    @Override
    public String toString() {
        return "Adaptee{" +
                "message='" + message + '\'' +
                ", usd=" + usd +
                '}';
    }
}
