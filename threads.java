public class threads implements Runnable {

    Thread t;
    static int a, b;
    String n;
    threads(String n1, int a1, int b1){
        a = a1;
        b = b1;
        t = new Thread (this, n1);
        t.start();
    }
    
    
    @Override
    public void run() {
        System.out.print("Child Thread is Addition: " + (a+b)); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        threads t1 = new threads("Thread is ",10,5);
        System.out.println("Parent Thread is Subtraction: " + (a-b));
    }
}
