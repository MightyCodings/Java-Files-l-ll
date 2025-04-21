//Thread join Method.


class A extends Thread
{
     @SuppressWarnings("override")
     public void run()
     {
        String n =Thread.currentThread().getName();
        for(int i=1;i<=5;i++)
        {
            System.out.println(n);
        }
     }    
}
public class joinMe 
{
     public static void main(String[] args) throws InterruptedException
    {
         A t1 = new A();
         A t2=new A();
         t1.setName("Thread1");
         t2.setName("Thread2");

         t2.start();
         t2.join();
         t1.start();

    }
}
