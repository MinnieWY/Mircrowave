public class ExFoodNameExist extends Exception{
    public ExFoodNameExist(){
        super("The Food name has been existed: ");
    }

    public ExFoodNameExist(String message) {
        super(message);
    }
}
