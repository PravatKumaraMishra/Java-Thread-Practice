import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<>();
        List<DownloadTask> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            DownloadTask task = new DownloadTask();
            Thread thread = new Thread(task);
            tasks.add(task);
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        var totalBytes = tasks.stream().mapToInt(task -> task.getStatus().getTotalBytes()).sum();

        System.out.println("Total Bytes: " + totalBytes);
    }
}
