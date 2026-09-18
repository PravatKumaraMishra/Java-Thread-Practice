public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadTask());
            thread.start();
            try {
                thread.join();
                System.out.println("file is ready for scanning");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main execution Completed");
    }
}
