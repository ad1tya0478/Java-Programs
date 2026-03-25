import java.util.*;

public class learning {
    public static void main(String[] args) {
    
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal", 90);
        map.put("Aditya", 98);
        map.put("Abhi", 99);

        // System.out.println(map.get("Aditya"));
        // System.out.println(map.getOrDefault("Abhi", 63));
        // System.out.println(map.containsKey("Kunal"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(57);
        set.add(58);
        set.add(56);

        System.out.println(set);
    }    
}
