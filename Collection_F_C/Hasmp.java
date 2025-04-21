import java.util.*;

public class Hasmp {
    public static void main(String[] args) {
        HashMap<String, Integer> ob = new HashMap<String, Integer>();
        ob.put("Onkar", 20);
        ob.put("Ramesh", 40);
        ob.put("Sanket", 10);
        ob.put("Arun", 80);
        System.out.println(ob);
        System.out.println(ob.get("Sanket"));
        System.out.println(ob.containsKey("Onkar"));
        System.out.println(ob.size());
        System.out.println(ob.isEmpty());
        ob.clear();
        System.out.println(ob);
    }
}
