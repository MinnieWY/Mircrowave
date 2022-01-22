public class ExMicrowaveInUse extends Exception {
    public ExMicrowaveInUse(){
        super("The Microwave is not available.");
    }

    public ExMicrowaveInUse(String message) {
        super(message);
    }
}
