import java.util.*;
public class Alist {
    public static void main(String args[]){
        ArrayList<String> ob = new ArrayList<String>();
        ob.add("Onkar");
        ob.add("Ramesh");
        ob.add("Sanket");
        ob.add("Arun");
        ob.add("Saket");
        System.out.println("Add="+ob);
        ob.remove(3);
        System.out.println("After Remove="+ob);
        ob.set(0,"Samir");
        System.out.println("Set the Value="+ob);
        System.out.println("After Gating Value="+ob.get(3));
        ob.clear();
        System.out.println("After Clear="+ob);

    }
    
}
