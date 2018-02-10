package termin24Januar18.thread;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();

        for(int i = 0; i < 1000; i++) {
            System.out.println(i);
            Thread.sleep(200);
        }

    }

}
