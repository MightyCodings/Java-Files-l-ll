import java.util.*;
public class stack {
    public static void main(String args[]){
        Stack<String> ob = new Stack<String>();
        ob.push("Mango");
        ob.push("Chikku");
        ob.push("Banana");
        System.out.println(ob);
        ob.pop();
        System.out.println(ob);
        System.out.println(ob.peek());
        boolean b=ob.empty();
        System.out.println(b);
        int x = ob.search("peru");
        System.out.println(x);
        ob.clear();
        System.out.println(ob);


    }
    
}
