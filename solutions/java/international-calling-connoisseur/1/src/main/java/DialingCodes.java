import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    Map<Integer, String> dialingCodes = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!dialingCodes.containsKey(code) && !dialingCodes.containsValue(country))
            setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {
           return dialingCodes.entrySet()
                               .stream()
                               .filter(e -> e.getValue().equals(country))
                               .map(Map.Entry::getKey)
                               .findFirst()
                               .orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(dialingCodes.remove(findDialingCode(country)) != null)
            dialingCodes.put(code, country);
    }
}
