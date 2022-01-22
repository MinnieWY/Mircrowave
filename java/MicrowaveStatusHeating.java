public class MicrowaveStatusHeating implements MicrowaveStatus{

    private boolean door;
    private Food food;

    @Override
    public String getStatus() {
        return "Heating";
    }

    public MicrowaveStatusHeating(Food f){
        this.door = false;
        this.food = f;
    }
    
    public Food getFood(){
        return food;
    }

    @Override
    public String getDescription() {
        return "Heating" + food;
    }

    @Override
    public boolean doorCanBeOpened() {
        return this.door;
    }

    
}
