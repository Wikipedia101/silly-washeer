public class Resonator extends Wishable{
    private String element;
    private String weaponType;

    //COLORSSSSSSSSSSS=============
    String five = "\u001B[33m";
    String four = "\u001B[35m";
    String three = "\u001B[34m";
    String reset = "\u001B[37m";

    String havoc = "\u001b[35m";
    String aero = "\u001b[32m";
    String spectro = "\u001b[33m";
    String glacio = "\u001b[36m";
    String fusion = "\u001b[31m";
    String electro = "\u001b[35;1m";


    public Resonator(String name, int level, int rarity, int sequence, double[] stats, String element, String weaponType) {
        super(name, level, rarity, sequence, stats);
        this.element = element;
        this.weaponType = weaponType;
    }

    public String printStats() {
        String result = "";
        String rareColor = "";
        String eleColor = "";

        if (rarity == 5) {
        rareColor = five;
        } else if (rarity == 4) {
            rareColor = four;
        }

        if (element.equals("Havoc")) {
            eleColor = havoc;
        } else if (element.equals("Electro")) {
            eleColor = electro;
        } else if (element.equals("Fusion")) {
            eleColor = fusion;
        } else if (element.equals("Spectro")) {
            eleColor = spectro;
        } else if (element.equals("Glacio")) {
            eleColor = glacio;
        } else {
            eleColor = aero;
        }


        //stat order: hp, atk, def, er, cr, cdmg

        result += rareColor + "Name: " + name + " - Rarity: " + rarity + reset;
        result += ("\n" + eleColor + "element: " + element + reset);
        result += ("\nsequence(copies obtained excluding original): " + sequence);
        result += ("\nweapon type: " + weaponType);
        result += ("\nStats: ");
        result += ("\n  HP: " + stats[0]);
        result += ("\n  ATK: " + stats[1]);
        result += ("\n  DEF: " + stats[2]);
        result += ("\n  Energy Regen: " + stats[3]);
        result += ("\n  Crit Rate: " + stats[4]);
        result += ("\n  Crit Dmg: " + stats[5]);

        return result;
    }

    //getters
    public String getElement() {
        return element;
    }
    public String getWeaponType() {
        return weaponType;
    }
}
