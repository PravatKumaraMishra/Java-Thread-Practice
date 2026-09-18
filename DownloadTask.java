public class DownloadTask implements Runnable {
    private DownloadStatus status = new DownloadStatus();

    public DownloadStatus getStatus() {
        return status;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10000; i++) {
            status.incrementTotalBytes();
        }
    }
}
