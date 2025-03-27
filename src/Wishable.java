public class Wishable {
    protected String name;
    protected int level;
    protected int rarity;
    protected int sequence;
    protected double[] stats = new double[6];
  
    public Wishable(String name, int level, int rarity, int sequence, double[] stats) {
      this.name = name;
      this.level = level;
      this.rarity = rarity;
      this.sequence = sequence;
      this.stats = stats;
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
  