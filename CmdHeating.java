public class CmdHeating implements Command{
    @Override
    public void execute(String[] cmdParts) {
        try {
            Kitchen k = Kitchen.getInstance();

            if (k.MicrowaveExist(cmdParts[1])==false){
                throw new ExMicrowaveNotExist();
            }
    
            Microwave m = k.findMicrowave(cmdParts[1]);
            
            if (k.MicrowaveInUse(m)== true){
                throw new ExMicrowaveInUse();
            }
    
            Food f = k.findFood(cmdParts[2]);
    
            if (k.CanbeHeated(f)==false){
                throw new ExFoodCanNotBeHeated();
            }
    
            m.setStatus(new MicrowaveStatusHeating(f));
    
            System.out.println("Done");
        }
        catch (ExMicrowaveNotExist e){
            System.out.println(e.getMessage() + cmdParts[1]);
        }
        catch (ExMicrowaveInUse e){
            System.out.println(e.getMessage());
        }
        catch (ExFoodCanNotBeHeated e){
            System.out.println(cmdParts[2] + e.getMessage());
        }

    }

}
