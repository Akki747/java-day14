class A implements Runnable {
    public void run() {
        System.out.println("Hii, I'm Akshaya");
    }
}

public class runnablethread {
    public static void main(String[] args) {
        A r = new A();
        Thread t = new Thread(r);
        t.start();  // Starting the thread
    }
}