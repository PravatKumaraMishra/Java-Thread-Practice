public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private volatile boolean isDone;

    public int getTotalFiles() {
        return totalFiles;
    }

    public void setTotalFiles(int totalFiles) {
        this.totalFiles = totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        this.isDone = true;
    }

    public synchronized void incrementTotalBytes() {
        totalBytes++;
    }

    public int getTotalBytes() {
        return totalBytes;
    }
}
