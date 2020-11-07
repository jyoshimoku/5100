package hw7;

public class ReverseHello extends Thread{

	private static int seq = 1;

    @Override
    public void run() {
        if (seq <= 50) {
            Thread r = new Thread(new ReverseHello(), "Thread" + seq++);
            r.start();
            try {
                r.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("hello from " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new ReverseHello(), "Thread" + seq).start();
    }
	
	
	
	
	
	
	
}
