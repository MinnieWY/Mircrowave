public class ExFoodCanNotBeHeated extends Exception {
    public ExFoodCanNotBeHeated(){
        super(" cannot be put into the microwave.");
    }

    public ExFoodCanNotBeHeated (String message) {
        super(message);
    }
}
