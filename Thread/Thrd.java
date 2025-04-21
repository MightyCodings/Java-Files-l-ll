//Thread Creation by Extending thread Class.
class A extends Thread {
   @SuppressWarnings("override")
   public void run() {
      for (int i = 1; i <= 5; i++) {
         System.out.println(i);
      }
   }
}

public class Thrd {
   public static void main(String[] args) {
      A t1 = new A();
      A t2 = new A();
      A t3 = new A();
      t1.start();
      t2.start();
      t3.start();
      for (int i = 1; i <= 5; i++) {
         System.out.println("Hello");
      }
   }
}