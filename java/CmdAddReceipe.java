public class CmdAddReceipe implements Command{
    @Override
    public void execute(String[] cmdParts) {
        try{
            Kitchen k = Kitchen.getInstance();
            
            if (k.foodExist(cmdParts[1])){
                throw new ExFoodNameExist();
            }

            k.addReceipe(new Food(cmdParts[1], cmdParts[2], cmdParts[3]));

            System.out.println("Done");
        }
        catch (ExFoodNameExist e){
            System.out.println(e.getMessage() + cmdParts[1]);
        }
        
    }
    
}
