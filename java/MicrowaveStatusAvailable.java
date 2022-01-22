public class MicrowaveStatusAvailable implements MicrowaveStatus{
private boolean door;

    @Override
    public String getStatus() {
        return "Available";
    }

    @Override
    public String getDescription() {
        return "Available";
    }

    @Override
    public boolean doorCanBeOpened() {
        return this.door;
    }

    public MicrowaveStatusAvailable(){
        this.door = true;
    }

}
