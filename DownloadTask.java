public class DownloadTask implements Runnable {
    private DownloadStatus status = new DownloadStatus();

    public DownloadTask(DownloadStatus status) {
        this.status = status;
    }

    public DownloadStatus getStatus() {
        return status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementTotalBytes();
        }
        status.done();
        System.out.println("Download Completed: " + Thread.currentThread().getName());
    }
}
