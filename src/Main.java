import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        int astriteCount = 0;
        int radiantTideCount = 0;
        int forgingTideCount = 0;
        ArrayList<String> resonatorList;

        boolean wannaQuit = false;

        Scanner scan = new Scanner(System.in);

        //intro
        System.out.println("Welcome to Silley Wisher! You can wish on banners to obtain characters and weapons.");
        System.out.println("What would you like to do?");
        
        while(true) {
            System.out.println("[1] see banners");
            System.out.println("[2] see gallery");
            System.out.println("[3] check inventory");
            System.out.println("[4] whale");

            String userInput = scan.nextLine();
            while (!wannaQuit) {
                //check if they wanna quit
                if (userInput.equals("q")) {
                    wannaQuit = true;
                }
            
                //actions they can do
                if (userInput.equals("1")) {
                    System.out.println("bannerrrrrrrrrrrrrrrrrrrrr");
                } else if (userInput.equals("2")) {
                    System.out.println("gallery");
                } else if (userInput.equals("3")) {
                    System.out.println("You have:\n" + astriteCount + " astrite\n" + radiantTideCount + " radiant tides (character wishes)\n" + forgingTideCount + " forging tides (weapon wishes)");
                } else if (userInput.equals("4")) {
                    System.out.print("You have " + astriteCount + " astrite.....");
                    delay(500, "+");
                    delay(500, "+");
                    delay(500, "+");
                } else {
                    System.out.println("Choose 1, 2, 3, or 4 please! If you would like to quit enter q");
                }

                System.out.println("What would you like to do next?");
                userInput = scan.nextLine();

            }

            wannaQuit = false;

        }
        
        //Scanner myObj = new Scanner(System.in);
        //System.out.println("Enter username");

        //String userName = myObj.nextLine();
        //System.out.println("Username is: " + userName);
    }

    public static void delay(int ms, String printz) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() { 
        @Override  
        public void run() {
            System.out.print(printz);
        }
        },  ms);
    }
}
