import java.util.*;
public class S_E_T {
    public static void main(String args[]){
        HashSet<String> ob = new HashSet<String>();
        ob.add("Onkar");
        ob.add("Sanket");
        ob.add("Arun");
        ob.add("Saket");
        System.out.println("Add="+ob);
        ob.removeAll(ob);

    }
    
}
