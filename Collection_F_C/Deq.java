import java.util.*;
public class Deq {
    public static void main(String args[]){
        ArrayDeque<String> ob = new ArrayDeque<String>();
        ob.add("Onkar");
        ob.add("Ramesh");
        ob.add("Sanket");
        ob.add("Arun");
        ob.add("Saket");
        System.out.println("Add="+ob);
        ob.offerFirst("om");
        ob.offerLast("Rutik");
        System.out.println(ob);
        ob.removeFirst();
        System.out.println(ob);
        ob.removeLast();
        System.out.println(ob);
    }
    
}
