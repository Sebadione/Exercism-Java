public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int production = speed * 221;

        if (0 < speed && speed < 5) {
            return production * 1.0;
        } else if (speed < 9) {
            return production * 0.9;
        }
        if (speed == 9) {
            return production * 0.8;
        }
        if (speed == 10) {
            return production * 0.77;
        }
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        double production = (double) (speed * 221) / 60;
        if (0 < speed && speed < 5) {
            return (int) production;
        } else if (speed < 9) {
            return (int) (production * 0.9);
        }
        if (speed == 9) {
            return (int) (production * 0.8);
        }
        if (speed == 10) {
            return (int) (production * 0.77);
        }
        return 0;
    }
}
