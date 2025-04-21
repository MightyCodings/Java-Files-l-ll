import java.util.*;
public class vec{
    public static void main(String args[]){
        Vector<String> ob = new Vector<String>();
        ob.add("January");
        ob.add("February");
        ob.add("March");
        ob.add("April");
        System.out.println(ob);
        System.out.println(ob.size());
        System.out.println(ob.capacity());
        System.out.println(ob.firstElement());
        System.out.println(ob.lastElement());
        System.out.println(ob.contains("July"));
        ob.clear();
        System.out.println(ob);

    }
}