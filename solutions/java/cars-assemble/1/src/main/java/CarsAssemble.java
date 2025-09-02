public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if( 1 <= speed && speed <= 4){
            return  (double) speed * 221;   
        }
        if(5 <= speed && speed <= 8){
            return (double) 0.9 * speed * 221;
        }
                if(speed == 9){
            return (double) 0.8 * speed * 221;
        }
                if(speed == 10){
            return (double) 0.77 * speed * 221;
        }
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
