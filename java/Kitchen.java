import java.util.*;
public class Kitchen {
    private ArrayList <Microwave> allMicrowaves;
    private ArrayList <Food> allFood;

    private static Kitchen instance = new Kitchen();

    private Kitchen(){
        allMicrowaves = new ArrayList<>();
        allFood = new ArrayList<>();
    }

    public static Kitchen getInstance(){
        return instance;
    }

    public void listReceipe(){
        System.out.println(Food.getListingHeader());
        for (Food f : allFood){
            System.out.println(f.toString());
        }
    }

    public void listMicrowave(){
        System.out.println(Microwave.getListingHeader());
        for (Microwave m : allMicrowaves){
            System.out.println(m.toString());
        }
    }

    public void addMicrowave(Microwave m){
        this.allMicrowaves.add(m);
    }

    public void removeMicrowave(Microwave m){
        this.allMicrowaves.remove(m);
    }

    public boolean MicrowaveExist(String id){
        for (Microwave m : allMicrowaves){
            if (m.getID().equals(id)){
                return true;
            }
        }
        return false;
    }

    public Microwave findMicrowave(String id){
        for (Microwave m : allMicrowaves){
            if (m.getID().equals(id)){
                return m;
            }
        }
        return null;
    }

    public boolean MicrowaveInUse(Microwave m){
        if (m.getStatus().equals("Available")){
            return false;
        }
        else{
            return true;
        }
    }

    public Food findFood(String name){
        for (Food f: allFood){
            if (f.getName().equals(name)){
                return f;
            }
        }
        return null;
    }

    public boolean foodExist(String name){
        for (Food f: allFood){
            if (f.getName().equals(name)){
                return true;
            }
        }
        return false;
    }


    public boolean CanbeHeated(Food f){
        if (f.hasShell()==true | f.hasSkin()==true){
            return false;
        }
        else{
            return true;
        }
    }

    public void addReceipe(Food f){
        allFood.add(f);
    }

    public void removeReceipe(Food f){
        allFood.remove(f);
    }
}
