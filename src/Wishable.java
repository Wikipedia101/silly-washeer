public class Wishable {
    protected String name;
    protected int level;
    protected int rarity;
    protected int sequence;
    protected double[] stats = new double[6];
  
    //COLORSSSSSSSSSSS=============
    String five = "\u001B[33m";
    String four = "\u001B[35m";
    String three = "\u001B[34m";
    String reset = "\u001B[37m";

    //stat order: hp, atk, def, er, cr, cdmg
    public Wishable(String name, int level, int rarity, int sequence, double[] stats) {
      this.name = name;
      this.level = level;
      this.rarity = rarity;
      this.sequence = sequence;
      this.stats = stats;
    }
  
    public String printStats() {
      String result = "";
      String color = "";
      if (rarity == 5) {
        color = five;
      } else if (rarity == 4) {
        color = four;
      }
      //stat order: hp, atk, def, er, cr, cdmg

      result += color + "Name: " + name + " - Rarity: " + rarity + reset;
      result += ("\nsequence(copies obtained excluding original): " + sequence);
      result += ("\nStats: ");
      result += ("\n  HP: " + stats[0]);
      result += ("\n  ATK: " + stats[1]);
      result += ("\n  DEF: " + stats[2]);
      result += ("\n  Energy Regen: " + stats[3]);
      result += ("\n  Crit Rate: " + stats[4]);
      result += ("\n  Crit Dmg: " + stats[5]);

      return result;
    }

    public void addSequence() {
      sequence++;
    }

    //setters
    public void setName(String newName) {
      name = newName;
    }
  
    public void setLevel(int newLevel) {
      level = newLevel;
    }
  
    public void setRarity(int newRarity) {
      rarity = newRarity;
    }

    public void setSequence(int newSequence) {
      sequence = newSequence;
    }

    public void setStats(double[] newStats) {
      stats = newStats;
    }

    //getters
    public String getName() {
      return name;
    }
    
    public int getLevel() {
      return level;
    }

    public int getRarity() {
      return rarity;
    }

    public int getSequence() {
      return sequence;
    }

    public double[] getStats() {
      return stats;
    }
    

  }
  