import java.util.ArrayList;

public class Club {
    String name;
    ArrayList<Runner> runners;

    public Club(){}


    public Club(String name, ArrayList<Runner> runners){
        this.name = name;
        this.runners = runners;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Runner> getRunners() {
        return runners;
    }

    public void setRunners(ArrayList<Runner> runners) {
        this.runners = runners;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", runners=" + runners +
                '}';
    }
}
