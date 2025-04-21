import java.util.LinkedHashSet;

public class LinkHas {
    public static void main(String args[]) {
        LinkedHashSet<String> ob = new LinkedHashSet<String>();
        LinkedHashSet<String> ob1 = new LinkedHashSet<String>();
        ob.add("Onkar");
        ob.add("Sanket");
        ob.add("Arun");
        ob.add("Saket");
        System.out.println("Add=" + ob);
        ob1.add("Tarun");
        ob1.add("Varun");
        ob1.add("Arun");
        System.out.println(ob1);
        ob.addAll(ob1);
        System.out.println(ob);
        // ob.removeAll(ob1);
        System.out.println(ob.contains("om"));
        ob.clear();
        System.out.println(ob);

    }
}
