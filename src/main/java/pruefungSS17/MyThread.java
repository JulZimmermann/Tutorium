package pruefungSS17;

public class MyThread extends Thread {

    private String s;

    public MyThread(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(s);
    }
}
