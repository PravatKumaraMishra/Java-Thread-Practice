import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private Lock lock = new ReentrantLock();

    public void incrementTotalBytes() {
        lock.lock();
        try {
            totalBytes++;
        } finally {
            lock.unlock();
        }
    }

    public int getTotalBytes() {
        return totalBytes;
    }

}
