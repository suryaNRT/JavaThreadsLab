class GoodMorningRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {

        GoodMorningRunnable gm = new GoodMorningRunnable();
        HelloRunnable hr = new HelloRunnable();
        WelcomeRunnable wr = new WelcomeRunnable();

        Thread t1 = new Thread(gm);
        Thread t2 = new Thread(hr);
        Thread t3 = new Thread(wr);

        t1.start();
        t2.start();
        t3.start();
    }
}