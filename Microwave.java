public class Microwave {
    private String id;
    private boolean open;
    private MicrowaveStatus status;

    public Microwave(String id){
        this.id = id;
        this.open = false;
        this.status = new MicrowaveStatusAvailable();
    }

    public String getID(){
        return id;
    }

    public boolean isOpen(){
        return this.open;
    }

    public static String getListingHeader() {
        return String.format("%-5s%-17s  ", "ID", "Status");  
    }

    @Override
    public String toString(){
        return String.format("%-5s%-17s  ", id, getStatusDescription());
    }

    private String getStatusDescription() {
        return status.getDescription();
    }

    public String getStatus(){
        return status.getStatus();
    }

    public void setStatus(MicrowaveStatus status){
        this.status = status;
    }

}
