import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
        printMenu();
        Scanner userInput = new Scanner(System.in);

        int choice = userInput.nextInt();
        ArrayList<Runner> runners = Runner.readInRunners();
        Club a = new Club();
        Scanner clubInput = new Scanner(System.in);


            switch (choice) {
                case 1:
                    System.out.println("Enter a name for the club");
                    String clubName = clubInput.nextLine();
                    a.setName(clubName);
                    System.out.println("Ok, here is your club:" + a);
                    break;

                case 2:
                    System.out.println("Here are all the runners");
                    System.out.println(Runner.readInRunners());
                    break;

                case 3:


                    int totalTime = 0;

                    for (Runner r : runners) {
                        totalTime = totalTime + r.getTime();

                    }

                    int averageTime = totalTime / runners.size();
                    System.out.println("The average time is: " + averageTime);
                    break;

                case 4:
                    int minValue = runners.get(0).getTime();

                    for (int i = 0; i < runners.size(); i++) {

                        if (runners.get(i).getTime() < minValue) {
                            minValue = runners.get(i).getTime();
                        }
                    }
                    System.out.println("The fastest time is: " + minValue);
                    break;

                case 5:
                    running = false;
            }


        }


    }

    public static void printMenu(){
        System.out.println("Choose a command");
        System.out.println("1 - Name the Club");
        System.out.println("2 - Print Out All Runners");
        System.out.println("3 - Print The Average Time");
        System.out.println("4 - Print Out the Fastest Time");
        System.out.println("5 - Exit");
    }
}
