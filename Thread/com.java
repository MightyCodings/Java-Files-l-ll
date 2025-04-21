class A extends Thread
{
    int s=0;
    @SuppressWarnings("override")
    public void run()
    {
        synchronized (this)
        {
    
            for(int i=1;i<=10;i++)
            {
                s=s+i;
            }
            this.notify();
        }
    }
}

public class com {
    public static void main(String[] args) throws InterruptedException {
        A t1 = new A();
        // t1.start();
        synchronized (t1) 
        {
            t1.start();
           t1.wait();   
        }
        System.out.println("Sum:="+t1.s);
    }

}















