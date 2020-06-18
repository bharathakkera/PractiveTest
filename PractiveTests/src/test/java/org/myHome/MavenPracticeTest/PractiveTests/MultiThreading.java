package org.myHome.MavenPracticeTest.PractiveTests;

class abc implements Runnable{
	int i;
	public void run() {
		for(i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Hello1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class xyz implements Runnable{
	int i;
	public void run() {
		for(i=1;i<=5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		
		abc ab = new abc();
		xyz xy = new xyz();
		
		Thread t1 = new Thread(ab);
		Thread t2 = new Thread(xy);
		
		t1.start();
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
		t2.start();
				
		
		
	}

}
