public class Food {
    private String name;
    private boolean shell;
    private boolean skin;

    public Food(String name, String l, String k){
        this.name = name;
        if (l == "y"){
            this.shell = true;
        }
        if (k == "y"){
            this.skin = true;
        }
    }

    public String getName(){
        return this.name;
    }

    public boolean hasShell(){
        return this.shell;
    }

    public boolean hasSkin(){
        return this.skin;
    }

    public static String getListingHeader() {
        return String.format("%-5s %s %s", "Name", "Shell", "Skin");
    }

    @Override
    public String toString(){
        return String.format("%-5s %s %s", name, shell, skin);
    }

}
