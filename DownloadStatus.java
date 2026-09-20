public class DownloadStatus {
    private int totalBytes;
    private Object incrementObject = new Object();

    public void incrementTotalBytes() {
        synchronized (incrementObject) {
            totalBytes++;
        }
    }

    public int getTotalBytes() {
        return totalBytes;
    }

}
