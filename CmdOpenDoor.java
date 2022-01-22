public class CmdOpenDoor implements Command {

    @Override
    public void execute(String[] cmdParts) {
        try{
            Kitchen k = Kitchen.getInstance();

            if (k.MicrowaveExist(cmdParts[1])==false){
                throw new ExMicrowaveNotExist();
            }

            Microwave m = k.findMicrowave(cmdParts[1]);

            if (k.MicrowaveInUse(m)==true){
                throw new ExMicrowaveInUse();
            }

        }
        catch (ExMicrowaveNotExist | ExMicrowaveInUse e){
            System.out.println(e.getMessage() + cmdParts[1]);
        }
    }

}
