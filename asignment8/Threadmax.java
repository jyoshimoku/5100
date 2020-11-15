package hw8;

import java.util.ArrayList;
import java.util.List;


public class Threadmax {
	static void generateRandomArray(int[] arr){
		 
		 for(int i=0;i<arr.length;i++){
				arr[i]=(int)(Math.random()*100);
			 
			}
	 }
	
	 private static int threadNum = 4;
	 private static int avg = 10000;
	 
	 
	 
	 
	 
	 static int max(int[] arr) {
		 int max = 0;
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
			 if(list.get(i).getMax()>max) {
	            max = list.get(i).getMax();
			 }
	        }
	
		 } catch (InterruptedException e) {
            e.printStackTrace();
        }
		 return max;
	 }
	 public static void main(String[] args) {
	 int[] arr = new int[40000];
	 generateRandomArray(arr);
	 int max = max(arr);
	 System.out.println("Max: " + max);
	 
	 }
}

class MyThread extends Thread {
   public int max = 0;
   private int[] a;
   private int start;
   private int end;

   public int getMax() {
       return max;
   }

   public void setMax(int max) {
       this.max = max;
   }

   public MyThread(int[] a, int start, int end) {
       this.a = a;
       this.start = start;
       this.end = end;
   }

   @Override
   public void run() {
       for (int i = start; i < end; i++) {
    	   if(a[i]>max){
				max=a[i];
	}
   }
}
}
