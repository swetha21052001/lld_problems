package singleton;

public class Execution {
    public static void main(String[] args){
        Logging logger = Logging.getInstance();
        logger.printAns("Hello");
    }
}
