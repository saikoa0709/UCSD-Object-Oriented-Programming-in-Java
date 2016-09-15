package test;
import demos.Airport;
/**
 * Created by han on 8/31/16.
 */
public class M6_linear {
    public static String findAirportCode (String toFind, Airport[] airports) {
        for(int i = 0; i < airports.length; i++) {
            if(airports[i].getCity() == toFind) {
                return airports[i].getCode3();
            }
        }

        return null;
    }
}
