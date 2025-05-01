public class Weapon extends Wishable{
    protected String character;
    protected String weaponType;

public Weapon(String name, int level, int rarity, int sequence, double[] stats, String character, String weaponType){
    super(name, level, rarity, sequence, stats); 
    this.character = character;
    this.weaponType = weaponType;
}

public String getCharacter(){
    return character;
} 

public void setCharacter(String c){
    character = c;
}

public String getWeaponType(){
    return weaponType;
}




}
