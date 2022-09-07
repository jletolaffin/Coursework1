import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    String name;
    int age;
    int time;


    public Runner(String name, int age, int time){
        this.name = name;
        this.age = age;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public static ArrayList readInRunners(){
        ArrayList<Runner> runners = new ArrayList<>();

        try {

            File f = new File("runners.csv");
            Scanner myReader = new Scanner(f);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                String[] split = data.split(",");
                Runner temp = new Runner(split[0], Integer.parseInt(split[1].trim()), Integer.parseInt(split[2].trim()));
                runners.add(temp);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return runners;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", time=" + time +
                '}';
    }
}
