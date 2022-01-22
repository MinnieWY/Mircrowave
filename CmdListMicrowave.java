public class CmdListMicrowave implements Command {
    @Override
    public void execute(String[] cmdParts)  {
        Kitchen k = Kitchen.getInstance();
        k.listMicrowave();
        System.out.println("Done");
    }

}
