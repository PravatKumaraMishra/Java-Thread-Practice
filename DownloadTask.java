public class DownloadTask implements Runnable {
    private DownloadStatus status = new DownloadStatus();

    public DownloadTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            status.incrementTotalBytes();
        }
    }
}
