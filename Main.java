public class Main {
    public static void main(String[] args) {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadTask(status));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
            }
            System.out.println("Total Bytes: " + status.getTotalBytes());
        });
        thread1.start();
        thread2.start();
    }
}
