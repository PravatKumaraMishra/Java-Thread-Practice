public class DownloadTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Downloading file: " + Thread.currentThread().getName());
    }

}
