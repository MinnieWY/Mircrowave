public class ExMicrowaveIDExist extends Exception {
    public ExMicrowaveIDExist(){
        super("The Microwave ID has been existed: ");
    }

    public ExMicrowaveIDExist(String message) {
        super(message);
    }
}
