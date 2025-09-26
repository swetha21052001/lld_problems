package singleton;

public class Logging {
    private static Logging instance;
    private Logging(){
    }

    //Thread Safe Method
    public static synchronized Logging getInstance(){
        if(instance == null){
            instance = new Logging();
        }
        return instance;

    }

    public void printAns(String answer){
        System.out.println(answer);
    }

}
