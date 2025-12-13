package facade;

public class FacadeClass {
    //Declare many classes
    public void runCLass(){
        try {
            //call many classes and are complex
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
