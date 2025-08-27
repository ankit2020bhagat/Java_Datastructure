package java_datastructure.hashMap;

import java.util.HashMap;;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String,String>();
        capitalCities.put("India","New Delhi" );
        capitalCities.put("England", "London");
         capitalCities.put("Austria", "Wien");
         System.out.println(capitalCities);
         System.out.println(capitalCities.get("India"));
         System.out.println(capitalCities.size());
         System.out.println(capitalCities.keySet());
    }
}
