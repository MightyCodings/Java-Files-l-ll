import java.util.LinkedList;
public class link {
    public static void main(String[]args){
        LinkedList<String>ob = new LinkedList<String>();
        ob.add("Sunday");
        ob.add("Monday");
        ob.add("Tuesday");
        ob.add("Wednsday");
        ob.add("Thursday");
        ob.add("Friday");
        ob.add("Saturday");
        ob.add(3,"Ravi");
        System.out.println("After Adding the Element" + (ob));
        ob.addFirst(null);
        System.out.println(ob);
        ob.addLast("Suresh");
        System.out.println(ob);
        ob.clear();
        System.out.println(ob);
    }
    
}
