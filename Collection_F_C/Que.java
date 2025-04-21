import java.util.*;
public class Que{
    public static void main(String args[]){
        PriorityQueue<String> ob = new PriorityQueue<String>();
        ob.add("Onkar");
        ob.add("Ramesh");
        ob.add("Sanket");
        ob.add("Arun");
        ob.add("Saket");
        System.out.println("Add="+ob);
        ob.remove();
        System.out.println(ob);
        ob.poll();
        System.out.println(ob);
    }
}