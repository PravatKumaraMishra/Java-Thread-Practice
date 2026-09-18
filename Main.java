public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new DownloadTask());
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("Main execution Completed");
    }
}
