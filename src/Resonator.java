public class Resonator extends Wishable{
    private String element;
    private String weaponType;

    public Resonator(String name, int level, int rarity, int sequence, double[] stats, String element, String weaponType) {
        super(name, level, rarity, sequence, stats);
        this.element = element;
        this.weaponType = weaponType;
    }

    //getters
    public String getElement() {
        return element;
    }
    public String getWeaponType() {
        return weaponType;
    }
}
