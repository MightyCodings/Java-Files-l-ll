//Thread stop method.
class A extends Thread
{
        @SuppressWarnings("override")
        public void run()
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            
        }
}



public class stopMe 
{
      public static void main(String[] args) throws InterruptedException
      {
         A t1 = new A();
         A t2 = new A();
         t1.setName("Thrd1");
         t2.setName("Thrd2");
         t1.setPriority(4);
         t2.setPriority(7);
         t1.start();
         t2.start();    
      }
}
