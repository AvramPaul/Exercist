public class JedliksToyCar {
    public int meters = 0;
    public int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven "+meters+" meters";
    }

    public String batteryDisplay() {
        if(battery >= 1)
            return "Battery at "+battery+"%";
        return "Battery empty";
    }

    public void drive() {
        if(battery >= 1){
            meters += 20;
            battery -= 1;
        }
    }
}
