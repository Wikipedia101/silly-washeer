public class Weapon extends Wishable{
    protected String character;

public Weapon(String name, int level, int rarity, int sequence, String character, double[] statBoost){
    super(name, level, rarity, sequence, statBoost); 
    this.character = character;
}

public String getCharacter(){
    return character;
} 

public void setCharacter(String c){
    character = c;
}



}
