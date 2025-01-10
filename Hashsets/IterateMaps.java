import java.util.HashMap;

public class IterateMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("yash", 21);
        map.put("sumit",16);
        map.put("hallu",75);
        //key pr iterate kar rahe
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key + " " + val); 
        }
        System.out.println();

        // for entry set
        for(Object pair:map.entrySet()){
            System.out.println(pair);
        }
    }
}
