public class CmdListReceipe implements Command {
    @Override
    public void execute(String[] cmdParts) {
            Kitchen k = Kitchen.getInstance();
            k.listReceipe();        
    }

}
