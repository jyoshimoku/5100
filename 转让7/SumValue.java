package hw7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumValue {
	/*generate array of random numbers*/
	 static void generateRandomArray(int[] arr){
		 
		 for(int i=0;i<arr.length;i++){
				arr[i]=(int)(Math.random()*100);
			 
			}
	 }
	 /*get sum of an array using 4 threads*/
	 private static int threadNum = 4;
	 private static int avg = 1000000;
	 
	 
	 
	 
	 
	 static long sum(int[] arr) {
		 long sum = 0L;
		 List<MyThread> list = new ArrayList<MyThread>();
		 try {
		 for (int i = 0; i < threadNum; i++) {
	            MyThread m = new MyThread(arr, i * avg, (i + 1) * avg);
	            m.start();
	            list.add(m);
	        }
		 for (int i = 0; i < list.size(); i++) {
	            list.get(i).join();
	        }
		 for (int i = 0; i < list.size(); i++) {
	            sum += list.get(i).getSum();
	        }
	
		 } catch (InterruptedException e) {
             e.printStackTrace();
         }
		 return sum;
	 }
	 public static void main(String[] args) {
	 int[] arr = new int[4000000];
	 generateRandomArray(arr);
	 long sum = sum(arr);
	 System.out.println("Sum: " + sum);
	 
	 }
}

class MyThread extends Thread {
    public int sum = 0;
    private int[] a;
    private int start;
    private int end;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public MyThread(int[] a, int start, int end) {
        this.a = a;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        while (start < end) {
            sum += a[start];
            start++;
        }
    }

}