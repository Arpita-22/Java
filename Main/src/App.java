//class Task{
//	void executeTask() {
//		System.out.println("execute task");
//	}


class Task extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("@@ run thread1" + " " + i);
		}
	}	
}

//Using Thread class

//public class App extends Thread {
 public class App{
	
//	public void run() {
//		for(int i = 0; i <= 10; i++) {
//			System.out.println("run thread1" +  i);
//		}


	//main method represents main thread
	public static void main(String[]args) {	

		//everything here would be executed by main thread
		//Threads always execute code in a sequence
		
		System.out.println("---App Started---");
		
		//main and my task are executing parallely and separately
		
		Task mytask = new Task();
//		mytask.executeTask();
		 mytask.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("$$ run thread2" + " " + i);
		}
		
//		App obj = new App();
		//start internally executes run method
//		obj.start();
		
		System.out.println("---App Finished---");
	}
	
}
 
		

//Using runnable interface because multiple inheritance not supported in java

//public class App implements Runnable {
//	
//	public void run() {
//		System.out.println("run thread");
//	}
//
//	public static void main(String[]args) {	
//		Runnable r = new App();
//        Thread obj = new Thread(r);
//        obj.start();
//		
//		Thread obj = new Thread(new App());
//		obj.start();
 
//     	Thread obj2 = new Thread(new Task2());
//		obj2.start();
//		
//		
//		
//	}
//	
//}
 
// class Task2 implements Runnable{
//		@Override
//		public void run() {
//			for(int i = 0; i <= 10; i++) {
//				System.out.println("@@ run thread1" + " " + i);
//			}
//		}	
//	}
 
//public class App{
//	
//	public void run() {
//		System.out.println("run thread");
//	}
//
//	public static void main(String[]args) {	
//		Runnable r = new App();
//     Thread obj = new Thread(r);
//     obj.start();
//		
//		Thread obj = new Thread(new App());
//		obj.start();

//  	Thread obj2 = new Thread(new Task2());
//		obj2.start();
//		
//		
//		
//	}
//	
//}



