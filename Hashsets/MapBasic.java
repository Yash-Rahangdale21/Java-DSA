import java.util.*;
public class MapBasic {
        public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("yash", 21);
        map.put("sumit",16);
        map.put("hallu",75);
        System.out.print(map + " " + map.size());
        System.out.println();
        System.out.println(map.containsKey("yash"));
        System.out.println(map.containsValue(75));
        map.put("yash",100);  // key same rahi to value override ho jati hai
        System.out.println(map);
        map.put("ansh",21);
        System.out.println(map);
        System.out.println(map.get("sumit"));
    }
}
