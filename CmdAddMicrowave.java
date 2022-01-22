public class CmdAddMicrowave implements Command {
    @Override
    public void execute(String[] cmdParts){
        try {
            Kitchen k = Kitchen.getInstance();
        
            if (k.MicrowaveExist(cmdParts[1])== true){
                throw new ExMicrowaveIDExist();
            }
            
            k.addMicrowave(new Microwave(cmdParts[1]));
            
            System.out.println("Done");
        }
        catch (ExMicrowaveIDExist e){
            System.out.println(e.getMessage() + cmdParts[1]);
        }
        
    }

}
