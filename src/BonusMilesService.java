public class BonusMilesService {
    public int calculate(int price) {
        int milesPerRuble = 20;
        int calculatedMiles = price / milesPerRuble;
        return calculatedMiles;
    }
}
