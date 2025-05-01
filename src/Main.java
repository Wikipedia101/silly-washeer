import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        //stat order: hp, atk, def, er, cr, cdmg
        //public Wishable(String name, int level, int rarity, int sequence, double[] stats) {
    

        double[] puuStats = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        Wishable puu = new Wishable("puu", 0, 3, 0, puuStats);


        //RESONATORRSSSSSS========
            Resonator tempuu = new Resonator("uh", 0, 0, 0, puuStats, "havoc", "sword");


        //WEAPONSSSSSSSSSSS=======================================================================================================
            double[] FiveStarWep = {50.0, 100.0, 150.0, 200.0, 250.0, 300.0};

            Weapon abyssSurges = new Weapon("Abyss Surges", 1, 5, 0, FiveStarWep, "N/A", "Gauntlet");
            Weapon agesOfHarvest = new Weapon("Age of Harvest", 1, 5, 0, FiveStarWep, "Jinhsi", "Broadblade");
            Weapon blazingBrilliance = new Weapon("Blazing Brilliance", 1, 5, 0, FiveStarWep, "Changli", "Sword");
            Weapon bloodpactsPledge = new Weapon("Bloodpact's Pledge", 1, 5, 0, FiveStarWep, "Rover(Aero)", "Sword");
            Weapon cosmicRipples = new Weapon("Cosmic Ripples", 1, 5, 0, FiveStarWep, "N/A", "Rectifier");
            Weapon emeraldOfGenesis = new Weapon("Emerald of Genesis", 1, 5, 0, FiveStarWep, "N/A", "Sword");
            Weapon luminousHymn = new Weapon("Luminous Hymn", 1, 5, 0, FiveStarWep, "Phoebe", "Rectifier");
            Weapon lustrousRazor = new Weapon("Lustrous Razor", 1, 5, 0, FiveStarWep, "N/A", "Broadblade");
            Weapon redSpring = new Weapon("Red Spring", 1, 5, 0, FiveStarWep, "Camellya", "Sword");
            Weapon rimeDrapedSprouts = new Weapon("Rime-Draped Sprouts", 1, 5, 0, FiveStarWep, "Zhezhi", "Rectifier");
            Weapon staticMist = new Weapon("Static Mist", 1, 5, 0, FiveStarWep, "N/A", "Pistol");
            Weapon stellarSymphony = new Weapon("Stellar Symphony", 1, 5, 0, FiveStarWep, "Shorekeeper", "Rectifier");
            Weapon stringmaster = new Weapon("Stringmaster", 1, 5, 0, FiveStarWep, "Yinlin", "Rectifier");
            Weapon theLastDance = new Weapon("The Last Dance", 1, 5, 0, FiveStarWep, "Carlotta", "Pistol");
            Weapon tragicomedy = new Weapon("Tragicomedy", 1, 5, 0, FiveStarWep, "Roccia", "Gauntlet");
            Weapon unflickeringValor = new Weapon("Unflickering Valor", 1, 5, 0, FiveStarWep, "Brant", "Sword");
            Weapon verdantSummit = new Weapon("Verdant Summit", 1, 5, 0, FiveStarWep, "Jiyan", "Broadblade");
            Weapon veritysHandle = new Weapon("Verity's Handle", 1, 5, 0, FiveStarWep, "Xiangli Yao", "Gauntlet");
            Weapon whispersOfSirens = new Weapon("Whispers of Sirens", 1, 5, 0, FiveStarWep, "Cantarella", "Rectifier");
            
            /**
             *             ArrayList<Weapon> weaponList = new ArrayList<>(Arrays.asList(
            abyssSurges, agesOfHarvest, blazingBrilliance, bloodpactsPledge, cosmicRipples,
            emeraldOfGenesis, luminousHymn, lustrousRazor, redSpring, rimeDrapedSprouts,
            staticMist, stellarSymphony, stringmaster, theLastDance, tragicomedy,
            unflickeringValor, verdantSummit, veritysHandle, whispersOfSirens
            ));
             * 
             * 
             */




        int astriteCount = 0;
        int radiantTideCount = 0;
        int forgingTideCount = 0;
        ArrayList<Wishable> resonatorList = new ArrayList<Wishable>();
        ArrayList<Wishable> weaponList = new ArrayList<Wishable>();
        int puuCount = 0;

        int whaleCount = 3;

        boolean wannaQuit = false;
        boolean erase = false;

        Scanner scan = new Scanner(System.in);


        //intro
        System.out.println("Welcome to Silley Wisher! You can wish on banners to obtain characters and weapons.");
        System.out.println("What would you like to do?");
        
        while(!erase) {
            System.out.println("[1] wish");
            System.out.println("[2] see gallery");
            System.out.println("[3] check inventory");
            System.out.println("[4] whale");


            while (!wannaQuit) {

                String userInput = scan.nextLine();
                //check if they wanna quit
                if (userInput.equals("q")) {
                    wannaQuit = true;
                }
            
                //actions they can do
                
//BANNERRRR================================================================================================================================
                if (userInput.equals("1")) {
                    Banner currBanner;
                    Wishable fiveStarWishable = puu;
                    Wishable fourStarWishableOne = puu;
                    Wishable fourStarWishableTwo = puu;
                    Wishable fourStarWishableThree = puu;

                    System.out.println("\nWhich banner would you like to wish on?\n[1] Banner 1.0 pt 1: Jiyan\n[2] Banner 1.0 pt 2: Yinlin");
                    userInput = scan.nextLine();

                    while (true) {
                        if (userInput.equals("1")) {
                            fiveStarWishable = verdantSummit;
                            fourStarWishableOne = abyssSurges;
                            fourStarWishableTwo = cosmicRipples;
                            fourStarWishableThree = staticMist;
                            break;
                        } else if (userInput.equals("2")) {
                            fiveStarWishable = stringmaster;
                            fourStarWishableOne = abyssSurges;
                            fourStarWishableTwo = cosmicRipples;
                            fourStarWishableThree = staticMist;
                            break;
                        } else {
                            System.out.println("\nPlease choose a valid banner!\n[1] Banner 1.0 pt 1: Jiyan\n[2] Banner 1.0 pt 2: Yinlin");
                            userInput = scan.nextLine();
                        }
                    }
                    

                    currBanner = new Banner(fiveStarWishable, fourStarWishableOne, fourStarWishableTwo, fourStarWishableThree);

                    System.out.println("\nWould you like to wish x1 or x10?\n[1] x1\n[2] x10\n[3] exit");
                    userInput = scan.nextLine();

                    boolean wannaPull = true;

                    while (wannaPull) {
                        //if they wanna 1 pull
                        if (userInput.equals("1")) {
                            if (astriteCount >= 160) {
                                Wishable x = currBanner.pullOne();
                                System.out.println("You got: " + x.getName()+"\n");
                                if (x != puu) {
                                    if (x.getClass() == emeraldOfGenesis.getClass()) {
                                        weaponList.add(x);
                                    } else if (x.getClass() == tempuu.getClass()) {
                                        resonatorList.add(x);
                                    }
                                } else {
                                    puuCount++;
                                }
                            } else {
                                astriteCount = astriteCount - 160;

                                System.out.println("You do not have enought astrite for a x1 wish! (You need 160)\nCurrent astrite count: " + astriteCount + "\nTry going back to the main menu to whale.");
                            }
                        //if they wanna 10 pull
                        } else if (userInput.equals("2")) {
                            ArrayList<Wishable> yum = currBanner.pullTen();

                            if (astriteCount < 1600) {
                                System.out.println("You do not have enought astrite for a x10 wish! (You need 1600)\nCurrent astrite count: " + astriteCount + "\nTry going back to the main menu to whale.");
                            } else {
                                astriteCount = astriteCount - 1600;

                                if (yum.contains(fiveStarWishable)) {
                                    System.out.println("CONGRATS!!! YOU HAVE GOTTEN THE LIMITED ITEM :D");
                                }
                                System.out.print("You got: ");

                            int count = 0;
                            for (Wishable x: yum) {
                                if (x != puu) {
                                    if (x.getClass() == emeraldOfGenesis.getClass()) {
                                        weaponList.add(x);
                                    } else if (x.getClass() == tempuu.getClass()) {
                                        resonatorList.add(x);
                                    }
                                } else {
                                    puuCount++;
                                }

                                count++;
                                if (count == 10) {
                                    System.out.print("and " + x.getName());
                                } else {
                                    System.out.print(x.getName() + ", ");
                                }
                            }
                            System.out.println();
                            }
                        //if they wanna exit wishing menu
                        } else if (userInput.equals("3")) {
                            break;
                        } else {
                            System.out.println("Please choose either 1, 2, or 3");
                        }

                        System.out.println("\nDo you want to pull again?\n[1] x1\n[2] x10\n[3] no");
                        userInput = scan.nextLine();
                    }
                    
                    
                    whaleCount = 3;
                    System.out.println("\nEnter [m] to return to menu");
                
//GALLERY================================================================================================================================
                } else if (userInput.equals("2")) {

                    System.out.println("Resonators obtained: ");
                    if (resonatorList.size() == 0) {
                        System.out.println("[none]\nTry wishing on a resonator banner!");
                    } else {
                        for (Wishable resonator: resonatorList) {
                            System.out.println("***[" + resonator.getName() + "]***");
                        }
                    }

                    System.out.println("\nWeapons obtained: ");
                    if (weaponList.size() == 0) {
                        System.out.println("[none]\nTry wishing on a weapon banner!");
                    } else {
                        for (Wishable weapon: weaponList) {
                            System.out.println("***[" + weapon.getName() + "]***");
                        }
                    }

                    whaleCount = 3;
                    System.out.println("\nEnter [m] to return to menu");
                    
//INVENTORY================================================================================================================================
                } else if (userInput.equals("3")) {
                    System.out.println("You have:\n" + astriteCount + " astrite\n" + radiantTideCount + " radiant tides (character wishes)\n" + forgingTideCount + " forging tides (weapon wishes)");


                    whaleCount = 3;
                    System.out.println("\nEnter [m] to return to menu");

//WHALE================================================================================================================================
                } else if (userInput.equals("4")) {
                    if (whaleCount > 0) {
                        System.out.print("You have " + astriteCount + " astrite.....\n");
                        delay(750, "+  ");
                        delay(750, "  +  ");
                        delay(750, "  +  \n");
                        astriteCount += 14400;
                        System.out.println("You now have " + astriteCount + " astrite!");
                        whaleCount--;
                    } else {
                        System.out.println("You have whaled too much. Try choosing another action!");
                    }

                    System.out.println("\nPress [4] to whale again or enter [m] to return to menu");

//go to menu================================================================================================================================
                } else if (userInput.equals("m")) {
                    System.out.println("\n--------------------------------------------\n");
                    System.out.println("Menu:");
                    System.out.println("[1] wish");
                    System.out.println("[2] see gallery");
                    System.out.println("[3] check inventory");
                    System.out.println("[4] whale");
                } else {
                    System.out.println("Choose 1, 2, 3, 4, or m please! If you would like to quit enter q");
                }


            }

            String userInput = scan.nextLine();
            System.out.println("Are you sure you want to quit? All progress will be lost.\n[1] yes\n[2] no\n");
            if (userInput.equals("1")) {
                erase = true;
            }

        }
        
        //Scanner myObj = new Scanner(System.in);
        //System.out.println("Enter username");

        //String userName = myObj.nextLine();
        //System.out.println("Username is: " + userName);
    }

    public static void delay(int ms, String printz) {
        try {
            Thread.sleep(ms); // Pause for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(printz);
    }
}
