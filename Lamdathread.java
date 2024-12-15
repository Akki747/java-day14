public class Lamdathread {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("I am new to Java");
        Thread y = new Thread(r); 
        y.start(); 
    }
}