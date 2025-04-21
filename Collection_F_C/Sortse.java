import java.util.TreeSet;

public class Sortse {
    public static void main(String[] args) {
        TreeSet<String> ob = new TreeSet<String>();
        ob.add("Sunday");
        ob.add("Monday");
        ob.add("Tuesday");
        ob.add("Wednsday");
        System.out.println(ob);
        System.out.println(ob.descendingSet());
        System.out.println(ob.pollFirst());
        System.out.println(ob);
    }
}
