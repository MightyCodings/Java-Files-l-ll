//Thread Syncronization 2)Syncronization Method.
class A extends Thread
{
   synchronized void print()
   {
    System.out.println(Thread.currentThread());
    for(int i=1;i<=5;i++)
    {
        System.out.println(i);
    }
   }
   @SuppressWarnings("override")
   public void run()
   {
    System.out.println("Hello");
    print();
   }
}

public class Ths{
    public static void main(String[] args)
    {
         A t1 = new A();
         A t2 = new A();
         t1.start();
         t2.start();
    }
}
