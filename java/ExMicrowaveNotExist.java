public class ExMicrowaveNotExist extends Exception {
    public ExMicrowaveNotExist(){
        super("The Microwave is not exist.");
    }

    public ExMicrowaveNotExist (String message) {
        super(message);
    }
}
