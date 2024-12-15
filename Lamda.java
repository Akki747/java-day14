public class Lamda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("I am new to Java");
        Thread t = new Thread(r); 
        t.start();
        System.out.println(t.isAlive()); 
    }
}