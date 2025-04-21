import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTaskExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("Task executed: " + System.currentTimeMillis());
            // Your task logic here
        };

        scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);

        // To stop the scheduler after some time:
        // scheduler.shutdown();
    }
    
}
