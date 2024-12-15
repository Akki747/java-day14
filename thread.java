//extending thread class
class a extends Thread{
    public void r()
    {
        System.out.println("Hii i am thread");
    }
}
public class thread {
    public static void main(String[]args)
    {
        a g=new a();
        g.r();
        g.start();
    }
}