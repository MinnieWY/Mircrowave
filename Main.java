import java.util.*;

public class Main {
    public static void  main(String []args) throws ExMicrowaveInUse, ExMicrowaveNotExist, ExFoodCanNotBeHeated, ExMicrowaveIDExist{
        System.out.println("Welcome to the Kitchen\n");

        Kitchen kitchen = Kitchen.getInstance();

        Scanner in = new Scanner(System.in);

        boolean flag = true;

        while (flag == true){
            System.out.println("Please enter the action you wanted to carry out: ");

            String cmdLine = in.nextLine();
            String[] cmdParts = cmdLine.split(" ");

            if (cmdParts[0].equals("addMicrowave")){
                new CmdAddMicrowave().execute(cmdParts);
            }
            if (cmdParts[0].equals("addReceipe")){
                new CmdAddReceipe().execute(cmdParts);
            }
            if (cmdParts[0].equals("listMicrowave")){
                new CmdListMicrowave().execute(cmdParts);
            }
            if (cmdParts[0].equals("listReceipe")){
                new CmdListReceipe().execute(cmdParts);
            }
            if (cmdParts[0].equals("heat")){
                new CmdHeating().execute(cmdParts);
            }
            if (cmdParts[0].equals("takeout")){
                new CmdOpenDoor().execute(cmdParts);
            }
            if (cmdParts[0].equals("exit")){
                flag = false;
            }
            
        }
        in.close();
    }
}
