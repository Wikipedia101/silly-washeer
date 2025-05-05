import java.util.ArrayList;

public class Banner {
    double[] puuStats = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    Wishable puu = new Wishable("puu", 0, 3, 0, puuStats);

    protected Wishable limitedOne;
    protected Wishable normalOne;
    protected Wishable normalTwo;
    protected Wishable normalThree;

    public int pity;
    public int fourStarPity;

    protected int puuCount;

    public Banner(Wishable sporkle, Wishable uno, Wishable dos, Wishable tres) {
        limitedOne = sporkle;
        normalOne = uno;
        normalTwo = dos;
        normalThree = tres;
    }

    public Wishable pullOne() {        
        pity++;
        fourStarPity++;

        //GUARANTEED AT 80
        if (pity == 80) {
            pity = 0;
            fourStarPity = 0;
            return limitedOne;
        }

        //HARD PITY
        if (pity > 60) {
            //limited char chance
            if ((int)(Math.random() * 20) == 1) {
                fourStarPity = 0;
                pity = 0;
                return limitedOne;
            }
        }
        //GUARANTEED 4 STAR EVERY 10
        if (fourStarPity%10 == 0) {

            fourStarPity = 0;
            int x = (int)(Math.random()*31);
            if (x == 0) {
                pity = 0;
                return limitedOne;
            } else if (x >= 11 && x < 21) {
                return normalOne;
            } else if (x >= 21 && x < 31) {
                return normalTwo;
            } else {
                return normalThree;
            }
        }
        //SOFT PITY AND NO GUARANTEED 4 STAR
        else {
            //limited char chance
            if ((int)(Math.random() * 75) == 1) {
                pity = 0;
                fourStarPity = 0;
                return limitedOne;
            }
            //four star chance
            if ((int)(Math.random() * 50) == 1) {
                fourStarPity = 0;
                int x = (int)(Math.random()*30);
                if (x >= 10 && x < 20) {
                    return normalOne;
                } else if (x >= 20 && x < 30) {
                    return normalTwo;
                } else {
                    return normalThree;
                }
            }

        }
        puuCount++;
        return puu;
    }

    public ArrayList<Wishable> pullTen() {
        ArrayList<Wishable> result = new ArrayList<Wishable>();
        for (int i = 0; i < 10; i++) {
            Wishable temp = pullOne();
            //make sure 5* is first
            if (temp == limitedOne) {
                result.add(0, temp);
            
            //make sure 4* after 5*
            } else if (temp == normalOne || temp == normalTwo || temp == normalThree) {
                if (result.contains(puu)) {
                    result.add(result.indexOf(puu), temp);
                } else {
                    result.add(temp);
                }
            
            //add if is neither
            } else {
                result.add(temp);
            }
        }
        return result;
    }

    public int getPity() {
        return pity;
    }

    public int getPuuCount() {
        int temp = puuCount;
        puuCount = 0;
        return temp;
    }

}
