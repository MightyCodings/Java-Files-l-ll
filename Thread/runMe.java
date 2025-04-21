//Thread Sleep method.

class A extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    } 
}

public class runMe {
    public static void main(String[] args) throws InterruptedException {
        A t1 = new A();
        A t2 = new A();
        t1.start();
        t2.start();
        for (int i = 1; i <= 5; i++) 
        {
            try{
            System.out.println("Hello");
            Thread.sleep(2000);
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
