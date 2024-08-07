package multithreading;
class MyThread extends Thread
{ int total=0;
   public void run() {
	   synchronized(this) {
		   	System.out.println("child thread starts calculating total execution");
		   	for(int i=1;i<=50;i++) {
		   		total=total+i;
		   	}
		   	System.out.println("child thread giving notification call");
		   	this.notify();
		   	}
   }
}


public class Test {
   public static void main(String[]args) throws InterruptedException
   {
	   MyThread t1=new MyThread();
	   t1.start();
	   synchronized(t1) {
		   System.out.println("Main thread going to call wait method");
		   t1.wait();
		   System.out.println("Main method got notification call");
		   System.out.println("Total  :"+t1.total);
	   }
   }
}
