import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.Color;


public class Main {
    public static void main(String[] args) {
        //stat order: hp, atk, def, er, cr, cdmg
        //public Wishable(String name, int level, int rarity, int sequence, double[] stats) {
    

        double[] puuStats = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        Wishable puu = new Wishable("puu", 0, 3, 0, puuStats);

        //COLORSSSSSSSSSSS=============
        String five = "\u001B[33m";
        String four = "\u001B[35m";
        String three = "\u001B[34m";
        String reset = "\u001B[37m";


        //RESONATORRSSSSSS========
            double[] FiveStarChar = new double[] {750, 1500, 750, 100, 30, 200};
            double[] FourStarChar = new double[] {600, 1000, 600, 100, 20, 150};

            Resonator tempuu = new Resonator("uh", 0, 0, 0, puuStats, "havoc", "sword");

            Resonator Brant = new Resonator("Brant", 1, 5, 0, FiveStarChar, "Fusion", "Sword");
            Resonator Calcharo = new Resonator("Calcharo", 1, 5, 0, FiveStarChar, "Electro", "Broadblade");
            Resonator Camellya = new Resonator("Camellya", 1, 5, 0, FiveStarChar, "Havoc", "Sword");
            Resonator Cantarella = new Resonator("Cantarella", 1, 5, 0, FiveStarChar, "Havoc", "Rectifier");
            Resonator Carlotta = new Resonator("Carlotta", 1, 5, 0, FiveStarChar, "Glacio", "Pistol");
            Resonator Changli = new Resonator("Changli", 1, 5, 0, FiveStarChar, "Fusion", "Sword");
            Resonator Encore = new Resonator("Encore", 1, 5, 0, FiveStarChar, "Fusion", "Rectifier");
            Resonator Jianxin = new Resonator("Jianxin", 1, 5, 0, FiveStarChar, "Aero", "Gauntlet");
            Resonator Jinhsi = new Resonator("Jinhsi", 1, 5, 0, FiveStarChar, "Spectro", "Broadblade");
            Resonator Jiyan = new Resonator("Jiyan", 1, 5, 0, FiveStarChar, "Aero", "Broadblade");
            Resonator Lingyang = new Resonator("Lingyang", 1, 5, 0, FiveStarChar, "Glacio", "Gauntlet");
            Resonator Phoebe = new Resonator("Phoebe", 1, 5, 0, FiveStarChar, "Spectro", "Rectifier");
            Resonator Roccia = new Resonator("Roccia", 1, 5, 0, FiveStarChar, "Havoc", "Gauntlet");
            Resonator Shorekeeper = new Resonator("Shorekeeper", 1, 5, 0, FiveStarChar, "Spectro", "Rectifier");
            Resonator Verina = new Resonator("Verina", 1, 5, 0, FiveStarChar, "Spectro", "Rectifier");
            Resonator XiangliYao = new Resonator("Xiangli Yao", 1, 5, 0, FiveStarChar, "Electro", "Gauntlet");
            Resonator Yinlin = new Resonator("Yinlin", 1, 5, 0, FiveStarChar, "Electro", "Rectifier");
            Resonator Zani = new Resonator("Zani", 1, 5, 0, FiveStarChar, "Spectro", "Gauntlet");
            Resonator Zhezhi = new Resonator("Zhezhi", 1, 5, 0, FiveStarChar, "Glacio", "Rectifier");

            // 4★ Resonators
            Resonator Aalto = new Resonator("Aalto", 1, 4, 0, FourStarChar, "Aero", "Pistol");
            Resonator Baizhi = new Resonator("Baizhi", 1, 4, 0, FourStarChar, "Glacio", "Rectifier");
            Resonator Chixia = new Resonator("Chixia", 1, 4, 0, FourStarChar, "Fusion", "Pistol");
            Resonator Danjin = new Resonator("Danjin", 1, 4, 0, FourStarChar, "Havoc", "Sword");
            Resonator Lumi = new Resonator("Lumi", 1, 4, 0, FourStarChar, "Electro", "Broadblade");
            Resonator Mortefi = new Resonator("Mortefi", 1, 4, 0, FourStarChar, "Fusion", "Pistol");
            Resonator Sanhua = new Resonator("Sanhua", 1, 4, 0, FourStarChar, "Glacio", "Sword");
            Resonator Taoqi = new Resonator("Taoqi", 1, 4, 0, FourStarChar, "Havoc", "Broadblade");
            Resonator Yangyang = new Resonator("Yangyang", 1, 4, 0, FourStarChar, "Aero", "Sword");
            Resonator Youhu = new Resonator("Youhu", 1, 4, 0, FourStarChar, "Glacio", "Gauntlet");
            Resonator Yuanwu = new Resonator("Yuanwu", 1, 4, 0, FourStarChar, "Electro", "Gauntlet");


        //WEAPONSSSSSSSSSSS=======================================================================================================
            double[] FiveStarWep = {50.0, 100.0, 150.0, 200.0, 250.0, 300.0};
            double[] FourStarWep = new double[] {100, 400, 100, 0, 15, 30};

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
            
            //4 stars
            Weapon broadblade41 = new Weapon("Broadblade#41", 1, 4, 0, FourStarWep, "N/A", "Broadblade");
            Weapon waningRedshift = new Weapon("Waning Redshift", 1, 4, 0, FourStarWep, "N/A", "Broadblade");
            Weapon meditationsOnMercy = new Weapon("Meditations on Mercy", 1, 4, 0, FourStarWep, "N/A", "Broadblade");
            Weapon autumntrace = new Weapon("Autumntrace", 1, 4, 0, FourStarWep, "N/A", "Broadblade");
            Weapon dauntlessEvernight = new Weapon("Dauntless Evernight", 1, 4, 0, FourStarWep, "N/A", "Broadblade");
            Weapon discord = new Weapon("Discord", 1, 4, 0, FourStarWep, "N/A", "Broadblade");
            Weapon heliosCleaver = new Weapon("Helios Cleaver", 1, 4, 0, FourStarWep, "N/A", "Broadblade");

            Weapon gauntlets21D = new Weapon("Gauntlets#21D", 1, 4, 0, FourStarWep, "N/A", "Gauntlet");
            Weapon legendOfDrunkenHero = new Weapon("Legend of Drunken Hero", 1, 4, 0, FourStarWep, "N/A", "Gauntlet");
            Weapon celestialSpiral = new Weapon("Celestial Spiral", 1, 4, 0, FourStarWep, "N/A", "Gauntlet");
            Weapon stonard = new Weapon("Stonard", 1, 4, 0, FourStarWep, "N/A", "Gauntlet");
            Weapon marcato = new Weapon("Marcato", 1, 4, 0, FourStarWep, "N/A", "Gauntlet");
            Weapon hollowMirage = new Weapon("Hollow Mirage", 1, 4, 0, FourStarWep, "N/A", "Gauntlet");
            Weapon amityAccord = new Weapon("Amity Accord", 1, 4, 0, FourStarWep, "N/A", "Gauntlet");

            Weapon pistols26 = new Weapon("Pistols#26", 1, 4, 0, FourStarWep, "N/A", "Pistol");
            Weapon relativisticJet = new Weapon("Relativistic Jet", 1, 4, 0, FourStarWep, "N/A", "Pistol");
            Weapon cadenza = new Weapon("Cadenza", 1, 4, 0, FourStarWep, "N/A", "Pistol");
            Weapon novaburst = new Weapon("Novaburst", 1, 4, 0, FourStarWep, "N/A", "Pistol");
            Weapon thunderbolt = new Weapon("Thunderbolt", 1, 4, 0, FourStarWep, "N/A", "Pistol");
            Weapon undyingFlame = new Weapon("Undying Flame", 1, 4, 0, FourStarWep, "N/A", "Pistol");
            Weapon romanceInFarewell = new Weapon("Romance in Farewell", 1, 4, 0, FourStarWep, "N/A", "Pistol");

            Weapon fusionAccretion = new Weapon("Fusion Accretion", 1, 4, 0, FourStarWep, "N/A", "Rectifier");
            Weapon waltzInMasquerade = new Weapon("Waltz in Masquerade", 1, 4, 0, FourStarWep, "N/A", "Rectifier");
            Weapon callOfTheAbyss = new Weapon("Call of the Abyss", 1, 4, 0, FourStarWep, "N/A", "Rectifier");
            Weapon oceansGift = new Weapon("Ocean's Gift", 1, 4, 0, FourStarWep, "N/A", "Rectifier");
            Weapon rectifier25 = new Weapon("Rectifier#25", 1, 4, 0, FourStarWep, "N/A", "Rectifier");
            Weapon augment = new Weapon("Augment", 1, 4, 0, FourStarWep, "N/A", "Rectifier");
            Weapon cometFlare = new Weapon("Comet Flare", 1, 4, 0, FourStarWep, "N/A", "Rectifier");
            Weapon jinzhouKeeper = new Weapon("Jinzhou Keeper", 1, 4, 0, FourStarWep, "N/A", "Rectifier");
            Weapon variation = new Weapon("Variation", 1, 4, 0, FourStarWep, "N/A", "Rectifier");

            Weapon endlessCollapse = new Weapon("Endless Collapse", 1, 4, 0, FourStarWep, "N/A", "Sword");
            Weapon sword18 = new Weapon("Sword#18", 1, 4, 0, FourStarWep, "N/A", "Sword");
            Weapon somnoireAnchor = new Weapon("Somnoire Anchor", 1, 4, 0, FourStarWep, "N/A", "Sword");
            Weapon fablesOfWisdom = new Weapon("Fables of Wisdom", 1, 4, 0, FourStarWep, "N/A", "Sword");
            Weapon commandoOfConviction = new Weapon("Commando of Conviction", 1, 4, 0, FourStarWep, "N/A", "Sword");
            Weapon lumingloss = new Weapon("Lumingloss", 1, 4, 0, FourStarWep, "N/A", "Sword");
            Weapon lunarCutter = new Weapon("Lunar Cutter", 1, 4, 0, FourStarWep, "N/A", "Sword");
            Weapon overture = new Weapon("Overture", 1, 4, 0, FourStarWep, "N/A", "Sword");



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
                    String bannerType = "";

                    System.out.println("\nWould you like to wish on a resonator (character) banner or a weapon banner?\n[1] Resonator\n[2] Weapon");
                    userInput = scan.nextLine();

                    while (true) {
                        if (userInput.equals("1")) {
                            bannerType = "resonator";
                            break;
                        } else if (userInput.equals("2")) {
                            bannerType = "weapon";
                            break;
                        } else {
                            System.out.println("Please choose 1 or 2!");
                            userInput = scan.nextLine();
                        }
                    }

    //RESONATOR BANNERS=========================================================================================
                    if (bannerType.equals("resonator")) {
                        System.out.println("\nWhich banner would you like to wish on?");
                        System.out.println("[1] Banner 1.0 pt 1: Jiyan");
                        System.out.println("[2] Banner 1.0 pt 2: Yinlin");
                        System.out.println("[3] Banner 1.1 pt 1: Jinhsi");
                        System.out.println("[4] Banner 1.1 pt 2: Changli");
                        System.out.println("[5] Banner 1.2 pt 1: Zhezhi");
                        System.out.println("[6] Banner 1.2 pt 2: Xiangli Yao");
                        System.out.println("[7] Banner 1.3 pt 1: Shorekeeper");
                        System.out.println("[8] Banner 1.3 pt 2: Jiyan");
                        System.out.println("[9] Banner 1.4 pt 1: Camellya");
                        System.out.println("[10] Banner 1.4 pt 2: Yinlin");
                        System.out.println("[11] Banner 1.4 pt 3: Xiangli Yao");
                        System.out.println("[12] Banner 2.0 pt 1: Carlotta");
                        System.out.println("[13] Banner 2.0 pt 2: Zhezhi");
                        System.out.println("[14] Banner 2.0 pt 3: Roccia");
                        System.out.println("[15] Banner 2.0 pt 4: Jinhsi");
                        System.out.println("[16] Banner 2.1 pt 1: Phoebe");
                        System.out.println("[17] Banner 2.1 pt 2: Brant");
                        System.out.println("[18] Banner 2.1 pt 3: Changli");
                        System.out.println("[19] Banner 2.2 pt 1: Cantarella");
                        System.out.println("[20] Banner 2.2 pt 2: Camellya");
                        System.out.println("[21] Banner 2.2 pt 3: Shorekeeper");
                        userInput = scan.nextLine();

                        while (true) {
                            if (userInput.equals("1")) {
                                fiveStarWishable = Jiyan;
                                fourStarWishableOne = Danjin;
                                fourStarWishableTwo = Chixia;
                                fourStarWishableThree = Mortefi;
                                break;
                            } else if (userInput.equals("2")) {
                                fiveStarWishable = Yinlin;
                                fourStarWishableOne = Taoqi;
                                fourStarWishableTwo = Aalto;
                                fourStarWishableThree = Yuanwu;
                                break;
                            } else if (userInput.equals("3")) {
                                fiveStarWishable = Jinhsi;
                                fourStarWishableOne = Yangyang;
                                fourStarWishableTwo = Sanhua;
                                fourStarWishableThree = Danjin;
                                break;
                            } else if (userInput.equals("4")) {
                                fiveStarWishable = Changli;
                                fourStarWishableOne = Mortefi;
                                fourStarWishableTwo = Baizhi;
                                fourStarWishableThree = Taoqi;
                                break;
                            } else if (userInput.equals("5")) {
                                fiveStarWishable = Zhezhi;
                                fourStarWishableOne = Chixia;
                                fourStarWishableTwo = Sanhua;
                                fourStarWishableThree = Baizhi;
                                break;
                            } else if (userInput.equals("6")) {
                                fiveStarWishable = XiangliYao;
                                fourStarWishableOne = Aalto;
                                fourStarWishableTwo = Yuanwu;
                                fourStarWishableThree = Danjin;
                                break;
                            } else if (userInput.equals("7")) {
                                fiveStarWishable = Shorekeeper;
                                fourStarWishableOne = Taoqi;
                                fourStarWishableTwo = Yangyang;
                                fourStarWishableThree = Chixia;
                                break;
                            } else if (userInput.equals("8")) {
                                fiveStarWishable = Jiyan;
                                fourStarWishableOne = Youhu;
                                fourStarWishableTwo = Sanhua;
                                fourStarWishableThree = Mortefi;
                                break;
                            } else if (userInput.equals("9")) {
                                fiveStarWishable = Camellya;
                                fourStarWishableOne = Aalto;
                                fourStarWishableTwo = Yangyang;
                                fourStarWishableThree = Danjin;
                                break;
                            } else if (userInput.equals("10")) {
                                fiveStarWishable = Yinlin;
                                fourStarWishableOne = Yuanwu;
                                fourStarWishableTwo = Baizhi;
                                fourStarWishableThree = Lumi;
                                break;
                            } else if (userInput.equals("11")) {
                                fiveStarWishable = XiangliYao;
                                fourStarWishableOne = Yuanwu;
                                fourStarWishableTwo = Baizhi;
                                fourStarWishableThree = Lumi;
                                break;
                            } else if (userInput.equals("12")) {
                                fiveStarWishable = Carlotta;
                                fourStarWishableOne = Chixia;
                                fourStarWishableTwo = Mortefi;
                                fourStarWishableThree = Sanhua;
                                break;
                            } else if (userInput.equals("13")) {
                                fiveStarWishable = Zhezhi;
                                fourStarWishableOne = Chixia;
                                fourStarWishableTwo = Mortefi;
                                fourStarWishableThree = Sanhua;
                                break;
                            } else if (userInput.equals("14")) {
                                fiveStarWishable = Roccia;
                                fourStarWishableOne = Yuanwu;
                                fourStarWishableTwo = Danjin;
                                fourStarWishableThree = Youhu;
                                break;
                            } else if (userInput.equals("15")) {
                                fiveStarWishable = Jinhsi;
                                fourStarWishableOne = Yuanwu;
                                fourStarWishableTwo = Danjin;
                                fourStarWishableThree = Youhu;
                                break;
                            } else if (userInput.equals("16")) {
                                fiveStarWishable = Phoebe;
                                fourStarWishableOne = Aalto;
                                fourStarWishableTwo = Chixia;
                                fourStarWishableThree = Lumi;
                                break;
                            } else if (userInput.equals("17")) {
                                fiveStarWishable = Brant;
                                fourStarWishableOne = Mortefi;
                                fourStarWishableTwo = Taoqi;
                                fourStarWishableThree = Youhu;
                                break;
                            } else if (userInput.equals("18")) {
                                fiveStarWishable = Changli;
                                fourStarWishableOne = Mortefi;
                                fourStarWishableTwo = Taoqi;
                                fourStarWishableThree = Youhu;
                                break;
                            } else if (userInput.equals("19")) {
                                fiveStarWishable = Cantarella;
                                fourStarWishableOne = Yuanwu;
                                fourStarWishableTwo = Chixia;
                                fourStarWishableThree = Danjin;
                                break;
                            } else if (userInput.equals("20")) {
                                fiveStarWishable = Camellya;
                                fourStarWishableOne = Yuanwu;
                                fourStarWishableTwo = Chixia;
                                fourStarWishableThree = Danjin;
                                break;
                            } else if (userInput.equals("21")) {
                                fiveStarWishable = Shorekeeper;
                                fourStarWishableOne = Aalto;
                                fourStarWishableTwo = Sanhua;
                                fourStarWishableThree = Baizhi;
                                break;
                            } else {
                                System.out.println("\nPlease choose a valid banner!\n[1] Banner 1.0 pt 1: Jiyan\n[2] Banner 1.0 pt 2: Yinlin");
                                userInput = scan.nextLine();
                            }
                        }

    //WEAPON BANNERS=========================================================================================
                    } else {
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
                    }

                    currBanner = new Banner(fiveStarWishable, fourStarWishableOne, fourStarWishableTwo, fourStarWishableThree);

                    System.out.println("\nWould you like to wish x1 or x10?\n[1] x1\n[2] x10\n[3] exit");
                    userInput = scan.nextLine();

                    boolean wannaPull = true;

                    while (wannaPull) {
                        //if they wanna 1 pull
                        if (userInput.equals("1")) {
                            if (astriteCount >= 160) {
                                astriteCount = astriteCount - 160;
                                String color;

                                Wishable x = currBanner.pullOne();
                                if (x.getRarity() == 5) {
                                    color = five;
                                }  else if (x.getRarity() == 4) {
                                    color = four; 
                                } else {
                                    color = three;
                                }
                                if (!x.getName().equals("puu")) {
                                    //if what you pulled was a weapon
                                    if (x.getClass() == emeraldOfGenesis.getClass()) {
                                        if (weaponList.contains(x)) {
                                            weaponList.get(weaponList.indexOf(x)).addSequence();
                                        } else {
                                           weaponList.add(x);
                                        }

                                    //if what you pulled was a resonator
                                    } else if (x.getClass() == tempuu.getClass()) {
                                        if (resonatorList.contains(x)) {
                                            resonatorList.get(resonatorList.indexOf(x)).addSequence();
                                        } else {
                                           resonatorList.add(x);
                                        }                                    
                                    }
                                } else {
                                    puuCount++;
                                }

                                System.out.println("You got: " + color + x.getName() + reset + "\n");

                            } else {
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
                                    //set color
                                    String color;
                                    if (x.getRarity() == 5) {
                                        color = five;
                                    }  else if (x.getRarity() == 4) {
                                        color = four; 
                                    } else {
                                        color = three;
                                    }

                        //add to list/add sequence
                                    if (!x.getName().equals("puu")) {
                                    //if what you pulled was a weapon
                                        if (x.getClass() == emeraldOfGenesis.getClass()) {
                                            if (weaponList.contains(x)) {
                                                weaponList.get(weaponList.indexOf(x)).addSequence();
                                            } else {
                                            weaponList.add(x);
                                            }

                                        //if what you pulled was a resonator
                                        } else if (x.getClass() == tempuu.getClass()) {
                                            if (resonatorList.contains(x)) {
                                                resonatorList.get(resonatorList.indexOf(x)).addSequence();
                                            } else {
                                            resonatorList.add(x);
                                            }                                    }
                                    } else {
                                        puuCount++;
                                    }

                                    //print out what u got
                                    count++;
                                    if (count == 10) {
                                        System.out.print("and " + color + x.getName() + reset);
                                    } else {
                                        System.out.print(color + x.getName() + reset + ", ");
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

                    System.out.println("\nResonators obtained: ");
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

                    System.out.println("Your puu count is: " + puuCount);

                    whaleCount = 3;
                    System.out.println("\nEnter [m] to return to menu");
                    
//INVENTORY================================================================================================================================
                } else if (userInput.equals("3")) {
                    System.out.println("You have: " + astriteCount + " astrite!");


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
