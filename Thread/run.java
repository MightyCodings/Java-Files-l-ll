//Thread by runnable Interface.

class A implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class run {
    public static void main(String[] args) {
        A t = new A();
        Thread p = new Thread(t);
        Thread q = new Thread(t);
        p.start();
        q.start();
        System.out.println("Hello");
    }
}
